package com.VendorCustomer;

import java.awt.color.ICC_ColorSpace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestVendorCustomer {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
	   SaveRecord();
		//getRecord();
		//UpdateRecord();
	    //DeleteRecords();
}
	public static void DeleteRecords()
	{
		Session s=sf.openSession();
		//Vendor b=(Vendor)s.get(Vendor.class,new Integer(221));
		Customer c=(Customer)s.get(Customer.class, new Integer(53));
		Transaction t=s.beginTransaction();
		s.delete(c);
		t.commit();
		s.close();
		
	}
	

	
	public static void UpdateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Vendor a=(Vendor)s.get(Vendor.class, new Integer(230));
		a.setVname("Reebok");
		
		Customer c=(Customer)s.get(Customer.class, new Integer(310));
		c.setCname("Ramesh");
		
		
		/*MANY TO ONE */
		/*Customer c=(Customer)s.get(Customer.class, new Integer(31));
		c.setCname("Manish");
		
		/*Vendor a=(Vendor)s.get(Vendor.class, new Integer(222));
		a.setVname("Reebok");*/
		
		Set set =a.getChild();
		set.add(c);
		a.setChild(set);
		s.update(c);
		t.commit();
		s.close();
	}
	
	
	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List st=s.createQuery("from Vendor").list();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Vendor p=(Vendor)itr.next();
			System.out.println("Vendor Name: " +p.getVname());
	        Set set=p.getChild();
	        Iterator itr1=set.iterator();
	        
	        while(itr1.hasNext())
	        {
	        	Customer doc=(Customer)itr1.next();
	        	System.out.println("\tCustomer Name: " + doc.getCname());
	        }
	     }
		s.close();
		
	}


	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Vendor v=new Vendor();
		v.setVid(231);
		v.setVname("reebok");
		
		Customer c1=new Customer();
		c1.setCid(3100);
		c1.setCname("Manish");
		
		Customer c2=new Customer();
		c2.setCid(3200);
		c2.setCname("Candan");
		
		Customer c3=new Customer();
		c3.setCid(3300);
		c3.setCname("payu");
		
		//ONE-TO-MANY...........................................
		
		
		Set set=new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		v.setChild(set);
		
		
		//MANY-TO-ONE............................................
		
		
		c1.setObj(v);
		c2.setObj(v);
		c3.setObj(v);
	    
		//Insert Or Save Data Into A field
		s.save(c3);
		//s.save(v);
		
		t.commit();
		s.close();
		
	}
	
}
