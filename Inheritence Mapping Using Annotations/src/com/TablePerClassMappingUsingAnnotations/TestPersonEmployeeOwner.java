package com.TablePerClassMappingUsingAnnotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestPersonEmployeeOwner {
static Session s=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
static Transaction t=s.beginTransaction();
public static void main(String[] args)
{
	Person p=new Person();
	p.setFirstname("Manish");
	p.setLastname("Chaurasiya");
	
	Employee e=new Employee();
	e.setDepartmentName("CA");
	e.setFirstname("Raman");
	e.setLastname("Kaliya");
	e.setJoiningDate(new Date());
	
	Owner o=new Owner();
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
