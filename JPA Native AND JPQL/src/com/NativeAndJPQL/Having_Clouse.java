package com.NativeAndJPQL;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

public class Having_Clouse {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
	static EntityManager em=emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HavingWithMySql();
		//HavingWithHQL();
	}

	
	public static void HavingWithMySql()
	{
		
		List<Object[]> l=em.createNativeQuery("select count(id),Employe_name from employee group by salary having salary>25000").getResultList();
		
		Iterator itr=l.iterator();
		
		  for(Object[] row:l)
			{
				EmployeeDTO obj = new EmployeeDTO();
				obj.setId(Integer.parseInt(row[0].toString()));
				obj.setEname(row[1].toString());
				System.out.println(obj.getId()+" " +obj.getEname());
			}
		 }

	public static void HavingWithHQL()
	{
		List l=em.createQuery("select count(id),ename from EmployeeDTO group by salary having salary>25000").getResultList();
		Iterator itr=l.iterator();
		Object[] col;
		while(itr.hasNext())
		{
			col=(Object[])itr.next();
			Long id=(Long)col[0];
			String name=(String)col[1];
			System.out.println(id+" "+name);
		}


	}

}
