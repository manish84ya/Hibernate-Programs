package com.MysqlToHqlQueryOperations;

import java.util.*;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CombineTwoOrMoreCriteria {
	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	
	public static void Combine()
	{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
    //crit.add(Restrictions.gt("salary", 20000));
	//crit.add(Restrictions.ilike("firstName", "M%"));
	crit.add(Restrictions.or(
			Restrictions.gt("salary",20000), 
			Restrictions.ilike("firstName","M%"))
			);
    List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getSalary());
	}
	

	}
	}
