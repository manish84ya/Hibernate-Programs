package com.SecondLavelCache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

public class SecondLevelCacheWithHql {
public static void main(String[] args)

{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	Session s1=sf.openSession();
	
	//Transaction t=s1.beginTransaction();

	//Select Query With Criteria
	/*
	Criteria cri=s.createCriteria(CustomerDTO.class);
	cri.add(Restrictions.eq("id", 1));
	List l=cri.list();
	Iterator itr=l.iterator();
	CustomerDTO obj;
	while(itr.hasNext())
	{
		obj=(CustomerDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAddress()+" "+obj.getCity()+" "+obj.getContactNumber()+" "+obj.getCountry()+" "+obj.getPostalCode());
	}
	s.close();
	

	Criteria cri1=s1.createCriteria(CustomerDTO.class);
	cri1.add(Restrictions.eq("id", 1));
	List l1=cri1.list();
	Iterator itr1=l1.iterator();
	CustomerDTO obj1;
	while(itr1.hasNext())
	{
		obj1=(CustomerDTO)itr1.next();
		System.out.println(obj1.getId());
	}
	s1.close();
	*/
	
	
	
	/*

	Query q=s1.createQuery("FROM CustomerDTO where id=1");
	List l=q.list();
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		CustomerDTO obj=(CustomerDTO)itr.next();
		System.out.println(obj.getFirstName());
	}
			s1.close();
			Session s2=sf.openSession();

	Query q1=s2.createQuery("FROM CustomerDTO where id=1");
	List l1=q1.list();
	Iterator itr1=l1.iterator();
	while(itr1.hasNext())
	{
		CustomerDTO obj1=(CustomerDTO)itr1.next();
		System.out.println(obj1.getFirstName());
	}
	*/
	
	
}
}
