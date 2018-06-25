package com.CRUD_Operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteRecord {
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
public static void main(String[] args)
{
	DeleteRecords();
}
public static void DeleteRecords()
{
	EntityManager em=emf.createEntityManager();
	EmployeeDTO e=(EmployeeDTO)em.find(EmployeeDTO.class,2);
	em.getTransaction().begin();
	em.remove(e);
	em.getTransaction().commit();
	em.close();
	emf.close();
	
}

}
