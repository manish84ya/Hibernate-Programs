package com.FirstLavelCache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCacheClass {
public static void main(String[] args) throws InterruptedException
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	//Transaction t=s.beginTransaction();
	for(int i=0;i<10;i++)
	{
	CustomerDTO obj=(CustomerDTO)s.load(CustomerDTO.class, 1);
	System.out.println("Customer Name Is:"+obj.getFirstName());
	System.out.println("Customer Name Is:"+obj.getLastName());
	Thread.sleep(1000);
	}

	
	
	
	
	//Update Database and Fetch Data....
	/*
	for(int i=0;i<5;i++)
	{
		Transaction t=s.beginTransaction();
	CustomerDTO obj=(CustomerDTO)s.load(CustomerDTO.class, 1);
	System.out.println("Customer Name Is:"+obj.getFirstName());
	Thread.sleep(5000);
	obj.setFirstName("Hanuman");
	s.update(obj);
	t.commit();
	}
	*/
	/*
	Query q=s.createQuery("from CustomerDTO where id=1");
	q.setCacheable(true);
	List l=q.list();
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		CustomerDTO obj=(CustomerDTO)itr.next();
		System.out.println(obj.getFirstName());
	}
	*/
	s.close();
	
	
	
}
}
