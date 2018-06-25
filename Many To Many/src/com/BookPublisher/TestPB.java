package com.BookPublisher;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPB {
	
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{

		//SaveRecord();
		
		//DeleteRecords();
		UpdateRecord();
	}
	public static void UpdateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		BookDTO stu=(BookDTO)s.get(BookDTO.class, 100);

		PublisherDTO crc=(PublisherDTO)s.get(PublisherDTO.class, 500);
		crc.setPname("Arihant");
		Set set=stu.getPublisher();
		set.add(crc);
		stu.setPublisher(set);
		s.update(stu);
		t.commit();
		s.close();
		
		
	}
	public static void DeleteRecords()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		BookDTO stu=(BookDTO)s.get(BookDTO.class, 200);
		s.delete(stu);
		t.commit();
		s.close();
	}

	
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		BookDTO b1=new BookDTO();
		b1.setBid(100);
		b1.setBname("Java");
		
		BookDTO b2=new BookDTO();
		b2.setBid(101);
		b2.setBname("C++");
		
		PublisherDTO p1=new PublisherDTO();
		p1.setPid(500);
		p1.setPname("Bala");
		
		PublisherDTO p2=new PublisherDTO();
		p2.setPid(501);
		p2.setPname("Nakoda");
		
		Set set=new HashSet();
		set.add(p1);
		set.add(p2);
		
		b1.setPublisher(set);
		b2.setPublisher(set);
		s.save(b1);
		s.save(b2);
		t.commit();
		s.close();
		
		
	}

}
