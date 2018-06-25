package com.cacheImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCacheClass {
public static void main(String[] args) throws InterruptedException
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s1=sf.openSession();
	
	CustomerDTO obj=(CustomerDTO)s1.load(CustomerDTO.class, 1);
	System.out.println("Customer Name Is:"+obj.getFirstName());
	System.out.println("Customer Name Is:"+obj.getLastName());
	Thread.sleep(10000);
	//s1.close();
	
	CustomerDTO obj1=(CustomerDTO)s1.load(CustomerDTO.class, 1);
	System.out.println("Customer Name Is:"+obj1.getFirstName());
	System.out.println("Customer Name Is:"+obj1.getLastName());
//	s2.close();
	
	
}
}
