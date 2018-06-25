package com.MoviesActor;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMoviesActor {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
	  // SaveRecord();
		//getRecord();
	      update();
	    //DeleteRecords();
}
	public static void update()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	
		MoviesDTO obj=(MoviesDTO)s.get(MoviesDTO.class,1 );
		ActorDTO obj1=(ActorDTO)s.get(ActorDTO.class, 1);
		obj1.setAname("Rahim");
		Set set=obj.getChild();
		set.add(obj1);
		obj.setChild(set);
		s.save(obj);
		t.commit();
		s.close();
		
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		MoviesDTO v=new MoviesDTO();
		v.setMid(1);
		v.setMname("Fanna");
		v.setMdur(3);
		
		ActorDTO c1=new ActorDTO();
		c1.setAid(1);
		c1.setAname("Amir");
		
		ActorDTO c2=new ActorDTO();
		c2.setAid(2);
		c2.setAname("ritwik");
		//ONE-TO-MANY...........................................
		
		
		Set set=new HashSet();
		set.add(c1);
		set.add(c2);
	
		v.setChild(set);
		
		
		//MANY-TO-ONE............................................
		
		
		c1.setObj(v);
		c2.setObj(v);
	    
		//Insert Or Save Data Into A field
		s.save(c1);
		//s.save(v);
		
		t.commit();
		s.close();
		
	}
	
}
