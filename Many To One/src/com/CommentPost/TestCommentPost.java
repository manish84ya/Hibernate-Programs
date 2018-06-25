package com.CommentPost;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentAddress.Address;
import com.StudentAddress.Student;

public class TestCommentPost {
	
	public static void main(String[] args) {

		saveRecord();
	    //getRecord();
	//    DeleteRecords();
		//UpdateRecords();
	}
	public static void saveRecord()
	{

		 SessionFactory sf=new Configuration().configure().buildSessionFactory();

		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Post p=new Post();
		p.setPid(1);
		p.setPtital("Enjoy");
		p.setPdesc("Friends");
		
		Comment c1=new Comment();
		c1.setCid(101);
		c1.setCom("good");
		c1.setCby("chandan");
		c1.setObj(p);
		
		Comment c2=new Comment();
		c2.setCid(201);
		c2.setCom("Awesome");
		c2.setCby("Manish");
		c2.setObj(p);
		
		
		Comment c3=new Comment();
		c3.setCid(301);
		c3.setCom("Nice");
		c3.setCby("Payal");
		c3.setObj(p);
		
		s.save(c1);
		s.save(c2);
		s.save(c3);
		
		t.commit();
		s.close();
		}

}
