package com.SongsSinger;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSingerSongs {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	Save();
}
public static void Save()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Singer s1=new Singer();
	s1.setSid(102);
	s1.setSname("Nigam");
	s1.setSage("45");
	
	Songs so=new Songs();
	so.setSoid(101);
	so.setSname("Abhi mujhme");
	
	Songs so1=new Songs();
	so1.setSoid(104);
	so1.setSname("apne");
	
	Songs so2=new Songs();
	so2.setSoid(106);
	so2.setSname("wada raha");
	
	Set set=new HashSet();
	set.add(so);
	set.add(so1);
	set.add(so2);
	s1.setChild(set);
	
	so.setObj(s1);
	so1.setObj(s1);
	so2.setObj(s1);
	
	//s.save(so1);//many to one
	s.save(s1);//one to many
	
	t.commit();
	s.close();
	
	
	
	
	
	
	

}
}
