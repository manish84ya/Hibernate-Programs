package com.CartProduct;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class TestCartProduct {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		//saveRecord();
		getRecord();
		//DeleteRecords();
		//UpdateRecords();
	}
	
	public static void getRecord()
	{
		Session s=sf.openSession();
		Object obj=s.get(Cart.class,new Integer(557));
		Cart c=(Cart)obj;
		
		System.out.println(c.getCid()+" "+c.getName());
		Set set=c.getChild();
		Iterator itr=set.iterator();
		System.out.println("\nProduct Details Are:");
		while(itr.hasNext())
		{
			Product bc=(Product)itr.next();
			System.out.println(bc.getPid()+" "+bc.getPname()+" "+bc.getPrice());
			
		}
		
}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		   Cart c=new Cart();
		   c.setCid(557);
		   c.setName("Flipcart");
		   Product p=new Product();
		   p.setPid(145);
		   p.setPname("Mi 5");
		   p.setPrice("7000");
		   Product p1=new Product();
		   p1.setPid(146);
		   p1.setPname("Mi 4");
		   p1.setPrice("9000");
		   Set s1=new HashSet();
		   s1.add(p);
		   s1.add(p1);
		   c.setChild(s1);
		   Transaction t=s.beginTransaction();
			  
		   s.save(c);
		   t.commit();
	}

}
