package com.TeamPlayer;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class TestTeamPlayer {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		saveRecord();
		//getRecord();
		//DeleteRecords();
		//UpdateRecords();
	}
	
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Team b=new Team();
		b.setTid(1);
		b.setTname("kaka");
		
		Player p=new Player();
		p.setPlid(123);
		p.setPname("dhoni");

		Player p1=new Player();
		p1.setPlid(124);
		p1.setPname("yuvraj");
		
		Set set=new HashSet();
		set.add(p);
		set.add(p1);
		b.setChild(set);
		s.save(b);
		t.commit();
		
	}

	
}
