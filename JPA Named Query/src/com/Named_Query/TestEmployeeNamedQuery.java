package com.Named_Query;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestEmployeeNamedQuery {
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Named_Query");
static EntityManager em=emf.createEntityManager();

public static void main(String[] args)
{
	InsertRecord();
	SelectRecordWithNamedQuery();
}
public static void SelectRecordWithNamedQuery()
{
	em.getTransaction().begin();
/*	
	List l=em.createNamedQuery("Select_Query_With_Name").setParameter("name","Taksh").getResultList();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		Employee e=(Employee)itr.next();
		System.out.println("\tEmployee Name: "+e.getName());
		System.out.println("\tEmployee Desg: "+e.getDesg());
		System.out.println("\tEmployee Exp: "+e.getExp());
		
	}
*/	
	List l1=em.createNamedQuery("Select_Query_With_Parameter").setParameter(1,"Taksh").getResultList();
	for(Iterator itr=l1.iterator();itr.hasNext();)
	{
		Employee e=(Employee)itr.next();
		System.out.println("\tEmployee Name: "+e.getName());
		System.out.println("\tEmployee Desg: "+e.getDesg());
		System.out.println("\tEmployee Exp: "+e.getExp());
		
	}
}
public static void InsertRecord()
{	
	em.getTransaction().begin();
	
	Employee e=new Employee();
	e.setName("Taksh");
	e.setDesg("Python");
	e.setExp(2);
	em.persist(e);
	em.getTransaction().commit();
	

}
}
