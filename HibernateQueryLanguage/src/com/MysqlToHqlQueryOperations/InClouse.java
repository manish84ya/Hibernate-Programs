package com.MysqlToHqlQueryOperations;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.*;
public class InClouse {
	static Session session=SessionFactoryClass.getSession();
public static void InClouseWithMysql()
{
	Query q=session.createSQLQuery("select*from e2 where first_name IN ('Manish','Chandan')");
	List<Object[]> l=q.list();
	Iterator itr=l.iterator();
	
	for(Object row[]:l)
	{
		EmployeeDTO obj=new EmployeeDTO();
		obj.setId(Integer.parseInt(row[0].toString()));
		obj.setFirstName(row[1].toString());
		obj.setLastName(row[2].toString());
		obj.setAge(Integer.parseInt(row[3].toString()));
		obj.setSalary(Integer.parseInt(row[4].toString()));
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
		
	}
}

public static void InClouseWithHql()
{
	Query q=session.createQuery("from EmployeeDTO where age IN ('25','26')");
	//q.setParameter("names", 25);
	List l=q.list();
	Iterator itr=l.iterator();
	
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
		
	}
}

public static void InClouseWithCriteria()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	crit.add(Restrictions.in("age", new Object[] {25,26}));
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
	
	}
	
}
public static void SelectSecondMaxSalaryUsingIn()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	//crit.add(Restrictions.in("age", new Object[] {25,26}));
	ProjectionList p=Projections.projectionList();
	p.add(Projections.max("salary"));
	crit.add(Restrictions.lt("salary",Projections.max("salary")));
	crit.setProjection(p);
	
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	Object[] col;

	while(itr.hasNext())
	{
		col=(Object[])itr.next();
		Integer sum=(Integer)col[0];
		System.out.println(sum);
	//	obj=(EmployeeDTO)itr.next();
		//System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
	
	}
	
}


}
