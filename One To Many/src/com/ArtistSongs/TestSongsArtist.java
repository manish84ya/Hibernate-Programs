package com.ArtistSongs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSongsArtist {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
	//saveRecord();
		UpdateRecord();
	getRecord();
}
	/*
	  public void updateEmployee(Integer EmployeeID, int salary ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try {
	         tx = session.beginTransaction();
	         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
	         employee.setSalary( salary );
	         session.update(employee);
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }*/
	
	public static void UpdateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Artist a=(Artist)s.get(Artist.class, new Integer(101));
		a.setAname("K Sanu");
		s.update(a);
		t.commit();
		s.close();
	}
	
	
public static void getRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	List st=s.createQuery("from Artist").list();
	Iterator itr=st.iterator();
	while(itr.hasNext())
	{
		Artist p=(Artist)itr.next();
		System.out.println("Artist ID: " + p.getAid()); 
        System.out.println("Artist Name: " +p.getAname());
        Set set=p.getChild();
        Iterator itr1=set.iterator();
        
        while(itr1.hasNext())
        {
        	Songs doc=(Songs)itr1.next();
        	System.out.println("\tSongs Name: " + doc.getSname());
        }
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
	
	Songs s2=new Songs();
	s2.setSid(124);
	s2.setSname("lamhe");
	Songs s3=new Songs();
	s3.setSid(125);
	s3.setSname("wada");
	
	Set set=new HashSet();
	
	set.add(s1);
	set.add(s2);
	set.add(s3);
	
	a.setChild(set);
	
	s.save(a);
	t.commit();
	
	
}
}
