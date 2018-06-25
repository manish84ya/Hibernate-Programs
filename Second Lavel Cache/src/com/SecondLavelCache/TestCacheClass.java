package com.SecondLavelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCacheClass {
public static void main(String[] args) throws Exception
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	
	Session s1=sf.openSession();
	CustomerDTO obj1=(CustomerDTO)s1.load(CustomerDTO.class, 1);
	
	System.out.println("First Session-1");
	
	System.out.println("Customer Name Is:"+obj1.getFirstName());
	System.out.println("Customer Name Is:"+obj1.getLastName());
	
	s1.close();
	
	Thread.sleep(1000);

	Session s2=sf.openSession();
	
	CustomerDTO obj2=(CustomerDTO)s2.load(CustomerDTO.class, 2);
	System.out.println("Second Session-2");	
	System.out.println("Customer Name Is:"+obj2.getFirstName());
	System.out.println("Customer Name Is:"+obj2.getLastName());
	s2.close();
	
	Thread.sleep(1000);

	Session s3=sf.openSession();
	
	CustomerDTO obj3=(CustomerDTO)s3.load(CustomerDTO.class, 1);
	System.out.println("Third Session-3");
	System.out.println("Customer Name Is:"+obj3.getFirstName());
	System.out.println("Customer Name Is:"+obj3.getLastName());
	s3.close();
    Thread.sleep(1000);

	Session s4=sf.openSession();
	CustomerDTO obj4=(CustomerDTO)s4.load(CustomerDTO.class, 1);
    System.out.println("Second Session-4");	
	System.out.println("Customer Name Is:"+obj4.getFirstName());
	System.out.println("Customer Name Is:"+obj4.getLastName());
	s4.close();
	

	
	
}
}
