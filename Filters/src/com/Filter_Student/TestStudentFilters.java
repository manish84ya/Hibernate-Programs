package com.Filter_Student;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudentFilters {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) 
	{
	//		insert();
		
		getStudentfilter();
		
	}

	public static void insert() 
	{
	
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			
			Student student = new Student();
			student.setName("Taksh");
			student.setPhone("9945788796");
			student.setStatus("failed");
			student.setDegree("MCA");
			s.save(student);
			tx.commit();
			s.close();
	}
	
	public  static void getStudentfilter()
	{
			//System.out.println("helo"+status);
			Session session =sf.openSession();
			
			Filter filter = session.enableFilter("statusFilter");
			filter.setParameter("status","pass");
			session.enableFilter("studentDegree");
			Filter filter1 = session.enableFilter("studentPhone");
			filter1.setParameter("phone","9600007925");
			
			List list = session.createQuery("From Student").list();
			Iterator itr=list.iterator();
			
	
			while(itr.hasNext())
			{
				Student stu=(Student)itr.next();
				
				System.out.println("ID: " + stu.getId());
				System.out.println("Name: " + stu.getName());
				System.out.println("Degree: " + stu.getDegree());
				System.out.println("Branch: " + stu.getPhone());
				System.out.println("Status: " + stu.getStatus());
				System.out.println("");
			}
			session.disableFilter("statusFilter");
			
		
			
  }

}