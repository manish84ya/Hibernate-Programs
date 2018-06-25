package com.EmployeeNamedQueryWithAnnotations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestEmployeeNamedQuery {
static AnnotationConfiguration cnf=new AnnotationConfiguration().configure();
static SessionFactory sf=cnf.buildSessionFactory();

public static void main(String[] args)
{
	//InsertRecord();
	SelectRecordWithNamedQuery();
}
public static void SelectRecordWithNamedQuery()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	List l=s.getNamedQuery("Select_Query_With_Name").setString("name","Manish").list();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		Employee e=(Employee)itr.next();
		System.out.println("\tEmployee Name: "+e.getName());
		System.out.println("\tEmployee Desg: "+e.getDesg());
		System.out.println("\tEmployee Exp: "+e.getExp());
		
	}
	
	List l1=s.getNamedQuery("Select_Query_With_Parameter").setString(0,"Chandan").list();
	for(Iterator itr=l1.iterator();itr.hasNext();)
	{
		Employee e=(Employee)itr.next();
		System.out.println("\tEmployee Name: "+e.getName());
		System.out.println("\tEmployee Desg: "+e.getDesg());
		System.out.println("\tEmployee Exp: "+e.getExp());
		
	}
	
}
public static void InsertRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	Employee e=new Employee();
	e.setName("Taksh");
	e.setDesg("Python");
	e.setExp(2);
	s.save(e);
	t.commit();
	s.close();
	

}
}
