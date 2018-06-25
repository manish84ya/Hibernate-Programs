package com.CustomerBank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestCustomerBank {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		saveRecord();
	    //getRecord();
	    //DeleteRecords();
		//UpdateRecords();
	}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Bank b=new Bank();
		
		b.setBid(101);
		b.setBname("Indian");
		
		
		Customer1 c=new Customer1();
		c.setCid(145);
		c.setCname("roshan");
		c.setAcc(4875965);
		c.setObj(b);
		
		Customer1 c1=new Customer1();
		c1.setCid(186);
		c1.setCname("roshani");
		c1.setAcc(487596545);
		c1.setObj(b);
		
		Customer1 c2=new Customer1();
		c2.setCid(196);
		c2.setCname("Antya");
		c2.setAcc(484554);
		c2.setObj(b);
		
		s.save(c);
		s.save(c1);
		s.save(c2);
		
		
		t.commit();
		s.close();
		}


}
