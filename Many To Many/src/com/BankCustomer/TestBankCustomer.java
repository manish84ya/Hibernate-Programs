package com.BankCustomer;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestBankCustomer {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{

		//SaveRecord();
		UpdateRecord();
	}
	public static void UpdateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		BankDTO b=(BankDTO)s.get(BankDTO.class, 101);
		
		CustomerDTO c=(CustomerDTO)s.get(CustomerDTO.class, 2);
		c.setAcc(9865);
		Set set=b.getCustomer();
		set.add(c);
		b.setCustomer(set);
		s.update(b);
		t.commit();
		s.close();
		
		
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		BankDTO s1=new BankDTO();
		s1.setBid(101);
s1.setBname("sbi");
s1.setBranch("MIG");

BankDTO s2=new BankDTO();
s2.setBid(102);
s2.setBname("BOB");
s2.setBranch("LIG");

CustomerDTO c1=new CustomerDTO();
c1.setCid(1);
c1.setAcc(1542);
c1.setCname("manis");

CustomerDTO c2=new CustomerDTO();
c2.setCid(2);
c2.setAcc(142);
c2.setCname("chandu");
		Set set=new HashSet();
		set.add(c1);
		set.add(c2);
		s1.setCustomer(set);
		s2.setCustomer(set);
		
		s.save(s1);
		s.save(s2);
		t.commit();
		s.close();
		
		
	}

}
