package com.TablePerSubclass;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSubclass {
	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Inherit");
	static EntityManager em=emf.createEntityManager();
	
			
	public static void main(String[] args)
	{
		em.getTransaction().begin();
		
		Employee_Subclass e=new Employee_Subclass();
		e.setDepartmentName("CA");
		e.setFirstname("Raman");
		e.setLastname("Kaliya");
		e.setJoiningDate(new Date());
		
		Owner_Subclass o=new Owner_Subclass();
		o.setFirstname("Chandan");
		o.setLastname("Gupta");
		o.setStocks(300l);
		o.setPartnershipStake(20l);
		em.persist(e);
		em.persist(o);
		em.getTransaction().commit();
		em.close();

	}
}
