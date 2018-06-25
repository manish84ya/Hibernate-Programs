package com.QueryLevelCache;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


import java.util.*;

public class QueryLevelCacheMain {

	public static void main(String[] args)
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Session s1=sf.openSession();
		//Transaction t=s1.beginTransaction();
		
		//Session:-1
		Session s1=sf.openSession();
		Query q1=s1.createQuery("from CustomerDTO where id=1");
		q1.setCacheable(false);
		List l=q1.list();
		Iterator itr=l.iterator();
		System.out.println("\t"+"Session:1 Started...");
		while(itr.hasNext())
		{
			CustomerDTO obj1=(CustomerDTO)itr.next();
			System.out.println("\t"+obj1.getFirstName());
		}
		s1.close();
		System.out.println("\t"+"Session:1 Closed...");
		
		
		Session s2=sf.openSession();
		Query q2=s2.createQuery("from CustomerDTO where id=1");
		q2.setCacheable(false);
		List l1=q2.list();
		Iterator itr1=l1.iterator();
		System.out.println("\t"+"Session:2 Started...");
		while(itr1.hasNext())
		{
			CustomerDTO obj2=(CustomerDTO)itr1.next();
			System.out.println("\t"+obj2.getFirstName());
		}
		s2.close();
		System.out.println("\t"+"Session:2 Closed...");
		
		//second level cache
		Session s5=sf.openSession();
		CustomerDTO obj5=(CustomerDTO)s5.load(CustomerDTO.class, 1);
		System.out.println("Load Second Level Cache");
		System.out.println("Customer Name Is:"+obj5.getFirstName());
		System.out.println("Customer Name Is:"+obj5.getLastName());
		System.out.println("Close Second Level Cache");
		s5.close();
		
		
		
		
		
		
		//////
		Session s3=sf.openSession();
		
		Query q3=s3.createQuery("from CustomerDTO where id=1");
				
				q3.setCacheable(true);
				List l3=q3.list();
				Iterator itr2=l3.iterator();
				System.out.println("\t"+"Session:3 Started...");
				
				while(itr2.hasNext())
				{
					CustomerDTO obj3=(CustomerDTO)itr2.next();
					System.out.println("\t"+obj3.getFirstName());
				}
				s3.close();
				System.out.println("\t"+"Session:3 Closed...");
				
				//////
				Session s4=sf.openSession();
				/*
				Query q4=s4.createQuery("from CustomerDTO where id=1");
						
						q3.setCacheable(true);
						List l4=q4.list();
						Iterator itr3=l4.iterator();
						System.out.println("\t"+"Session:4 Started...");
						
						while(itr3.hasNext())
						{
							CustomerDTO obj4=(CustomerDTO)itr3.next();
							System.out.println("\t"+obj4.getFirstName());
						}
						s4.close();
						System.out.println("\t"+"Session:4 Closed...");
					*/	
	}
}
