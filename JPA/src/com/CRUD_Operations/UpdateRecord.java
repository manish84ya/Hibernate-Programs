package com.CRUD_Operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateRecord {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
	public static void main(String[] args)
	{
		UpdateRecords();
	}
	public static void UpdateRecords()
	{
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		EmployeeDTO e=(EmployeeDTO)em.find(EmployeeDTO.class,1);
		e.setDeg("python Developer");
		em.merge(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
