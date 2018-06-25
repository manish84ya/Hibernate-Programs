package com.MysqlToHqlQueryOperations;

import java.util.*;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GetSomeColumns {
	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	public static void getColumnWithMysql()
	{
		Query q=session.createSQLQuery("select c.id,c.firstname from customerdetail c");
		List<Object[]> l=q.list();
		for(Object[] row:l)
		{
			CustomerDTO obj = new CustomerDTO();
			obj.setId(Integer.parseInt(row[0].toString()));
			obj.setFirstName(row[1].toString());
			System.out.println(obj.getId()+" " +obj.getFirstName());
		}
	}
	
	public static void getColumnWithHQL()
	{
		Query q=session.createQuery("select c.id,c.firstName from CustomerDTO c");
		List l=q.list();
		Iterator itr=l.iterator();
		
		Object[] col;

		while(itr.hasNext())
		{
			col=(Object[])itr.next();
			Integer id=(Integer)col[0];
			String name=(String)col[1];
			System.out.println(id+" "+name);
		}
	}
}
