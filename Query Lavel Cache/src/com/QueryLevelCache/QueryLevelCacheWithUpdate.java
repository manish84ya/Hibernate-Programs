package com.QueryLevelCache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class QueryLevelCacheWithUpdate {
public static void main(String[] args)
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
//	Session s=sf.openSession();
	Session s1=sf.openSession();
	
	Query q1=s1.createQuery("from CustomerDTO where id=1");
	//q1.setCacheable(true);
	List<Object[]> l=q1.list();
	Iterator itr=l.iterator();
	//Iterator itr1=l.iterator();
	System.out.println("\t"+"Session:1 Started...");
	while(itr.hasNext())
	{
		Transaction t=s1.beginTransaction();
		CustomerDTO obj1=(CustomerDTO)itr.next();
		System.out.println("\t"+obj1.getFirstName());
		//Query q2=s1.createQuery("update CustomerDTO set firstName='Manish' where id='1'");
		//q2.executeUpdate();
	    
		obj1.setFirstName("Chand");
		s1.update(obj1);
		t.commit();	
		
	   /* List l2=q2.list();
	    Iterator itr1=l2.iterator();
		    
		while(itr1.hasNext())
	    {
	    	CustomerDTO obj2=(CustomerDTO)itr1.next();
			System.out.println("\t"+obj2.getFirstName());
			
	    }*/
		System.out.println("\t"+obj1.getFirstName());
	}
	s1.close();
	System.out.println("\t"+"Session:1 Closed...");
	
}
}
