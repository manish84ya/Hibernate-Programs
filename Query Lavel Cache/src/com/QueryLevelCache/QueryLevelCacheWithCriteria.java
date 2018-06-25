package com.QueryLevelCache;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


import java.util.*;

public class QueryLevelCacheWithCriteria {

public static void main(String[] args)
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	Session s1=sf.openSession();
	Transaction t=s.beginTransaction();

	//Select Query With Criteria
	
	Criteria cri=s.createCriteria(CustomerDTO.class);
	
	cri.add(Restrictions.eq("id", 1));
	cri.setCacheable(true);
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
	cri1.setCacheable(true);
	List l1=cri1.list();
	
	Iterator itr1=l1.iterator();
	CustomerDTO obj1;
	
	while(itr1.hasNext())
	{
		obj1=(CustomerDTO)itr1.next();
		System.out.println(obj1.getId()+" "+obj1.getFirstName());
		
	}
	
	s1.close();
	
	
	
	//having Clouse Using Projection and Restriction
	/*
	Criteria crit=s.createCriteria(CustomerDTO.class);
	ProjectionList p=Projections.projectionList();
	p.add(Projections.count("id"));
	p.add(Projections.property("city"));
	p.add(Projections.groupProperty("city"));
	crit.add(Restrictions.eq("city", "Indore"));
	crit.setProjection(p);
	
	List l=crit.list();
	Iterator itr=l.iterator();
	
	Object[] col;

	while(itr.hasNext())
	{
		col=(Object[])itr.next();
		Integer id=(Integer)col[0];
		String city=(String)col[1];
		System.out.println(id+" "+city);
		
	}
*/
	
}
}
