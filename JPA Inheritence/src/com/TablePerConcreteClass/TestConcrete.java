package com.TablePerConcreteClass;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class TestConcrete {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Inherit");
	static EntityManager em=emf.createEntityManager();
	
	public static void main(String[] args)
	{
		
		em.getTransaction().begin();
		/*Person_Concrete p=new Person_Concrete();
		p.setPersonId(100l);
		p.setFirstname("Manish");
		p.setLastname("Chaurasiya");
		*/
		Employee_Concrete e=new Employee_Concrete();
		e.setPersonId(201l);
		e.setDepartmentName("CA");
		e.setFirstname("Raman");
		e.setLastname("Kaliya");
		e.setJoiningDate(new Date());
		
		Owner_Concrete o=new Owner_Concrete();
		o.setPersonId(301l);
		o.setFirstname("Chandan");
		o.setLastname("Gupta");
		o.setStocks(300l);
		o.setPartnershipStake(20l);
		
	//	em.persist(p);
		em.persist(e);
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}
}
