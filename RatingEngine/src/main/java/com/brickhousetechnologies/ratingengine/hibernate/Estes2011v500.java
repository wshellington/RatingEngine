package com.brickhousetechnologies.ratingengine.hibernate;

import org.hibernate.Session;

import com.brickhousetechnologies.ratingengine.hibernate.domain.*;

public class Estes2011v500 extends RatingEngine {

	public Estes2011v500(Session sess, String from, String to) {
		super(sess, from, to, 100);
		// TODO Auto-generated constructor stub
	}

	public Integer getRBN(String toZip, String fromZip) {
		// TODO Auto-generated method stub
		Estes2011v500Matrix matrixRow = (Estes2011v500Matrix)session.createQuery("from Estes2011v500Matrix  where Origin = ? and Destination = ?")
        		.setString(0,  fromZip.substring(0,3))
        		.setString(1,  toZip.substring(0,3))
        		.uniqueResult();
		return matrixRow.getRBN();
	}
	
	public void calcRate() throws Exception{
		setRates(getRBN(toZip, fromZip));
	
		calcFactor((Estes2011v500Factor) session.createQuery("from Estes2011v500Factor  where WeightGroup = ? and FactorTable = ?")
	    		.setString(0,  RatingUtil.weightCode(weightTotal))
	    		.setInteger(1,  factorId)
	    		.uniqueResult());
		
		adjustRates();
		
		calcTotal();
		
		calcDeficitTotal();
	}

	public void setRates(Integer RBN) throws Exception {
		// TODO Auto-generated method stub
		Estes2011v500Rates rateRow = (Estes2011v500Rates) session.createQuery("from Estes2011v500Rates  where RBN = ?")
        		.setInteger(0,  RBN)
        		.uniqueResult();
		
		actualRate = (Integer)(rateRow.getClass().getMethod("get"+ RatingUtil.weightCode(weightTotal))).invoke(rateRow);
		deficitRate =(Integer)(rateRow.getClass().getMethod("get"+ RatingUtil.nextWeightCode(weightTotal))).invoke(rateRow);
		minimalRate = rateRow.getMinCharge();
		
		factorId = rateRow.getFactorTable();
		

		
	}

	public void calcFactor(Estes2011v500Factor factorRow) throws Exception {
		// TODO Auto-generated method stub
		for(int i = 0; i < products.size(); i++){
			
			int factor = (Integer)(factorRow.getClass().getMethod("getClass"+ products.get(i).classInfo)).invoke(factorRow);
	
			debug("factor = " + factor);
			
			//since Estes rounds up and int rounds down, adding 5000 will be the equivalent
			// to adding up
			// if the decimal is 5 or greater it will go to the next dollar and be truncated
			//if the decimal is less then 5 will stay at the same dollar and be truncated
			products.get(i).rate = (actualRate * factor + 5000) / 10000;
			
			debug("rate after factor= " + products.get(i).rate);

			//deficit rate
			debug("deficitFactor = " + factor);
			
			products.get(i).deficitRate = (deficitRate * factor + 5000) / 10000;
			
			debug("deficitRate= " + products.get(i).deficitRate);

		}
		
		int deficitFactor =(Integer)(factorRow.getClass().getMethod("getClass"+ RatingUtil.getLowestClass(products.toArray(new ProductInfo[]{})))).invoke(factorRow);
		
		addDeficitRate(deficitFactor);
		
	}
		
	//adds the deficit rate to the products array
	private void addDeficitRate(Integer deficitFactor){
		ProductInfo x = new ProductInfo();
		x.deficitRate = (deficitRate * deficitFactor + 5000) / 10000;
		x.deficitWeight = true;
		products.add(x);
	}
	
	private void adjustRates() throws Exception{
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
				minimalRate += adjRow.getMinAdjust();
			else
				minimalRate = (int)((double)adjRow.getMinAdjust() / 10000) * minimalRate;
			
			debug("minRate= " + minimalRate);

			
			for(int i = 0; i < products.size(); i++){
				if(!products.get(i).deficitWeight){
					int adjRate = (Integer)(adjRow.getClass().getMethod("get"+ RatingUtil.weightCode(weightTotal) + "Class" + products.get(i).classInfo)).invoke(adjRow);
					debug("adjRate= " + adjRate);
	
					if(adjRow.getRateAdjustType() == 2)
						products.get(i).rate =  products.get(i).rate+ adjRate;
					else
						products.get(i).rate = (int)((double)adjRate / 10000) * products.get(i).rate;
	
					debug("rate= " + products.get(i).rate);
				}

			}
			
			adjustDeficitRates(adjRow);

		}
	}

	//make the proper adjustments based on the type for deficit rate and adds the deficitRate to the products array
	private void adjustDeficitRates(Estes2011v500Adjust adjRow) throws Exception{
		for(int i = 0; i < products.size(); i++){
			if(!products.get(i).deficitWeight){
				int adjRate = (Integer)(adjRow.getClass().getMethod("get"+ RatingUtil.weightCode(weightTotal) + "Class" + products.get(i).classInfo)).invoke(adjRow);
	
				debug("For deficit adjRate= " + adjRate);
	
				if(adjRow.getRateAdjustType() == 2)
					products.get(i).deficitRate =  products.get(i).deficitRate+ adjRate;
				else
					products.get(i).deficitRate = (int)((double)adjRate / 10000) * products.get(i).deficitRate;
	
				debug("deficitRate= " + products.get(i).deficitRate);
			}

		}
		int adjRate = (Integer)(adjRow.getClass().getMethod("get"+ RatingUtil.nextWeightCode(weightTotal) + 
				"Class" + RatingUtil.getLowestClass(products.toArray(new ProductInfo[]{})))).invoke(adjRow);
		if(adjRow.getRateAdjustType() == 2)
			products.get(products.size() - 1).deficitRate +=  adjRate;
		else
			products.get(products.size() - 1).deficitRate *= (int)((double)adjRate / 10000);
	}

	

}
