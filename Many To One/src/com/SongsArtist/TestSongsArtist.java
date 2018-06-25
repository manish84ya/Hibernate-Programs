package com.SongsArtist;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.PatientDoctor.Doctor;
import com.PatientDoctor.Patient;

public class TestSongsArtist {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	//saveRecord();
	getRecord();
}
public static void getRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();

	List st=s.createQuery("from Songs").list();
	
	Iterator itr=st.iterator();
	while(itr.hasNext())
	{
		Songs p=(Songs)itr.next();
		
		System.out.println("Songs ID: " + p.getSid()); 
        System.out.println("Songs Name: " +p.getSname());
        
        Artist doc=p.getObj();
        
        System.out.println("Artist ");
        System.out.println("\tArtist_ID: " + doc.getAid());
        System.out.println("\tArtist Name: " + doc.getAname());
    }
	s.close();
	
}


public static void saveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Artist a=new Artist();
	a.setAid(101);
	a.setAname("Shaan");
	
	Songs s1=new Songs();
	s1.setSid(123);
	s1.setSname("kuch kuch");
	s1.setObj(a);
	Songs s2=new Songs();
	s2.setSid(124);
	s2.setSname("lamhe");
	s2.setObj(a);
	Songs s3=new Songs();
	s3.setSid(125);
	s3.setSname("wada");
	s3.setObj(a);
	s.save(s1);
	s.save(s2);
	s.save(s3);
	t.commit();
	
	
}
}
