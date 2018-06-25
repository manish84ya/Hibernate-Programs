package com.TablePerClass;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestPersonEmployeeOwner {

static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Inherit");
static EntityManager em=emf.createEntityManager();

public static void main(String[] args)
{
	em.getTransaction().begin();
	
	Person p=new Person();
	p.setFirstname("Manish");
	p.setLastname("Chaurasiya");
	
	Employee e=new Employee();
	e.setDepartmentName("CA");
	e.setFirstname("Raman");
	e.setLastname("Kaliya");
	e.setJoiningDate(new Date());
	
	Owner o=new Owner();
	o.setFirstname("Chandan");
	o.setLastname("Gupta");
	o.setStocks(300l);
	o.setPartnershipStake(20l);
	em.persist(p);
	em.persist(e);
	em.persist(o);
	em.getTransaction().commit();
	em.close();

}

}
