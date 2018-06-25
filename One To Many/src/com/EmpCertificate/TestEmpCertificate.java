package com.EmpCertificate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class TestEmpCertificate {

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
		Employee1 obj=(Employee1)s.get(Employee1.class,new Integer(1));
		System.out.println("Employee Details:"+obj.geteId()+" "+obj.geteName());
		Set s1=obj.getChild();
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Certificate c=(Certificate)itr.next();
			System.out.println(c.getCid()+" "+c.getCname()+" "+c.getFid() );
		}
		
	}

	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Employee1 b=new 	Employee1();
		b.seteId(1);
		b.seteName("Manish");
		
		Certificate c=new Certificate();
		c.setCid(101);
		c.setCname("ocjp");
		

		Certificate c1=new Certificate();
		c1.setCid(102);
		c1.setCname("scjp");
		
		Set set=new HashSet();
		set.add(c);
		set.add(c1);
		b.setChild(set);
		s.save(b);
		t.commit();
		
	}
	
}
