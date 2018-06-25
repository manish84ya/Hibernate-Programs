package com.MysqlToHqlQueryOperations;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OrderBy {
	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	
public static void OrderByWithMySQL()
{
	Query q=session.createSQLQuery("select id,firstname from customerdetail where city like 'I%' order by firstname");
	List<Object[]> l=q.list();
	for(Object[] row:l)
	{
		CustomerDTO obj=new CustomerDTO();
		obj.setId(Integer.parseInt(row[0].toString()));
		obj.setFirstName(row[1].toString());
		System.out.println(obj.getId()+" "+obj.getFirstName());
	}
	
}
public static void OrderByWithHQL()
{
	Query q=session.createQuery("from CustomerDTO where city like 'I%' order by firstName desc");
	List l=q.list();
	Iterator itr=l.iterator();
	CustomerDTO obj;
	while(itr.hasNext())
	{
		obj=(CustomerDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName());
	}
}





}
