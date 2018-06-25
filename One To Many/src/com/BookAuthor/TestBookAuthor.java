package com.BookAuthor;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Many2One.VendorCustomer.Customer;
import com.Many2One.VendorCustomer.Vendor;

public class TestBookAuthor {
	
static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
	{
		//saveRecord();
	//	GetRecord();
		updateRecord();
		//deleteRecord();
	}
	public static void deleteRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	//Book b=new Book();
	
		//b.setBid(1);
	

		Author a=new Author();
        a.setAid(102);
        s.delete(a);
	    //s.delete(b);
        t.commit();
	}
	
	public static void updateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
        
		Author a=new Author();
        a.setAid(103);
        a.setAname("Harry");
        a.setAmob(695847);
        a.setFid(1);
        s.update(a);
        t.commit();
        s.close();
		/*
		Book b=new Book();
		b.setBid(1);
		b.setBname("java");
		b.setISBN("ISBN1236");
		
		Author a1=new Author();
		 a1.setAid(101);
		 a1.setAname("Bala");
		 a1.setAmob(789654);
		 
		 Author a2=new Author();
		 a2.setAid(102);
		 a2.setAname("John");
		 a2.setAmob(123654);

		 Author a3=new Author();
		 a3.setAid(103);
		 a3.setAname("Paul ");
		 a3.setAmob(56984);

		 Set set=new HashSet();
		 
		 set.add(a1);
		 set.add(a2);
		 set.add(a3);
		 b.setCh(set);

		
		s.update(b);
        t.commit();
        */
	}
	
	
	public static void GetRecord()
	{
		Session s=sf.openSession();
        Author obj=(Author)s.get(Author.class, 101);
		System.out.println("Author ID: "+obj.getAid()+" Author Name: "+obj.getAname()+" Author Mobile"+obj.getAmob());
		s.close();
	}
	
	

	public static void saveRecord()
	{  
		 Session s=sf.openSession();
		 Transaction t=s.beginTransaction();
		 
		 Book b=new Book();
		 b.setBid(1);
		 b.setBname("Java");
		 b.setISBN("ISBN15624");
		 Author a1=new Author();
		 a1.setAid(101);
		 a1.setAname("Bala");
		 a1.setAmob(789654);
		 
		 Author a2=new Author();
		 a2.setAid(102);
		 a2.setAname("John");
		 a2.setAmob(123654);

		 Author a3=new Author();
		 a3.setAid(103);
		 a3.setAname("Paul ");
		 a3.setAmob(56984);

		 Set set=new HashSet();
		 
		 set.add(a1);
		 set.add(a2);
		 set.add(a3);
		 b.setCh(set);
		 s.save(b);
		 t.commit();
	}
}
