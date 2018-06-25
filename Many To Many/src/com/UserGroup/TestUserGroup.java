package com.UserGroup;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserGroup {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{

		SaveRecord();
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		GroupDTO g=new GroupDTO();
		g.setGid(1);
		g.setName("Azad");
		GroupDTO g1=new GroupDTO();
		g1.setGid(2);
		g1.setName("Parinde");
		UserDTO u=new UserDTO();
		u.setUid(101);
		u.setUsername("Hello");
		u.setPassword("123");
		u.setEmail("a@g");
		u.setUsername("mani");
		
		UserDTO u1=new UserDTO();
		u1.setUid(102);
		u1.setUsername("Hii");
		u1.setPassword("1234");
		u1.setEmail("a@le");
		u1.setUsername("chote");
		
		Set set=new HashSet();
		set.add(u);
		set.add(u1);
		g.setUsers(set);
		g1.setUsers(set);
		s.save(g);
		s.save(g1);
		t.commit();
		s.close();

		
	}

}
