package com.CustomerSecondLevelCache;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSecondLevelCache {
static Session s=new Configuration().configure().buildSessionFactory().openSession();
	
public static void main(String[] args) {
		saverecord();
		// TODO Auto-generated method stub

	}
public static void saverecord()
{
	Customer c=new Customer();
	c.setId(4);
	c.setMob(1564698l);
	c.setName("mani");
	
	Customer c1=new Customer();
	c1.setId(3);
	c1.setMob(1598l);
	c1.setName("chand");
	
	s.save(c);
	s.save(c1);
	Transaction t=s.beginTransaction();
	t.commit();
	s.close();
	
	
}


}
