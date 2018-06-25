package com.CustomerVendor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCustomerVendor {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		saveRecord();
	//	getRecord();
		//DeleteRecords();
	//	UpdateRecords();
	}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Vendor v=new Vendor();
		v.setVid(102);
		v.setVName("Apple");

		Customer c1=new Customer();
		c1.setCid(10);
		c1.setCname("anish");
		c1.setObj(v);
		
		Customer c2=new Customer();
		c2.setCid(11);
		c2.setCname("Chandani");
		c2.setObj(v);
		
		Customer c3=new Customer();
		c3.setCid(12);
		c3.setCname("chhh");
		c3.setObj(v);
		s.save(c1);
		s.save(c2);
		s.save(c3);
		t.commit();
		s.close();
		}
	
	
}
