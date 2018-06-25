package com.CountryStates;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestCountryStates {

static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
	//	saveRecord();
	//	getRecord();
		DeleteRecords();
	//	UpdateRecords();
	}

	public static void DeleteRecords()
	{
		Session s=sf.openSession();
		Country b=(Country)s.get(Country.class,new Integer(45));
		Transaction t=s.beginTransaction();
		s.delete(b);
		t.commit();
		s.close();
		
	}
	
	
		
}
