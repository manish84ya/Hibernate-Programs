package com.ItemCategories;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestCategoryItems {
	static AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
	static SessionFactory sf=cfg.buildSessionFactory();
	public static void main(String[] args)
	{
	//	SaveRecord();
		//UpdateRecord();
		DeleteRecord();
		//GetRecord();
	}
	public static void DeleteRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Categories c=(Categories)s.get(Categories.class,101);
		Items i=(Items)s.get(Items.class,500);
		
		Set set =c.getItems();
		set.remove(i);
		c.setItems(set);
		s.save(c);
		
		t.commit();
		s.close();
		
	}
	public static void UpdateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Categories c=(Categories)s.get(Categories.class,101);
		Set set=c.getItems();
		Items i=(Items)s.get(Items.class,500);
	    i.setItem_name("Mi Note 5");
	    set.add(i);
	    c.setItems(set);
	    s.update(c);
	    t.commit();
	    s.close();
	}
	public static void GetRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    List l=s.createQuery("from Categories").list();
	    for(Iterator itr=l.iterator();itr.hasNext();)
	    {
	    	Categories c=(Categories)itr.next();
	    	System.out.println("\t Categories Name:"+c.getCname());
	    	Set set=c.getItems();
	    	for(Iterator itr1=set.iterator();itr1.hasNext();)
	    	{
	    		Items i=(Items)itr1.next();
	    		System.out.println("\t Item Name:"+i.getItem_name());
		   }
	    	System.out.println("------------------------------------");
			 
	   }
	}
	public static void SaveRecord() 
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    Categories c1=new Categories();
	    c1.setCid(101);
	    c1.setCname("Mobile");
	    
	    Categories c2=new Categories();
	    c2.setCid(102);
	    c2.setCname("Laptop");
	    
	    Items i1=new Items();
	    i1.setIid(500);
	    i1.setItem_name("Mi 5A");
	    
	    Items i2=new Items();
	    i2.setIid(501);
	    i2.setItem_name("Lenovo ez");
	    Set set=new HashSet<>();
	    
	    set.add(i1);
	    set.add(i2);
	    
	    c1.setItems(set);
	    c2.setItems(set);
	    
	    s.save(c1);
	    s.save(c2);
	    t.commit();
	    s.close();
	    
	    
	    
	    
	}

}
