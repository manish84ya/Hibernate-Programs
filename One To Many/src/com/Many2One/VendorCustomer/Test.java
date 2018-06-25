package com.Many2One.VendorCustomer;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{   
    static SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	
	public static void main(String[] args)
	{
	//	saveRecord();
	//	GetRecord();
	//	updateRecord();
	//	deleteRecord();
	}
	public static void deleteRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
        Customer c=new Customer();
        c.setCid(303);
        s.delete(c);
        t.commit();
	}
	
	public static void updateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
        Customer c=new Customer();
        c.setCid(403);
        c.setCname("Rohan");
        c.setFid(101);
        s.update(c);
        t.commit();
	}
	
	
	public static void GetRecord()
	{
		Session s=sf.openSession();
        Customer obj=(Customer)s.get(Customer.class, 201);
		System.out.println("Customer ID: "+obj.getCid()+" Customer Name: "+obj.getCname());
		s.close();
	}
	
	

	public static void saveRecord()
	{  
		Session s=sf.openSession();
        Transaction t=s.beginTransaction();

		Vendor v=new Vendor();
		v.setVid(103);
		v.setVname("Oppo");
		
		Customer c1=new Customer();
		c1.setCid(401);
		c1.setCname("Piyush");
		
		Customer c2=new Customer();
		c2.setCid(402);
		c2.setCname("Shiva");
		
		Customer c3=new Customer();
		c3.setCid(403);
		c3.setCname("Keshav");
		
		
		Set set=new HashSet();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		v.setChildren(set);
		
		s.save(v);
		t.commit();
	}
	
	



}
