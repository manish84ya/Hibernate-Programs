package com.NativeAndJPQL;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;


public class Order_By {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
	static EntityManager em=emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OrderByWithHQL();
		OrderByWithMySQL();

	}
	public static void OrderByWithMySQL()
	{
		List<Object[]> l=em.createNativeQuery("select id,Employe_name from employee where deg like 'd%' order by Employe_name").getResultList();
		for(Object[] row:l)
		{
			EmployeeDTO obj=new EmployeeDTO();
			obj.setId(Integer.parseInt(row[0].toString()));
			obj.setEname(row[1].toString());
			
			System.out.println(obj.getId()+" "+obj.getEname());
		}
		
	}
	public static void OrderByWithHQL()
	{
		List l=em.createQuery("from EmployeeDTO where deg like 'd%' order by ename desc").getResultList();
		Iterator itr=l.iterator();
		EmployeeDTO obj;
		while(itr.hasNext())
		{
			obj=(EmployeeDTO)itr.next();
			System.out.println(obj.getId()+" "+obj.getEname());
		}
	}

}
