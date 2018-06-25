package com.Table_Per_Concrete_Class_Hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestConcreteClassPayment {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		ChequeConcreteClass c=new ChequeConcreteClass();
		c.setPaymentID(103);
		c.setAmount(1500.0);
		c.setChequeType("sbi");
		
		CreditCardConcreteClass cc=new CreditCardConcreteClass();
		cc.setPaymentID(104);
		cc.setCreditCardType("ICIC");
		cc.setAmount(1500.0);
		s.save(c);
		s.save(cc);
		t.commit();
		s.close();
	}
}
