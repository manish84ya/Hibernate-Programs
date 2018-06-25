package com.ManyToMany;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class TestItemCategory {
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Mapping");
static EntityManager em=emf.createEntityManager();
	public static void main(String[] args) 
	{
		//SaveRecord();
		GetRecord();
	}

	public static void GetRecord()
	{
		em.getTransaction().begin();
	    List l=em.createQuery("from Items").getResultList();
	    for(Iterator itr=l.iterator();itr.hasNext();)
	    {
	    	Items item=(Items)itr.next();
	    	System.out.println("\t Item Name:"+item.getItem_name());
	    	Set set=item.getCategories();
	    	for(Iterator itr1=set.iterator();itr1.hasNext();)
	    	{
	    		Categories cat=(Categories)itr1.next();
	    		System.out.println("\t Categories Name:"+cat.getCname());
	    		
	    	}

	    	System.out.println("------------------------------------");
	    }
	    	
		/*
		em.getTransaction().begin();
	    List l=em.createQuery("from Categories").getResultList();
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
			 
	   }*/
	}

	public static void SaveRecord()
	{
		em.getTransaction().begin();
		Categories c1=new Categories();
	    c1.setCid(1001);
	    c1.setCname("Mobile");
	    
	    Categories c2=new Categories();
	    c2.setCid(1002);
	    c2.setCname("Laptop");
	    
	    Items i1=new Items();
	    i1.setIid(5000);
	    i1.setItem_name("Mi 5A");
	    
	    Items i2=new Items();
	    i2.setIid(5010);
	    i2.setItem_name("Lenovo ez");
	    Set set=new HashSet<>();
	    
	    set.add(i1);
	    set.add(i2);
	    
	    c1.setItems(set);
	    c2.setItems(set);
	    em.persist(c1);
	    em.persist(c2);
	    em.getTransaction().commit();
	    em.close();
	}
}
