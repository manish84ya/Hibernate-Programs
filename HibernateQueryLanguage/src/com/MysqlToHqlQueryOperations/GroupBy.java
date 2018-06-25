package com.MysqlToHqlQueryOperations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class GroupBy {
static Session session =SessionFactoryClass.getSession();

public static void GroupByMysql()
{
	Query q=session.createSQLQuery("select e.first_name,sum(e.salary) from e2 e group by e.first_name");
	List<Object[]> l=q.list();
	for(Object[] row:l)
	{
		EmployeeDTO obj=new EmployeeDTO();
		obj.setFirstName(row[0].toString());
		obj.setSalary(Integer.parseInt(row[1].toString()));
		System.out.println(obj.getFirstName()+" "+obj.getSalary());
	}
}

public static void GroupByHQL()
{
	Query q=session.createQuery("select e.firstName,e.lastName,sum(e.salary) from EmployeeDTO e group by e.firstName");
	List l=q.list();
	Iterator itr=l.iterator();
	Object[] row;
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		row=(Object[])itr.next();
		String firstname=(String)row[0];
		String lastname=(String)row[1];
		Long sal=(Long)row[2];
		
		System.out.println(firstname+" "+lastname+" "+sal);
				
	}
}

}
