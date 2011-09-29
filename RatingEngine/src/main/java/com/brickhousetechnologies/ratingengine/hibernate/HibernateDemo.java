package com.brickhousetechnologies.ratingengine.hibernate;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.brickhousetechnologies.ratingengine.hibernate.domain.*;
import com.brickhousetechnologies.ratingengine.hibernate.util.HibernateUtil;




public class HibernateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Session session = HibernateUtil.getSessionFactory();
	        session.beginTransaction();
	        
	        try {
					
				ProductInfo[] a1 = new ProductInfo[]{new ProductInfo(100, 1000), 
						new ProductInfo(50, 700), new ProductInfo(70, 300)};
				
				//Estes2011v500 estes = new Estes2011v500(session,"23452", "27824", 100);
				ODBL2011 estes = new ODBL2011(session,"23452", "27824");
				
				
				estes.setProducts(a1);
				estes.calcRate();
				debug("Correct total: " + estes.getCorrectTotal());
					
				

	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}
	
	public static ProductInfo[] getRatesInformation (Session session, String fromZip, String toZip, int[] weight, String[] classGroup) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		
		int[] rate = new int[classGroup.length];
		int[] deficitRate = new int [classGroup.length + 1];
				
		int weightTotal = 0;
		
		for(int i = 0; i < weight.length; i++)
			weightTotal += weight[i];
		
			debug("WeightTotal: " + weightTotal );
			debug(RatingUtil.getLowestClass(classGroup));
		
		
		//gets the matrix row based on the from zip and to zip
		Estes2011v500Matrix matrixRow = (Estes2011v500Matrix)session.createQuery("from Estes2011v500Matrix  where Origin = ? and Destination = ?")
        		.setString(0,  fromZip.substring(0,3))
        		.setString(1,  toZip.substring(0,3))
        		.uniqueResult();
		
		//gets the rates row based on the RBn returned from the matrix row
		Estes2011v500Rates rateRow = (Estes2011v500Rates) session.createQuery("from Estes2011v500Rates  where RBN = ?")
        		.setInteger(0,  matrixRow.getRBN())
        		.uniqueResult();
		
		int rateAmount = (Integer)(rateRow.getClass().getMethod("get"+ RatingUtil.weightCode(weightTotal))).invoke(rateRow);
		int deficitRateAmount =(Integer)(rateRow.getClass().getMethod("get"+ RatingUtil.nextWeightCode(weightTotal))).invoke(rateRow);
		int minRate = rateRow.getMinCharge();
		
		debug("rate= " + rateAmount);
		debug("deficitRate= " + deficitRateAmount);
		
		//gets the factors based on the weight code from the total weight and the factor ID from the rates row
		Estes2011v500Factor factorRow = (Estes2011v500Factor) session.createQuery("from Estes2011v500Factor  where WeightGroup = ? and FactorTable = ?")
    		.setString(0,  RatingUtil.weightCode(weightTotal))
    		.setInteger(1,  rateRow.getFactorTable())
    		.uniqueResult();
	
		for(int i = 0; i < classGroup.length; i++){
			
			int factor = (Integer)(factorRow.getClass().getMethod("getClass"+ classGroup[i])).invoke(factorRow);
	
			debug("factor = " + factor);
			
			//since Estes rounds up and int rounds down, adding 5000 will be the equivalent
			// to adding up
			// if the decimal is 5 or greater it will go to the next dollar and be truncated
			//if the decimal is less then 5 will stay at the same dollar and be truncated
			rate[i] = (rateAmount * factor + 5000) / 10000;
			
			debug("rate after factor= " + rate[i]);

			//deficit rate
			debug("deficitFactor = " + factor);
			
			deficitRate[i] = (deficitRateAmount * factor + 5000) / 10000;
			
			debug("deficitRate= " + deficitRate[i]);

		}
		int deficitFactor =(Integer)(factorRow.getClass().getMethod("getClass"+ RatingUtil.getLowestClass(classGroup))).invoke(factorRow);
		
		deficitRate[deficitRate.length - 1] = (deficitRateAmount * deficitFactor + 5000) / 10000;
		
		Estes2011v500Lane laneRow = (Estes2011v500Lane) session.createQuery("from Estes2011v500Lane  where FromLow <= ? and FromHigh >= ? and ToLow <= ? and ToHigh >=  ?")
        		.setString(0,  fromZip)
        		.setString(1,  fromZip)
        		.setString(2,  toZip)
        		.setString(3,  toZip)
        		.uniqueResult();
		
		
		//start adjusting the minRate and the class rate
		if(laneRow != null){
			Estes2011v500Adjust adjRow = (Estes2011v500Adjust) session.createQuery("from Estes2011v500Adjust  where AdjustmentCode = ?")
	        		.setInteger(0,  laneRow.getAdjNumber())
	        		.uniqueResult();
			
			//make the proper adjustments based on the type
			
			if(adjRow.getMinAdjustType() == 2)
				minRate += adjRow.getMinAdjust();
			else
				minRate = (int)((double)adjRow.getMinAdjust() / 10000) * minRate;
			
			debug("minRate= " + minRate);

			
			for(int i = 0; i < classGroup.length; i++){
				int adjRate = (Integer)(adjRow.getClass().getMethod("get"+ RatingUtil.weightCode(weightTotal) + "Class" + classGroup[i])).invoke(adjRow);
				debug("adjRate= " + adjRate);

				if(adjRow.getRateAdjustType() == 2)
					rate[i] =  rate[i]+ adjRate;
				else
					rate[i] = (int)((double)adjRate / 10000) * rate[i];

				debug("rate= " + rate[i]);

			}
			
			//make the proper adjustments based on the type for deficit rate

			
			for(int i = 0; i < classGroup.length; i++){
				int adjRate = (Integer)(adjRow.getClass().getMethod("get"+ RatingUtil.weightCode(weightTotal) + "Class" + classGroup[i])).invoke(adjRow);

				debug("For deficit adjRate= " + adjRate);

				if(adjRow.getRateAdjustType() == 2)
					deficitRate[i] =  deficitRate[i]+ adjRate;
				else
					deficitRate[i] = (int)((double)adjRate / 10000) * deficitRate[i];

				debug("deficitRate= " + deficitRate[i]);

			}
			int adjRate = (Integer)(adjRow.getClass().getMethod("get"+ RatingUtil.nextWeightCode(weightTotal) + 
					"Class" + RatingUtil.getLowestClass(classGroup))).invoke(adjRow);
			if(adjRow.getRateAdjustType() == 2)
				deficitRate[deficitRate.length - 1] =  deficitRate[deficitRate.length - 1]+ adjRate;
			else
				deficitRate[deficitRate.length - 1] = (int)((double)adjRate / 10000) * deficitRate[deficitRate.length - 1];

		}
		
		
		int total = 0, deficitTotal = 0;
		for(int i = 0; i < rate.length; i++){
			total += rate[i] * weight[i];
			deficitTotal += deficitRate[i] * weight[i];
	
		}
		
		deficitTotal += deficitRate[deficitRate.length - 1] * RatingUtil.getDeficitAmount(weightTotal);
		
		total /= 100;
		deficitTotal /= 100;
		
		debug("Total: " + total);
		debug("DeficitTotal: " + deficitTotal);
	
		//returns the rate information based on which total is lower
		if( total < deficitTotal){
			ProductInfo[] productInfo =  new ProductInfo[rate.length];
			for(int i = 0; i < rate.length; i++){
				productInfo[i] = new ProductInfo();
				productInfo[i].rate = rate[i];
				productInfo[i].weight = weight[i];
				productInfo[i].classInfo = Integer.valueOf(classGroup[i]);
				productInfo[i].charge = rate[i] * weight[i];
				productInfo[i].deficitWeight = false;

			}
			return  productInfo;

		}
		else{
			ProductInfo[] productInfo =  new ProductInfo[deficitRate.length];
			for(int i = 0; i < deficitRate.length; i++){
				productInfo[i] = new ProductInfo();
				productInfo[i].rate = deficitRate[i];
				productInfo[i].deficitWeight = (i == deficitRate.length - 1);
				if((i != deficitRate.length - 1)){
					productInfo[i].weight = weight[i];
					productInfo[i].classInfo = Integer.valueOf(classGroup[i]);
					productInfo[i].charge = deficitRate[i] * weight[i];
				}
				else{
					productInfo[i].weight = RatingUtil.getDeficitAmount(weightTotal);
					productInfo[i].classInfo = Integer.valueOf(RatingUtil.getLowestClass(classGroup));
					productInfo[i].charge = deficitRate[i] * RatingUtil.getDeficitAmount(weightTotal);
				}
			}
			return  productInfo;
		}
			
	}
	
	public static void debug(String s){
		System.out.println(s);
	}

}
