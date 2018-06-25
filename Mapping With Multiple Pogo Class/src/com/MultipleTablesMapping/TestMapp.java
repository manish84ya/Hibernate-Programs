package com.MultipleTablesMapping;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestMapp 
{
	static AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
	static SessionFactory sf=cfg.buildSessionFactory();
	
	public static void main(String[] args)
	{
		SaveRecord();
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		CoachDTO ch=new CoachDTO();
		
		ch.setCid(100l);
		ch.setCname("Ravi");
		ch.setAge(55);
		
		TeamDTO tm=new TeamDTO();
		tm.setTid(555l);
		tm.setTname("Rock");
		tm.setTsize(15);
		
		TeamDTO tm1=new TeamDTO();
		tm1.setTid(556l);
		tm1.setTname("Jawaj");
		tm1.setTsize(17);
		
		Set set =new HashSet();
		set.add(tm);
		set.add(tm1);
		ch.setTeam(set);
		
		PlayerDTO pg=new PlayerDTO();
		pg.setPid(777l);
		pg.setPname("Yuvraj");
		pg.setPage(34);
		
		PlayerDTO pg1=new PlayerDTO();
		pg1.setPid(778l);
		pg1.setPname("Rohit");
		pg1.setPage(28);
		
		
		Set set1=new HashSet<>();
		set1.add(pg);
		set1.add(pg1);
		
		tm.setPlayer(set1);
	
		s.save(ch);
		s.save(tm);
		t.commit();
		s.close();
	}

}
