package com.PagesBook;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPagesBook {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	SaveRecord();
}
public static void SaveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	BookDTO b=new BookDTO();
	b.setBid(1);
	b.setBname("Java");
	
	PagesDTO p=new PagesDTO();
	p.setPagenumber(10);
	p.setPheading("Array");
	p.setObj(b);
	
	PagesDTO p1=new PagesDTO();
	p1.setPagenumber(15);
	p1.setPheading("For Loop");
	p1.setObj(b);
	
	s.save(p);
	s.save(p1);
	t.commit();
	s.close();
	
}
}
