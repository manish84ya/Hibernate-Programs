package com.UserProfile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentAddress.AddressDTO;

public class TestUserProfile {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		//SaveRecord();
		//GetRecord();
		DeleteRecord();
	}
	public static void DeleteRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Profile std=(Profile)s.get(Profile.class, 1);
		s.delete(std);
		t.commit();
		s.close();
		
	}
	
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
User u=new User();
u.setUid(1);
u.setUname("chintu");
u.setPw(1234);
u.setEmail("m@gmail");
Profile p=new Profile();
p.setAdd("120");
p.setCity("Indore");
p.setState("MP");
p.setCountry("India");
p.setMob("9630647");
p.setUsr(u);
		s.save(p);
		t.commit();
		s.close();
		
		
	}
}
