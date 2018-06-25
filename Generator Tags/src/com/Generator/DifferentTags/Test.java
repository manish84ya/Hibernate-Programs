package com.Generator.DifferentTags;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class Test {

	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		CustomerDTO obj=new CustomerDTO();
		
		Query q=s.createQuery("select max(id) from CustomerDTO");
		List l=q.list();
		Integer id=(Integer)l.get(0);
		obj.setId(++id);
		obj.setFirstName("Hemant");
		obj.setLastName("Chaurasiya");
		obj.setCity("Panna");
		obj.setAddress("920");
		obj.setContactNumber("9752737889");
		obj.setCountry("India");
		obj.setPostalCode(488442);
		s.save(obj);
		t.commit();

	}

}
