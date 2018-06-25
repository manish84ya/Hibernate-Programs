package com.TablePerSubClassMappingUsingAnnotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSubclass {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Person_Subclass p=new Person_Subclass();
		p.setFirstname("Manish");
		p.setLastname("Chaurasiya");
		
		Employee_Subclass e=new Employee_Subclass();
		e.setDepartmentName("CA");
		e.setFirstname("Raman");
		e.setLastname("Kaliya");
		e.setJoiningDate(new Date());
		
		Owner_Subclass o=new Owner_Subclass();
		o.setFirstname("Chandan");
		o.setLastname("Gupta");
		o.setStocks(300l);
		o.setPartnershipStake(20l);
		s.save(p);
		s.save(e);
		s.save(o);
		t.commit();
		s.close();
		

	}
}
