package com.Table_Per_Class_Hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPaymentCreditCardCheque {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	ClientForSave();
}
public static void ClientForSave()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	CreditCard c=new CreditCard();
	c.setPaymentID(102);
	c.setAmount(1500.0);
	c.setCreditCardType("Mastero");
	
	
	Cheque c1=new Cheque();
	c1.setPaymentID(103);
	c1.setAmount(3500.0);
	c1.setChequeType("ICIC");
	s.save(c);
	s.save(c1);
	t.commit();
	s.close();
	
}
}
