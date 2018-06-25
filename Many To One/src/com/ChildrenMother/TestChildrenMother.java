package com.ChildrenMother;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentAddress.Student;

public class TestChildrenMother {
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
       Children std=(Children)s.get(Children.class,110);
	    s.delete(std);
		t.commit();
		s.close();
	}
	

	public static void 	saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Mother m=new Mother();
		m.setMid(1);
		m.setMname("rechal");
		
		Children c=new Children();
		c.setCid(101);
		c.setCname("pappu");
		c.setCage(5);
		c.setObj(m);
		
		Children c1=new Children();
		c1.setCid(102);
		c1.setCname("pappi");
		c1.setCage(15);
		c1.setObj(m);
		
		Children c2=new Children();
		c2.setCid(103);
		c2.setCname("annu");
		c2.setCage(19);
		c2.setObj(m);
		
		s.save(c);
		s.save(c1);
		s.save(c2);
		t.commit();
		s.close();
	}
	
	
}
