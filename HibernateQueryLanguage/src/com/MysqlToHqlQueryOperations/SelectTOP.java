package com.MysqlToHqlQueryOperations;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class SelectTOP {
static Session session=SessionFactoryClass.getSession();
public static void SelectTopWithMySQL()
{
	Query q=session.createSQLQuery("select * from e2 where salary limit 3 ");
	List<Object[]> l=q.list();
	Iterator itr=l.iterator();
	Object[] col;
	
	while(itr.hasNext())
	{
		col=(Object[])itr.next();
		Integer id=(Integer)col[0];
		String FN=(String)col[1];
		String LN=(String)col[2];
		Integer ag=(Integer)col[3];
		Integer sal=(Integer)col[4];
		System.out.println(id+" "+FN+" "+LN+" "+ag+" "+sal);

	}
	
	
}






public static void SelectTopWithHQL()
{
	// SQL: SELECT * FROM table LIMIT start, maxRows;
	Query q=session.createQuery("from EmployeeDTO");
	q.setFirstResult(0);
	q.setMaxResults(3);

	
	List l=q.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
			
	}
}

public static void SelectTopWithCriteria()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	//crit.setFirstResult(2);
	crit.setMaxResults(3);
    List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
			
	}
	
}




}
