package com.StudentAddress;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CustomerVendor.Customer;
import com.CustomerVendor.Vendor;

public class TestStudentAddress {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		//saveRecord();
	    //getRecord();
	    DeleteRecords();
		//UpdateRecords();
	}
	 public static void DeleteRecords() 
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Student std=(Student)s.get(Student.class,101);
		
		//Query q=s.createQuery("delete Student where Sid=103");
		/*List l=s.createQuery("Student where Sid=103").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student obj=(Student)itr.next();
			int sid=obj.getSid();
			
			List l1=s.createQuery("Address where  ")
		}*/
		//int r=q.executeUpdate();
		//System.out.println("deleted record is"+r);
		//  Address std=(Address)s.get(Address.class, new Integer(2));
		s.delete(std);
		t.commit();
		s.close();
	}
	

	
	public static void UpdateRecords()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Address add=(Address)s.get(Address.class,1);
		add.setCity("Bhopal");
		s.update(add);
		t.commit();
		s.close();
	}
	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	
		List st=s.createQuery("from Student").list();
		
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Student obj=(Student)itr.next();
			System.out.println("Student ID: " + obj.getSid()); 
            System.out.println("Student Name: " +obj.getSname());
            
            Address add=obj.getObj();
            System.out.println("Address ");
            System.out.println("\tCity: " + add.getCity());
            System.out.println("\tState: " + add.getState());
            System.out.println("\tZipcode: " + add.getPin());
		}
		s.close();
		
	}
	
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Address A=new Address();
		A.setAid(1);
		A.setCity("Indore");
		A.setState("MP");
		A.setPin(452001);
		
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("Manish");
		s1.setObj(A);
		
		Student s2=new Student();
		s2.setSid(102);
		s2.setSname("Chandan");
		s2.setObj(A);
		
		s.save(s1);
		s.save(s2);
		t.commit();
		s.close();
		}
}
