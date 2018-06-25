package com.MysqlToHqlQueryOperations;

import org.hibernate.Query;
import org.hibernate.Session;
import java.util.*;

public class SearchWithWhere {
static Session session=SessionFactoryClass.getSession();
public static void SearchWithMysql()
{
	Query q=session.createSQLQuery("select e.first_name from e2 e where e.last_name=:Name");
	q.setParameter("Name", "Chaurasiya");
	List l=q.list();
	String name=(String)l.get(0);
	System.out.println("Search Name Mysql Is:"+name);
}

public static void SearchWithHQL()
{
	Query q=session.createQuery("select e.lastName from EmployeeDTO e where e.firstName=:Name ");
	q.setParameter("Name", "Manish");
	List l=q.list();
	Iterator itr=l.iterator();
	Object[] row;
	while(itr.hasNext())
	{
		String name=(String)itr.next();
		System.out.println("Search Name By HQL Is:"+name);
	}
}

}
