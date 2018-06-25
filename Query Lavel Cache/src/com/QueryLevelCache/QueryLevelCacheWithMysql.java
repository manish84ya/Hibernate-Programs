package com.QueryLevelCache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class QueryLevelCacheWithMysql {
public static void main(String[] args)
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	Session s1=sf.openSession();
	Session s2=sf.openSession();
	
	
	
	
	Query q=s1.createSQLQuery("select c.id,c.firstname from customerdetail c where c.id=1");
	List<Object[]> l=q.list();
	q.setCacheable(true);
	
	for(Object[] row:l)
	{
		CustomerDTO obj = new CustomerDTO();
		obj.setId(Integer.parseInt(row[0].toString()));
		obj.setFirstName(row[1].toString());
		System.out.println(obj.getId()+" " +obj.getFirstName());
	}

	Query q1=s2.createSQLQuery("select c.id,c.firstname from customerdetail c where c.id=1");
	List<Object[]> l1=q1.list();
	q1.setCacheable(true);
	for(Object[] row1:l)
	{
		CustomerDTO obj1 = new CustomerDTO();
		obj1.setId(Integer.parseInt(row1[0].toString()));
		obj1.setFirstName(row1[1].toString());
		System.out.println(obj1.getId()+" " +obj1.getFirstName());
	}
	
	
	
/*	Query q1=s1.createSQLQuery("select id from customerdetail where id=1");
    q1.setCacheable(true);
	List<Object[]> l=q1.list();
	System.out.println("\t"+"Session:1 Started...");

	for(Object[] row:l)
	{
		CustomerDTO obj = new CustomerDTO();
		obj.setId(Integer.parseInt(row[0].toString()));
		System.out.println(obj.getId());
	}
	s1.close();
	System.out.println("\t"+"Session:1 Closed...");
	
	
	Session s2=sf.openSession();
	Query q2=s2.createSQLQuery("select id from customerdetail where id=1");
	q2.setCacheable(true);
	List<Object[]> l1=q2.list();
	System.out.println("\t"+"Session:2 Started...");
	
	for(Object[] row1:l1) {
		CustomerDTO obj1 = new CustomerDTO();
		obj1.setId(Integer.parseInt(row1[0].toString()));
		System.out.println(obj1.getId());
		
	}
	s2.close();
	System.out.println("\t"+"Session:2 Closed...");
	*/
}
}
