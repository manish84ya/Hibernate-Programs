package com.MysqlToHqlQueryOperations;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HavingQueryExample {
static Session session=SessionFactoryClass.getSession();
public static void HavingWithMySql()
{
	Query q=session.createSQLQuery("select count(id),city from customerdetail  group by city having city='indore' ");
	
	List<Object[]> l=q.list();
	Iterator itr=l.iterator();
	
	  for(Object[] row:l)
		{
			CustomerDTO obj = new CustomerDTO();
			obj.setId(Integer.parseInt(row[0].toString()));
			obj.setFirstName(row[1].toString());
			System.out.println(obj.getId()+" " +obj.getFirstName());
		}
	 }

public static void HavingWithHQL()
{
	Query q=session.createQuery("select count(id),city from CustomerDTO group by city having city='Indore'");
	List l=q.list();
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

/*
public static void HavingWithoutGroupByInHQL()
{
	Query q=session.createQuery("select count(id),city from CustomerDTO having city='Indore'");
	List l=q.list();
	Iterator itr=l.iterator();
	
	Object[] col;

	while(itr.hasNext())
	{
		col=(Object[])itr.next();
		Long id=(Long)col[0];
		String name=(String)col[1];
		System.out.println(id+" "+name);
	}

}*/



}
