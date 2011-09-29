package com.brickhousetechnologies.ratingengine.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;

public abstract class RatingEngine {
	
	abstract Integer getRBN(String toZip, String fromZip);
	
	abstract void setRates(Integer RBN) throws Exception;
	
	abstract void calcRate() throws Exception;
	
	ArrayList<ProductInfo> products;
	
	Integer deficitWeight;	
	Boolean isDeficit;
	
	Session session;
	
	Integer minimalRate;
	Integer actualRate;
	Integer deficitRate;
		
	String toZip;
	String fromZip;
	
	Integer weightTotal;
	Integer deficitTotal;
	Integer total;
	int chargeDivisble;

	Integer factorId;
	
	RatingEngine(Session sess, String from, String to, int div){
		deficitWeight = new Integer(0);
		weightTotal =  new Integer(0);
		
		isDeficit = false;
		
		minimalRate = new Integer(0);
		actualRate = new Integer(0);
		deficitRate = new Integer(0);
		
		session = sess;
		
		toZip = to;
		fromZip = from;
		
		products = new ArrayList<ProductInfo>();
		
		chargeDivisble = div;
	}
		
	void addProduct(ProductInfo product){
		products.add(product);
		calcTotalWeight();
	}
	
	public ProductInfo getProduct(int index){
		return products.get(index);
	}
	
	public ProductInfo[] getProducts(){
		return products.toArray(new ProductInfo[]{});
	}
	
	Boolean isDeficit(){
		return isDeficit;
	}
	
		
	void calcTotalWeight(){
		for(int i = 0; i < products.size(); i++)
			weightTotal += products.get(i).weight;
	}
		
	void calcTotal(){
		long total = 0;
		for(int i = 0; i < products.size(); i++){
			if(!products.get(i).deficitWeight)
					total += products.get(i).rate * products.get(i).weight;
	
		}	
		
		total /= chargeDivisble;
		
		this.total = ((int) total);
	}
	
	void calcDeficitTotal(){
		long total = 0;
		for(int i = 0; i < products.size(); i++){
			if(!products.get(i).deficitWeight)
					total += products.get(i).deficitRate * products.get(i).weight;
	
		}	
		total += products.get(products.size() - 1).deficitRate * RatingUtil.getDeficitAmount(weightTotal);

		
		total /= chargeDivisble;
		
		this.deficitTotal = ((int)total);
	}
	
	public void setProducts(ProductInfo[] x){
		products.clear();
		for(int i = 0; i < x.length; i++){
			products.add(i, x[i]);
		}
		calcTotalWeight();	
	}
	
	public Integer getTotal(){
		return total;
	}
	
	public Integer getDeficitTotal(){
		return deficitTotal;
	}
	
	public Integer getCorrectTotal(){
		return Math.min(total, deficitTotal);
	}
	
	public static void debug(String s){
		System.out.println(s);
	}
 			
}
