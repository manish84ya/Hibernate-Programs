package com.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionFactoryClass {
private static SessionFactory sessionfactory;
private static Session session;
private static Transaction transaction;


public static SessionFactory getSessionFactory()
{
	if(sessionfactory==null)
	{
		sessionfactory=new Configuration().configure().buildSessionFactory();
	}
	return sessionfactory;
}
public static Session getSession()
{
	if(session==null)
	{
		getSessionFactory();
		session=sessionfactory.openSession();
	}
	return session;
}

public static Transaction getTransaction()
{
	if(transaction==null)
	{
		getSession();
		transaction=session.beginTransaction();
	}
	return transaction;
}



}
