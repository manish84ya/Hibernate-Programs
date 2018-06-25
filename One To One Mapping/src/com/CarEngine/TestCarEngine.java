package com.CarEngine;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestCarEngine {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		Update();
		//SaveRecord();
		//GetRecord();
		//DeleteRecord();
	}
	public static void Update()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Engine std=(Engine)s.get(Engine.class,new Integer(123654));
		std.setGearbox("4");
		
		
		s.update(std);
		t.commit();
		s.close();
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	Car c=new Car();
	c.setCid(123654);
	c.setConame("Manish");
	c.setCname("swift");
	
		
		Engine s1=new Engine();
		
		s1.setGearbox("5");
		s1.setEcname("Suzuki");
		s1.setC(c);
		s.save(s1);
		t.commit();
		s.close();
		
		
	}
	
}
