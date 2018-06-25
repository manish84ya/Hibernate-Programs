package com.LibraryFacility;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestLibraryFacility {

static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	
public static void main(String[] args)
{
	SaveRecord();
}
public static void SaveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	LibraryDTO l=new LibraryDTO();
	l.setLid(1);
	l.setLname("central");
	
	LibraryDTO l1=new LibraryDTO();
	l1.setLid(2);
	l1.setLname("Govt");
	
	FacilityDTO f=new FacilityDTO();
	f.setFcode(12);
	f.setFdesc("Digital");
	
	FacilityDTO f1=new FacilityDTO();
	f1.setFcode(15);
	f1.setFdesc("ebook");
	
	Set set=new HashSet();
	set.add(f);
	set.add(f1);
	l.setFacility(set);
	l1.setFacility(set);
	
	s.save(l);
	s.save(l1);
	t.commit();
	s.close();
}

}
