package com.TablePerConcreteClassUsingAnnotations;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class TestConcrete {
	static Session s=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	static Transaction t=s.beginTransaction();
	public static void main(String[] args)
	{
		Person_Concrete p=new Person_Concrete();
		p.setPersonId(100l);
		p.setFirstname("Manish");
		p.setLastname("Chaurasiya");
		
		Employee_Concrete e=new Employee_Concrete();
		e.setPersonId(200l);
		e.setDepartmentName("CA");
		e.setFirstname("Raman");
		e.setLastname("Kaliya");
		e.setJoiningDate(new Date());
		
		Owner_Concrete o=new Owner_Concrete();
		o.setPersonId(300l);
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
