package com.MysqlToHqlQueryOperations;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ProjectionCriteria {
static Session session=SessionFactoryClass.getSession();

public static void main(String[] args)
{
	//getSomeColumnByProjection();
	//getAggregationByProjection();
	//GroupByProjectionAndRestrictions();
	//HavingWithProjectionAnRestrictions();
	HavingWithProjectionAnRestrictions();
}
public static void getSomeColumnByProjection()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	ProjectionList p=Projections.projectionList();
	p.add(Projections.property("id"));
	p.add(Projections.property("firstName"));
	crit.setProjection(p);
	List<Object[]> l=crit.list();
	Iterator itr=l.iterator();
	
	while(itr.hasNext())
	{
		Object[] row=(Object[])itr.next();
		Integer id=(Integer)row[0];
		String name=(String)row[1];
		System.out.println(id+" "+name);
	}
	
}

public static void getAggregationByProjection()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	ProjectionList p=Projections.projectionList();
     // Count
     //p.add(Projections.count("id"));
     //	p.add(Projections.rowCount());
	
	//Min
	//p.add(Projections.min("salary"));
	
	//Max
	//p.add(Projections.max("salary"));
	
	//Sum
	//p.add(Projections.sum("salary"));
	
	//Avg
	//p.add(Projections.avg("salary"));
	
	//distinct id/salary/lastName
	//p.add(Projections.countDistinct("id"));
	
	
	crit.setProjection(p);
	List l=crit.list();
	
	Integer c=(Integer)l.get(0);
	//Double min=(Double)l.get(0);
	//System.out.println("Count Number  Of Employee:"+c);
	//System.out.println("Min Number Salary "+c);
	//System.out.println("Max Number Salary "+c);
	System.out.println("Sum Of Salary "+c);
	//  System.out.println("Avg salary is"+min);
	  
}

public static void GroupByProjectionAndRestrictions()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	ProjectionList p=Projections.projectionList();
    p.add(Projections.property("firstName"));
    p.add(Projections.property("lastName"));
    p.add(Projections.sum("salary"));
    p.add(Projections.groupProperty("firstName"));
    crit.addOrder(Order.desc("firstName"));
    crit.setProjection(p);
    List l=crit.list();
	
    Iterator itr=l.iterator();
	Object[] row;
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		row=(Object[])itr.next();
		String firstname=(String)row[0];
		String lastname=(String)row[1];
		Integer sal=(Integer)row[2];
		System.out.println(firstname+" "+lastname+" "+sal);
	}
}


public static void HavingWithProjectionAnRestrictions()
{
	Criteria crit=session.createCriteria(CustomerDTO.class);
	ProjectionList p=Projections.projectionList();
	p.add(Projections.count("id"));
	p.add(Projections.property("city"));
	p.add(Projections.groupProperty("city"));
	crit.add(Restrictions.eq("city", "Indore"));
	crit.setProjection(p);
	
	List l=crit.list();
	Iterator itr=l.iterator();
	
	Object[] col;

	while(itr.hasNext())
	{
		col=(Object[])itr.next();
		Integer id=(Integer)col[0];
		String city=(String)col[1];
		System.out.println(id+" "+city);
		
	}
}






}
