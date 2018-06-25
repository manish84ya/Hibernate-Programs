package com.MysqlToHqlQueryOperations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DistinctQuery {
	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	
	public static void SelectDistinctWithMySQL()
	{
		SQLQuery q=session.createSQLQuery("select distinct c.id from customerdetail c");
		
		List<Object[]> l= q.list();
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			Object[] row1 =(Object[])itr.next();
			//Integer id =Integer.parseInt(row1[0].toString()) ; // String.valueOf(row1[0]);
			System.out.println(row1);
			
		}
		/*
	
		for(Object[] row : l)
		{
		CustomerDTO obj = new CustomerDTO();
		obj.setId(Integer.parseInt(row[0].toString()));
		System.out.println(obj.getCity());
		}
		*/
	}
	public static void SelectDistinctWithHQL()
	{
		
	}
	public static void SelectDistinctWithCriteria()
	{
		
	}
	
}
