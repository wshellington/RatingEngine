package com.brickhousetechnologies.ratingengine;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.Test;

import com.brickhousetechnologies.ratingengine.hibernate.*;
import com.brickhousetechnologies.ratingengine.hibernate.util.HibernateUtil;

public class RatingEngineTest {

	public Estes2011v500 runEstesRateEngine(ProductInfo[] products, 
			String fromZip, String toZip){
		Session session = HibernateUtil.getSessionFactory();
        session.beginTransaction();
        
        try {

			Estes2011v500 ratingE = new Estes2011v500(session, fromZip, toZip);
			ratingE.setProducts(products);
			ratingE.calcRate();
			return ratingE;
        
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	@Test
	public void test() {
		ProductInfo[] a1 = new ProductInfo[]{new ProductInfo(100, 1000), 
				new ProductInfo(50, 700), new ProductInfo(70, 300)};
		
		//Integer total = runEstesRateEngine(a1, "23452", "27824").getCorrectTotal();
		
		assertTrue(runEstesRateEngine(a1, "23452", "27824").getCorrectTotal() == 87396);
		//fail("Not yet implemented");
	}

}
