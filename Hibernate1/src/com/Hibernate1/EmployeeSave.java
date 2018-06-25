package com.Hibernate1;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeSave {


	public static void main(String[] args)
	{
		EmployeeDTO obj=new EmployeeDTO();
		obj.setFirstName("Pawan");
		obj.setLastName("Yadav");
		obj.setAge(20);
		obj.setSalary(6900);
		Session session=SessionFactoryClass.getSession();
		Transaction t=SessionFactoryClass.getTransaction();
		session.save(obj);
		t.commit();
		session.close();
		
	}
}
