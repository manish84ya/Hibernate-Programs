package com.StateCapital;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestStateCapital {
	
	
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		//SaveRecord();
		GetRecord();
		//DeleteRecord();
	}
	
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		State s1=new State();
		
		s1.setSid(12);
		s1.setSname("MP");
		s1.setCname("India");
		
		Capital c=new Capital();
		c.setCname("bhopal");
		c.setSt(s1);
		
		s.save(c);
		t.commit();
		s.close();
	}

	public static void GetRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List l=s.createQuery("from Capital").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Capital addr=(Capital)itr.next();
			System.out.println("\tCapital Name: "+addr.getCname());
			State st=addr.getSt();
			System.out.println("\tState Name: "+st.getSname());
		}
		
	}
	

}
