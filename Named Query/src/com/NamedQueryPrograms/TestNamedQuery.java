package com.NamedQueryPrograms;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestNamedQuery {
public static void main(String[] args)
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	System.out.println("Named Query With ? And Set Parameter..");
	System.out.println("\t Begin....");
	Session s=sf.openSession();
	Query q=s.getNamedQuery("select_query");
	q.setParameter(0,1);
	q.setParameter(1, "Chand");
	List l=q.list();
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		CustomerDTO obj=(CustomerDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName());
	}
	System.out.println("\t close....");
	System.out.println();
	s.close();
	
	System.out.println("Named Query With firstName:=name...");
	System.out.println("\t Begin....");
	Session s1=sf.openSession();
	Query q1=s1.getNamedQuery("select_query_name");
	q1.setString("name","Payal");
	q1.setCacheable(true);
	List l1=q1.list();
	Iterator itr1=l1.iterator();
	while(itr1.hasNext())
	{
		CustomerDTO obj1=(CustomerDTO)itr1.next();
		System.out.println(obj1.getId()+" "+obj1.getFirstName()+" "+obj1.getLastName());
	}
	System.out.println("\t close....");
	System.out.println();
	s1.close();
	
	
	 
	 System.out.println("Named Query Level Cache....");
	System.out.println("\t Begin....");
	Session s2=sf.openSession();
	Query q2=s2.getNamedQuery("select_query_name");
	q2.setString("name","Payal");
	q2.setCacheable(true);
	List l2=q2.list();
	Iterator itr2=l2.iterator();
	while(itr2.hasNext())
	{
		CustomerDTO obj2=(CustomerDTO)itr2.next();
		System.out.println(obj2.getId()+" "+obj2.getFirstName()+" "+obj2.getLastName());
	}
	System.out.println("\t close....");
	System.out.println();
	s2.close();
	
	 
	 
	
	
}
}
