package com.Table_Per_Subclass_Hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSubclassPayment {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		CreditCardDTO cc=new CreditCardDTO();
		cc.setPaymentID(103);
		cc.setAmount(1500.0);
		cc.setCreditCardType("Mastero");
		
		ChequeDTO cd=new ChequeDTO();
		cd.setPaymentID(104);
		cd.setAmount(1300.0);
		cd.setChequeType("ICIC");
		
		s.save(cc);
		s.save(cd);
		t.commit();
		s.close();
		
	}
	
	
}
