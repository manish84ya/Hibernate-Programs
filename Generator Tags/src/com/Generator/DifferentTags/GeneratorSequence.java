package com.Generator.DifferentTags;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GeneratorSequence {

	public static void main(String[] args) {

		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		CustomerDTO obj=new CustomerDTO();
		
		//Query q=s.createQuery("select max(id) from CustomerDTO");
		//List l=q.list();
		//Integer id=(Integer)l.get(0);
		//System.out.println(id);
		//id+=5;
		//obj.setId(id);
		obj.setFirstName("Chandan");
		obj.setLastName("Gupta");
		obj.setCity("Indore");
		obj.setAddress("608");
		obj.setContactNumber("9977998822");
		obj.setCountry("India");
		obj.setPostalCode(452001);
		s.save(obj);
		t.commit();
	}

}
