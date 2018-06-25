package com.FlightAirport;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentAddress.Address;

public class TestFlightAirport {
 static	SessionFactory sf1=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {
		//saveRecord();
	//	getRecord();
		//DeleteRecords();
		UpdateRecords();
	}

	public static void UpdateRecords()
	{
		Session s=sf1.openSession();
		Transaction t=s.beginTransaction();
		Flight f=(Flight)s.get(Flight.class,105);
		f.setFno(1264);
		s.update(f);
		t.commit();
		s.close();
	}
	
	
	
	public static void saveRecord()
	{
	
		Session s=sf1.openSession();
		Transaction t=s.beginTransaction();

		Airport a=new Airport();
		a.setAid(1);
		a.setAname("indore");
		
		Flight f=new Flight();
		f.setFid(101);
		f.setFname("king");
		f.setFno(154);
		f.setObj(a);
		
		Flight f1=new Flight();
		f1.setFid(102);
		f1.setFname("indigo");
		f1.setFno(155);
		f1.setObj(a);
		s.save(f);
		s.save(f1);
		
		t.commit();
		s.close();
		sf1.close();
		}
	

}
