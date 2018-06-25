package com.PostDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPostDetails {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		Update();
		//SaveRecord();
		//GetRecord();
		//DeleteRecord();
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		PostDetail ps1=new PostDetail();
		ps1.setPdid(1);
		ps1.setCreatedBy("Manish");
		ps1.setCreatedOn("22-04-2018");
		
		Post p=new Post();
		p.setTitle("Happiness");
		p.setPd(ps1);
		s.save(p);
		t.commit();
		s.close();
			
	}
	
	public static void Update()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Post std=(Post)s.get(Post.class, 1);
		std.setTitle("Happy");
		s.update(std);
		t.commit();
		s.close();
	}
}
