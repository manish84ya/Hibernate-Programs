package com.FilterStudent;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class TestFilterStudent {
static AnnotationConfiguration cnf=new AnnotationConfiguration().configure();
static SessionFactory sf=cnf.buildSessionFactory();
public static void main(String[] args)
{
	
//Insert_Record();
Get_Filter_Record();	

}

public static void Get_Filter_Record()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	System.out.println("----Filter Enable--------");
	
	Filter f=s.enableFilter("studentFilter");
	f.setParameter("maxAge",new Integer(24));
	f.setParameter("minAge",new Integer(22));
	f.setParameter("minNumber",new Integer(39));
	List l=s.createQuery("from Student").list();
	
	System.out.println("------------------------");
	
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		Student std=(Student)itr.next();
		System.out.println("Name:"+std.getName()+", Age:"+std.getAge()+", Number:"+std.getNumber());
	}
	System.out.println("------------------------");
	
	l=s.createQuery("from Student where id>2").list();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		Student std=(Student)itr.next();
		System.out.println("Name:"+std.getName()+", Age:"+std.getAge()+", Number:"+std.getNumber());
	}
	System.out.println("-------Filter Disable--------");
	
	s.disableFilter("studentFilter");
	l=s.createQuery("from Student").list();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		Student std=(Student)itr.next();
		System.out.println("Name:"+std.getName()+", Age:"+std.getAge()+", Number:"+std.getNumber());
	}
	s.close();
	
}





public static void Insert_Record()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Student s1=new Student();
	s1.setId(1);
	s1.setAge(25);
	s1.setName("Manish");
	s1.setNumber(40);
	
	Student s5=new Student();
	s5.setId(5);
	s5.setAge(26);
	s5.setName("Payal");
	s5.setNumber(42);
	
	Student s2=new Student();
	s2.setId(2);
	s2.setAge(23);
	s2.setName("Vishal");
	s2.setNumber(41);
	
	Student s3=new Student();
	s3.setId(3);
	s3.setAge(24);
	s3.setName("Chandan");
	s3.setNumber(39);
	
	Student s4=new Student();
	s4.setId(4);
	s4.setAge(23);
	s4.setName("Taksh");
	s4.setNumber(38);
	s.save(s1);
	s.save(s2);
	s.save(s3);
	s.save(s4);
	s.save(s5);
	t.commit();
	s.close();
}



}
