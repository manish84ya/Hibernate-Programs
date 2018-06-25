package com.DirectorMovies;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestDirectorMovies {
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
		
		Director d=new Director();
		d.setDid(1);
		d.setDname("Dhawan");
		Movies m=new Movies();
		m.setMid(101);
		m.setMname("Judwa");
		m.setMsize(3);
		
		Movies m1=new Movies();
		m1.setMid(102);
		m1.setMname("Lagan");
		m1.setMsize(2);
		
		Movies m2=new Movies();
		m2.setMid(103);
		m2.setMname("Gadar");
		m2.setMsize(3);
		
		Set set=new HashSet();
		set.add(m);
		set.add(m1);
		set.add(m2);
		
		d.setChild(set);
		s.save(d);
		t.commit();
		}
}
