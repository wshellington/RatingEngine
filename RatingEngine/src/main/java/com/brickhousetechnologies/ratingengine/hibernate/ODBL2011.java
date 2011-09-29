package com.brickhousetechnologies.ratingengine.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.brickhousetechnologies.ratingengine.hibernate.domain.*;

public class ODBL2011 extends RatingEngine {

	int rBN;
	
	ODBL2011(Session sess, String from, String to) {
		super(sess, from, to, 100000);
		// TODO Auto-generated constructor stub
	}

	public Integer getRBN(String toZip, String fromZip) {
		// TODO Auto-generated method stub
		
		//compares the two zip codes and determines which is high and low zip
		String lowZip = new String();
		String hiZip = new String();
		if(toZip.substring(0, 3).compareTo(fromZip.substring(0, 3)) > 0){
			hiZip = toZip;
			lowZip = fromZip;
		}
		else{
			lowZip = toZip;
			hiZip = fromZip;
		}
		
		ODBL2011ZipCode matrixRow = (ODBL2011ZipCode)session.createQuery("from ODBL2011ZipCode  where HiZipCode1 = ? and HiZipCode2 = ?")
        		.setString(0,  lowZip.substring(0,3))
        		.setString(1,  hiZip.substring(0,3))
        		.uniqueResult();
		
		rBN = matrixRow.getRBN();
		return rBN;

	}

	public void calcFactor() throws Exception {
		// TODO Auto-generated method stub
		
		//gets the factors based on the weight code from the total weight and the factor ID from the rates row
		ODBL2011Adjustment factorRow = (ODBL2011Adjustment) session.createSQLQuery("SELECT *"
           + " FROM odbl2011adjustment" 
           + " WHERE (FromZip LIKE '" + fromZip.substring(0, 3) + "' OR FromZip LIKE'" 
           + fromZip + "' OR FromZip LIKE 'ALL')"
           + " AND (ToZip LIKE '" + toZip.substring(0, 3) + "' OR ToZip LIKE '" +
           toZip + "' OR ToZip LIKE 'ALL')"
           + "ORDER BY LENGTH(toZip) DESC,  LENGTH(FromZip) DESC LIMIT 1  ")
    		.addEntity(ODBL2011Adjustment.class)
    		.uniqueResult();
		
		
			
			int factor = (Integer)(factorRow.getClass().getMethod("get"+ RatingUtil.weightCode(weightTotal)).invoke(factorRow));
	
			int defFactor = (Integer)(factorRow.getClass().getMethod("get"+ RatingUtil.nextWeightCode(weightTotal)).invoke(factorRow));
			debug("deficitFactor = " + defFactor);
			debug("factor = " + factor);
			for(int i = 0; i < products.size(); i++){
			
				products.get(i).rate = (products.get(i).rate * factor + 5000) / 1000;
			
				debug("rate after factor= " + products.get(i).rate);
	
				//deficit rate
				
				
				products.get(i).deficitRate = (products.get(i).deficitRate * defFactor + 5000) / 1000;
				
				debug("deficitRate after factor= " + products.get(i).deficitRate);
			

		}
		
		ODBL2011Rate deifcitRateRow =  (ODBL2011Rate)session.createQuery("from ODBL2011Rate  where lowRBN = ? and " +
				"TariffNum =  ? and TariffSuf = ? and classInfo = ? and WeightCode = ?")
        		.setInteger(0,  rBN)
        		.setString(1, "559")
        		.setString(2, "AD")
        		.setInteger(3, Integer.valueOf(RatingUtil.getLowestClass(products.toArray(new ProductInfo[]{}))))
        		.setString(4, RatingUtil.nextWeightCode(weightTotal))
        		.uniqueResult();
		
		ProductInfo pI = new ProductInfo();
		pI.deficitRate = (((long)deifcitRateRow.getRate()) * defFactor + 5000) / 1000;
		pI.deficitWeight = true;
		products.add(pI);
		
	}

	public void setRates(Integer RBN) {
		// TODO Auto-generated method stub
		for(int x = 0; x < products.size(); x++){
			List<ODBL2011Rate> rateRow =  session.createQuery("from ODBL2011Rate  where lowRBN = ? and " +
					"TariffNum =  ? and TariffSuf = ? and (classInfo = ? or classInfo = 0)")
	        		.setInteger(0,  RBN)
	        		.setString(1, "559")
	        		.setString(2, "AD")
	        		.setInteger(3, products.get(x).classInfo)
	        		.list();
			
			debug(RatingUtil.nextWeightCode(weightTotal));
			for(int i = 0; i < rateRow.size(); i++){
				if(rateRow.get(i).getWeightCode().equals(RatingUtil.weightCode(weightTotal)))
					products.get(x).rate = ((ODBL2011Rate)rateRow.get(i)).getRate();
				else if(rateRow.get(i).getWeightCode().equals(RatingUtil.nextWeightCode(weightTotal)))
					products.get(x).deficitRate = ((ODBL2011Rate)rateRow.get(i)).getRate();
				else if(rateRow.get(i).getWeightCode().equals("M/C"))
					products.get(x).minRate = ((ODBL2011Rate)rateRow.get(i)).getRate();
				
			}
			
			
		}		
	}
	
	public void calcRate() throws Exception{
		setRates(getRBN(fromZip, toZip));
		calcFactor();
		calcTotal();
		calcDeficitTotal();
		
		if(getDeficitTotal() < getTotal())
			isDeficit = true;
	}
	


}
