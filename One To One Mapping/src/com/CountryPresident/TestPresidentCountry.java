package com.CountryPresident;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestPresidentCountry {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		//SaveRecord();
		//GetRecord();
		DeleteRecord();
	}
	public static void DeleteRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		President std=(President)s.get(President.class, 91);
		s.delete(std);
		t.commit();
		s.close();
		
	}
	
	
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Country c=new Country();
		c.setCid(92);
		c.setCname("India");
		
		
		President p=new President();
		p.setPname("Kovind");
		p.setPrtname("BJP");
		p.setC(c);
		s.save(p);
		t.commit();
		s.close();
		
		
	}
	
}
