package com.Hibernate1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class EmployeeGetDetailList {
public static void main(String[] args)
{
	Session session=SessionFactoryClass.getSession();
	Query q=session.createQuery("from EmployeeDTO");
	List l=q.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		 obj=(EmployeeDTO)itr.next();
		System.out.println("Name: "+obj.getFirstName()+" "+ obj.getLastName()+" Age:"+ obj.getAge()+" Salary:"+ obj.getSalary());
	}
}
}
