package com.TeacherClasses;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class TestTeacherClasses {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] arg)
	{
		saveRecord();
	}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		
		Teacher t=new Teacher();
		t.setTid(101);
		t.setTname("ram");
		t.setTmob("4587");
	 
		Classes c=new Classes();
		c.setCid(23);
		c.setCcode(45);
		
		Classes c1=new Classes();
		c1.setCid(24);
		c1.setCcode(46);
		
		
		
		Set set=new HashSet();
		set.add(c);
		set.add(c1);
		
		t.setChild(set);
		s.save(t);
		t1.commit();
		
	}

}
