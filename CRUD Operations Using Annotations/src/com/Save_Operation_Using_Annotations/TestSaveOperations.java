package com.Save_Operation_Using_Annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSaveOperations {
	public static void main(String[] args)
	{
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Product p=new Product();
		p.setProductId(4);
		p.setProName("mi6");
		p.setPrice(5000);
		Transaction t=s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
		
	}
}
