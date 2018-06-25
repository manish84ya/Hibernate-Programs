package com.ManyToOne;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class SingerSongs {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Mapping");
	static EntityManager em=emf.createEntityManager();
	
	public static void main(String[] args) 
	{
		//SaveRecord();
		//getRecord();
	}
	public static void getRecord()
	{
		em.getTransaction().begin();
		
		List l=em.createQuery("From Singer").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Singer sin=(Singer)itr.next();
			System.out.println(sin.getSname());
			
		}
	}
	
	public static void SaveRecord()
	{
		em.getTransaction().begin();
		Singer s=new Singer();
		s.setSinger_id(1);
		s.setSname("Kumar Sanu");
		
		Songs s1=new Songs();
		s1.setSongs_id(101);
		s1.setSongs_name("Udh ja re");
		s1.setMusic_comp_name("Pritam");
		s1.setObj(s);
		
		
		Songs s2=new Songs();
		s2.setSongs_id(102);
		s2.setSongs_name("musafir hu");
		s2.setMusic_comp_name("AR Rehman");
		s2.setObj(s);
		
		em.persist(s1);
		em.persist(s2);
		em.getTransaction().commit();
		em.close();
	}

}
