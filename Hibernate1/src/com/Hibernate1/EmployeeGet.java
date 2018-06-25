package com.Hibernate1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeGet {
public static void main(String[] args)
{

	Session session=SessionFactoryClass.getSession();
	Transaction t=SessionFactoryClass.getTransaction();
	EmployeeDTO obj=(EmployeeDTO)session.get(EmployeeDTO.class, 1);
	System.out.println("Employee Name Is"+obj.getFirstName());
	System.out.println("Employee Age Is"+obj.getAge());
	t.commit();
	session.close();
	
/*SessionFactory factory=new Configuration().configure().buildSessionFactory();	
Session session=factory.openSession();
Transaction t=session.beginTransaction();
EmployeeDTO obj=(EmployeeDTO)session.get(EmployeeDTO.class, 1);
System.out.println("Employee Name Is"+obj.getFirstName());
System.out.println("Employee Age Is"+obj.getAge());
session.close();

*/
}
}
