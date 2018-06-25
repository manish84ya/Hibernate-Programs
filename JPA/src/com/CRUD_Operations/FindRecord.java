package com.CRUD_Operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindRecord {
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");


	public static void main(String[] args) 
	{
		
		GetRecord();
	}
	
	public static void GetRecord()
	{
		EntityManager em=emf.createEntityManager();
		EmployeeDTO obj=(EmployeeDTO)em.find(EmployeeDTO.class,1);
		System.out.println("\tEmployee Name:"+obj.getEname());
		System.out.println("\tEmployee Deg:"+obj.getDeg());
		System.out.println("\tEmployee Salary:"+obj.getSalary());
		em.close();
		emf.close();

	}

}
