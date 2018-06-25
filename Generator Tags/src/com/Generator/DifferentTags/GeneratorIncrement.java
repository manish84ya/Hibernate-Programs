package com.Generator.DifferentTags;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GeneratorIncrement {

	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		CustomerDTO obj=new CustomerDTO();
		
		obj.setFirstName("Payal");
		obj.setLastName("Nemade");
		obj.setCity("Indore");
		obj.setAddress("136");
		obj.setContactNumber("4569875");
		obj.setCountry("India");
		obj.setPostalCode(452002);
		s.save(obj);
		t.commit();

	}

}
