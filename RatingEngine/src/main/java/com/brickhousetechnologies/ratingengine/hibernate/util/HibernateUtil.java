package com.brickhousetechnologies.ratingengine.hibernate.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.brickhousetechnologies.ratingengine.hibernate.domain.*;
 
public class HibernateUtil {

private static final SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new AnnotationConfiguration()
	            .addPackage("com.il2000.ratingengine.hibernate.domain") //the fully qualified package name
	            .addAnnotatedClass(Estes2011v500Adjust.class)
	            .addAnnotatedClass(Estes2011v500Factor.class)
	            .addAnnotatedClass(Estes2011v500Lane.class)
	            .addAnnotatedClass(Estes2011v500Matrix.class)
	            .addAnnotatedClass(Estes2011v500Rates.class)
	            .addAnnotatedClass(ODBL2011Adjustment.class)
	            .addAnnotatedClass(ODBL2011Rate.class)
	            .addAnnotatedClass(ODBL2011ZipCode.class)
	            .configure().buildSessionFactory();
	                   
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSessionFactory()
            throws HibernateException {
        return sessionFactory.openSession();
    }
}
            