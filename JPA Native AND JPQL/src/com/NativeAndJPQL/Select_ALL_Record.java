package com.NativeAndJPQL;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Select_ALL_Record 
{
	
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
static EntityManager em=emf.createEntityManager();
public static void main(String[] args)
{
	SelectAllRecordSQL();
	//SelectAllRecordJPQL();
}
public static void SelectAllRecordSQL()
{
	List<Object[]> l=em.createNativeQuery("select * from employee").getResultList();
	for(Object[] row:l)
	{
		EmployeeDTO obj=new EmployeeDTO();
		obj.setId(Integer.parseInt(row[0].toString()));
		obj.setEname(row[1].toString());
		obj.setDeg(row[2].toString());
		obj.setSalary(Long.parseLong(row[3].toString()));
		System.out.println("\tEmployee Name:"+obj.getEname());
		System.out.println("\tEmployee Deg:"+obj.getDeg());
		System.out.println("\tEmployee Salary:"+obj.getSalary());
	}

}
public static void SelectAllRecordJPQL()
{
	List l=em.createQuery("from EmployeeDTO").getResultList();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		EmployeeDTO obj=(EmployeeDTO)itr.next();
		System.out.println("\tEmployee Name:"+obj.getEname());
		System.out.println("\tEmployee Deg:"+obj.getDeg());
		System.out.println("\tEmployee Salary:"+obj.getSalary());
	}
	
}
}




