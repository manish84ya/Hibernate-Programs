package com.SongsSinger;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestSongsSinger {
	static AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
	static SessionFactory sf=cfg.buildSessionFactory();
	
public static void main(String[] args)
{
	//saveRecord();
	//updateRecord();
	//getRecord();
	
	DeleteRecord();
}
public static void getRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	List l=s.createQuery("From Singer").list();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		Singer sin=(Singer)itr.next();
		System.out.println(sin.getSname());
		
	}
}
public static void DeleteRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	//Singer sin=(Singer)s.get(Singer.class,500);
	Songs son=(Songs)s.get(Songs.class,101);
	
	s.delete(son);
	t.commit();
	s.close();
	
}
public static void updateRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Singer sin=(Singer)s.get(Singer.class,500);
	Songs sn=(Songs)s.get(Songs.class,101);
	sn.setMusic_comp_name("rd verman");
	sn.setObj(sin);
	s.update(sn);
	t.commit();
	s.close();
}
public static void saveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	Singer sin=new Singer();
	sin.setSinger_id(500);
	sin.setSname("Kumar Sanu");
	
	
	Songs s1=new Songs();
	s1.setSongs_id(101);
	s1.setSongs_name("awara hun");
	s1.setMusic_comp_name("ar rehman");
	s1.setObj(sin);
	
	Songs s2=new Songs();
	s2.setSongs_id(102);
	s2.setSongs_name("alla ke bande");
	s2.setMusic_comp_name("preetam");
	s2.setObj(sin);
	
	Songs s3=new Songs();
	s3.setSongs_id(103);
	s3.setSongs_name("wada raha");
	s3.setMusic_comp_name("Nigam");
	s3.setObj(sin);
	
	s.save(s1);
	s.save(s2);
	s.save(s3);
	t.commit();
	s.close();
	
	
}

}
