package com.BookStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentAddress.Address;

public class TestBookStudent {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	//saveRecord();
	UpdateRecords();
}
public static void UpdateRecords()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Book add=(Book)s.get(Book.class,101);
    add.setBname("Prog");
    s.update(add);
	t.commit();
	s.close();
}

public static void saveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	BStudent bs=new BStudent();
	bs.setSid(555);
	bs.setSname("Manish");
	
	Book b=new Book();
	b.setBid(101);
	b.setBname("c++");
	b.setObj(bs);
	
	Book b1=new Book();
	b1.setBid(102);
	b1.setBname("java");
	b1.setObj(bs);
	
	Book b2=new Book();
	b2.setBid(103);
	b2.setBname("php");
	b2.setObj(bs);
	s.save(b);
	s.save(b1);
	s.save(b2);
	t.commit();
	s.close();
}
}

