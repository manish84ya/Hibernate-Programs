package com.VendorCustomer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestVendorCustomer {
	static AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
	static SessionFactory sf=cfg.buildSessionFactory();
	
public static void main(String[] args)
{
	saveRecord();
	//getRecord();
	//updateRecord();
//	DeleteRecord();
	
}
public static void DeleteRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Vendor v=(Vendor)s.get(Vendor.class,101);
	s.delete(v);
	t.commit();
	s.close();
}
public static void updateRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Vendor v=(Vendor)s.get(Vendor.class,101);
	Customer c=(Customer)s.get(Customer.class,1);
	c.setCname("Taksh");
	Set set=v.getChildren();
	
	set.add(c);
	v.setChildren(set);
	s.update(v);
	t.commit();
	s.close();
	
}
public static void getRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	List l=s.createQuery("from Vendor").list();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		Vendor v=(Vendor)itr.next();
		System.out.println("\t Vendor Name Is: "+v.getVname());
		Set set=v.getChildren();
		for(Iterator itr1=set.iterator();itr1.hasNext();)
		{
			Customer c=(Customer)itr1.next();
			System.out.println("\t Customer Name:"+c.getCname());
		}
	}
}
public static void saveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Vendor v=new Vendor();
	v.setVid(101);
	v.setVname("MI");
	
	
	Customer c=new Customer();
	c.setCid(1);
	c.setCname("manish");
	
	Customer c1=new Customer();
	c1.setCid(2);
	c1.setCname("anish");
	
	Customer c2=new Customer();
	c2.setCid(3);
	c2.setCname("hansh");
	
	Set set=new HashSet<>();
	set.add(c);
	set.add(c1);
	set.add(c2);
	
	v.setChildren(set);
	s.save(v);
	t.commit();
	s.close();
}
}
