package com.Hibernate1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeUpdate 
{

	public static void main(String[] args)
	{
		EmployeeDTO obj=new EmployeeDTO();
		obj.setId(4);
		obj.setFirstName("Raghav");
		obj.setAge(26);
		obj.setLastName("Raj");
		obj.setSalary(28000);
		//SessionFactory factory=new Configuration().configure().buildSessionFactory();
		//Session s=factory.openSession();
		//Transaction t=s.beginTransaction();
		Session session=SessionFactoryClass.getSession();
		Transaction t=SessionFactoryClass.getTransaction();
		session.update(obj);
		t.commit();
		session.close();
		
		/*
		s.update(obj);
		t.commit();
		s.close();*/
	}

}
