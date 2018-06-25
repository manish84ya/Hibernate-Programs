package com.OneToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Mapping");
	static EntityManager em=emf.createEntityManager();
	public static void main(String[] args)
	{
		em.getTransaction().begin();
		Vendor v=new Vendor();
		v.setVid(1);
		v.setVname("Amazon");
		
		Customer c=new Customer();
		c.setCid(1);
		c.setCname("Manish");
		
		Customer c1=new Customer();
		c1.setCid(2);
		c1.setCname("anish");
		
		Customer c2=new Customer();
		c2.setCid(3);
		c2.setCname("Chandan");
		
		Set set=new HashSet();
		set.add(c);
		set.add(c1);
		set.add(c2);
		v.setChildren(set);
		em.persist(v);
		em.getTransaction().commit();
		em.close();
	}
}
