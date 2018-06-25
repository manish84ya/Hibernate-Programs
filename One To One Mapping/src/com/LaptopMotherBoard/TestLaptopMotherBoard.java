package com.LaptopMotherBoard;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestLaptopMotherBoard {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		//SaveRecord();
		//GetRecord();
		DeleteRecord();
	}
	
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Laptop l=new Laptop();
		l.setLid(123);
		l.setLcname("Sony");
		l.setSeries("E");
		
		MotherBoard mb=new MotherBoard();
		mb.setMbit("64");
		mb.setCmpny("Intel");
		mb.setLap(l);
		s.save(mb);
		t.commit();
		s.close();
		
		
	}

	public static void DeleteRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		MotherBoard std=(MotherBoard)s.get(MotherBoard.class,123);
		s.delete(std);
		t.commit();
		s.close();
		
	}
}
