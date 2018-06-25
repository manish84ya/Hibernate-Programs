package com.SaveOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("CrudOperation");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		EmployeeDTO e=new EmployeeDTO();
		e.setEname("Manish");
		e.setSalary(25000l);
		e.setDeg("sf dev");
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}


}
