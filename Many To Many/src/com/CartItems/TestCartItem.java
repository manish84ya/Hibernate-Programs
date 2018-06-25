package com.CartItems;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCartItem {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{

		SaveRecord();
		
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Items i=new Items();
		
		i.setIid(101);
		i.setPrice(100); 
		i.setDescription("iPhone");
		
		Items i1 = new Items();
		i1.setIid(102);
		i1.setPrice(50); 
		i1.setDescription("iPod");
		
		Cart cart = new Cart();
		cart.setId(501);
		cart.setTotal(150);
		
		Cart cart1 = new Cart();
		cart1.setId(502);
		cart1.setTotal(100);
		
		Set set=new HashSet<>();
		set.add(cart);
		set.add(cart1);
		
		i.setCarts(set);
		i1.setCarts(set);
		
		s.save(i);
		s.save(i1);
		System.out.println("Before committing transaction");
		
		t.commit();
		s.close();
		
		System.out.println("Cart ID="+cart.getId());
		System.out.println("Cart1 ID="+cart1.getId());
		System.out.println("Item1 ID="+i.getIid());
		System.out.println("Item2 ID="+i1.getIid());
		
		
	}

}
