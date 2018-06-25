package com.PostsTag;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPostTag {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args)
	{
		SaveRecord();
		GetRecord();
		
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		PostDTO p=new PostDTO();
		p.setPid(1);
		p.setPdate("25/dec/17");
		p.setPdesc("withFnds");
		p.setPtitle("fantastic");
		TagDTO t3=new TagDTO();
		t3.setTid(12);
		t3.setTname("Manish");
		
		TagDTO t1=new TagDTO();
		t1.setTid(25);
		t1.setTname("Chandan");
		
		TagDTO t2=new TagDTO();
		t2.setTid(17);
		t2.setTname("Chandan");
		
		
		Set set=new HashSet();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		p.setTag(set);
		s.save(p);
		t.commit();
		s.close();
	}
	public static void GetRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List l=s.createQuery("From PostDTO").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			PostDTO p=(PostDTO)itr.next();
			System.out.println("Post ID:"+p.getPid());
			System.out.println("Post title:"+p.getPtitle());
			System.out.println("Post Desc:"+p.getPdesc());
			System.out.println("Post Date:"+p.getPdate());

			Set crt=p.getTag();
			Iterator itr1=crt.iterator();
			while(itr1.hasNext())
			{
				TagDTO c=(TagDTO)itr1.next();
				System.out.println("Tag Id:"+c.getTid());
				System.out.println("Tag Name:"+c.getTname());
			}
			System.out.println("-----------------------------------");
				
		}
		
	}

}
