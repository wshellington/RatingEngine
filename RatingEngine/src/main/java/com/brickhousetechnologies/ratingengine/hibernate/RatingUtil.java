package com.brickhousetechnologies.ratingengine.hibernate;

public class RatingUtil {
	public static String weightCode(int weight) {
        if(weight < 500) {
            return "L5C";
        } else if(weight < 1000) {
            return "M5C";
        } else if(weight < 2000) {
            return "M1M";
        } else if(weight < 5000) {
            return "M2M";
        } else if(weight < 10000) {
            return "M5M";
        } else if(weight < 20000) {
            return "M10M";
        } else if(weight < 30000) {
            return "M20M";
        } else if(weight < 40000) {
            return "M30M";
        } else {
            return "M40M";
        }
    }
	
	 public static int getDeficitAmount(int weight) {
	        if(weight < 500) {
	            return 500 - weight;
	        } else if(weight < 1000) {
	            return 1000 - weight;
	        } else if(weight < 2000) {
	            return 2000 - weight;
	        } else if(weight < 5000) {
	            return 5000 - weight;
	        } else if(weight < 10000) {
	            return 10000 - weight;
	        } else if(weight < 20000) {
	            return 20000 - weight;
	        } else if(weight < 30000) {
	            return 30000 - weight;
	        } else if(weight < 40000) {
	            return 40000 - weight;
	        } else {
	            return 0;
	        }
	    }
	 
	 public static String nextWeightCode(int weight) {
	        if(weight < 500) {
	            return "M5C";
	        } else if(weight < 1000) {
	            return "M1M";
	        } else if(weight < 2000) {
	            return "M2M";
	        } else if(weight < 5000) {
	            return "M5M";
	        } else if(weight < 10000) {
	            return "M10M";
	        } else if(weight < 20000) {
	            return "M20M";
	        } else if(weight < 30000) {
	            return "M30M";
	        } else {
	            return "M40M";
	        }
	    }
	 
	 static public String getLowestClass(String[] classes) {

		 	int minClass = Integer.parseInt(classes[0]);
		 
	        for(int j = 0; j < classes.length; j++) {
	        	if(Integer.parseInt(classes[j]) < minClass) 
	        			minClass = Integer.parseInt(classes[j]);
	         
	        }
	        return String.valueOf(minClass);
	    }
	 
	 
	 
	 static public String getLowestClass(ProductInfo[] classes) {

		 	int minClass =  -1;
		 
	        for(int j = 0; j < classes.length; j++) {
	        	if(minClass == -1 && !classes[j].deficitWeight)
	        		minClass =  classes[0].classInfo;
	        	if(!classes[j].deficitWeight)
	        		if(classes[j].classInfo < minClass) 
	        			minClass = classes[j].classInfo;
	         
	        }
	        return String.valueOf(minClass);
	    }
}
