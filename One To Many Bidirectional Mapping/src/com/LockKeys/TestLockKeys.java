package com.LockKeys;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestLockKeys {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//saveRecord();
		UpdateRecord();
	}
	public static void UpdateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		LockDTO l=(LockDTO)s.get(LockDTO.class, 1);
		l.setLcname("Maestro");
		KeysDTO k=(KeysDTO)s.get(KeysDTO.class, 1054);
		k.setKeyPersonName("Taksh");
		Set set=l.getChild();
		set.add(k);
		l.setChild(set);
		s.update(l);
		t.commit();
		s.close();
		
		
		
	}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		LockDTO c=new LockDTO();
		c.setLid(1);
		c.setLcname("Godrej");
		c.setLnumofkey(12);
		
		KeysDTO p1=new KeysDTO();
		p1.setKid(1052);
		p1.setKeyPersonName("Manish");
	
		KeysDTO p2=new KeysDTO();
		p2.setKid(1053);
		p2.setKeyPersonName("Chandan");
		
		KeysDTO p3=new KeysDTO();
		p3.setKid(1054);
		p3.setKeyPersonName("Arpit");
		
		Set set=new HashSet();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		c.setChild(set);
		//s.save(c);
		
		p1.setObj(c);
		p2.setObj(c);
		p3.setObj(c);
		s.save(p1);
		t.commit();
		s.close();
	}


}
