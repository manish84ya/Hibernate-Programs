package com.Filter;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class TestFilter {
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("filter");
static EntityManager em=emf.createEntityManager();

	public static void main(String[] args) 
	{
		//Insert_Record();
		Get_Filter_Record();
	}
	
	public static void Get_Filter_Record()
	{
		em.getTransaction().begin();
		//Session session = (Session)em.getDelegate();
		
		System.out.println("----Filter Enable--------");
		
		Filter f= ((Session) em).enableFilter("studentFilter");
		
		f.setParameter("maxAge",new Integer(24));
		f.setParameter("minAge",new Integer(22));
		f.setParameter("minNumber",new Integer(39));
	
		List l=em.createQuery("from Student").getResultList();
		
		System.out.println("------------------------");
		
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Student std=(Student)itr.next();
			System.out.println("Name:"+std.getName()+", Age:"+std.getAge()+", Number:"+std.getNumber());
		}
		System.out.println("------------------------");
		
		l=em.createQuery("from Student where id>2").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Student std=(Student)itr.next();
			System.out.println("Name:"+std.getName()+", Age:"+std.getAge()+", Number:"+std.getNumber());
		}
		System.out.println("-------Filter Disable--------");
		
		((Session) em).disableFilter("studentFilter");
		l=em.createQuery("from Student").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Student std=(Student)itr.next();
			System.out.println("Name:"+std.getName()+", Age:"+std.getAge()+", Number:"+std.getNumber());
		}
		em.close();
		
	}





	public static void Insert_Record()
	{
		em.getTransaction().begin();
		Student s1=new Student();
		s1.setId(1);
		s1.setAge(25);
		s1.setName("Manish");
		s1.setNumber(40);
		
		Student s5=new Student();
		s5.setId(5);
		s5.setAge(26);
		s5.setName("Payal");
		s5.setNumber(42);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setAge(23);
		s2.setName("Vishal");
		s2.setNumber(41);
		
		Student s3=new Student();
		s3.setId(3);
		s3.setAge(24);
		s3.setName("Chandan");
		s3.setNumber(39);
		
		Student s4=new Student();
		s4.setId(4);
		s4.setAge(23);
		s4.setName("Taksh");
		s4.setNumber(38);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.getTransaction().commit();
		em.close();
	}

	
	
	
	

}
