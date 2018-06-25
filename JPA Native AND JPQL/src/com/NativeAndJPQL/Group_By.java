package com.NativeAndJPQL;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.sql.*;

import com.mysql.jdbc.MysqlIO;



public class Group_By {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
	static EntityManager em=emf.createEntityManager();
	public static void main(String[] args)
	{
		//GroupBySQL();
		//GroupByHQL();
    }	

	public static void GroupBySQL()
	{

		
		
		List<Object[]> l=em.createNativeQuery("select e.Employe_name,sum(e.salary) from employee e group by e.Employe_name").getResultList();
		for(Object[] row:l)
		{
			EmployeeDTO obj=new EmployeeDTO();
			obj.setEname(row[0].toString());
			obj.setSalary(Long.parseLong(row[1].toString()));
			System.out.println(obj.getEname()+" "+obj.getSalary());
		}
	}

	public static void GroupByHQL()
	{
		List l=em.createQuery("select e.ename,sum(e.salary) from EmployeeDTO e group by e.ename").getResultList();
		Iterator itr=l.iterator();
		Object[] row;
		EmployeeDTO obj;
		while(itr.hasNext())
		{
			row=(Object[])itr.next();
			String ename=(String)row[0];
			Long sal=(Long)row[1];
			
			System.out.println(ename+" "+sal);
					
		}
	}

}
