package com.PersonPhone;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class TestPersonPhone {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	

	public static void main(String[] args) {
		//saveRecord();
		DeleteRecords();
	}
	
	public static void DeleteRecords()
	{
		Session s=sf.openSession();
		Person b=(Person)s.get(Person.class,new Integer(2));
		Transaction t=s.beginTransaction();
		s.delete(b);
		t.commit();
		s.close();
		
	}
	

	
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Person b=new Person();
		b.setId(2);
		b.setName("mani");
		
		Phone p=new Phone();
		p.setPid(123);
		p.setPhoneType("idea");
	
		Phone p1=new Phone();
		p1.setPid(124);
		p1.setPhoneType("idea");
		
		Set set=new HashSet();
		set.add(p);
		set.add(p1);
		b.setChild(set);
		s.save(b);
		t.commit();
		
	}


}
