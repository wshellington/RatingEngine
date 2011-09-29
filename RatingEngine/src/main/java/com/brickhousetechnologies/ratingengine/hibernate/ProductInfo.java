package com.brickhousetechnologies.ratingengine.hibernate;

public class ProductInfo {
	public ProductInfo(){}
	
	public ProductInfo(int classInfo, int weight){
		this.classInfo = classInfo;
		this.weight = weight;
	}
	
	int classInfo;
	int weight;
	
	long rate;
	long deficitRate;
	long minRate;
	long charge;
	boolean deficitWeight = false;
	long factor;
	
}
