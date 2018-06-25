package com.QuestionAnswer;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class TestQuestionAnswer {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		saveRecord();
		//getRecord();
		//DeleteRecords();
		UpdateRecords();
	}
	
	public static void UpdateRecords()
	{
		
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			
		Question o=new Question();
		o.setId(201);
		o.setQname("what is java?");
		
			Answers a=new Answers();
			a.setId(1);
			a.setAnswername("programming");
			a.setPostedBy("Manish");
			
			Answers a1=new Answers();
			a1.setId(102);
			a1.setAnswername("Plateform");
			a1.setPostedBy("Tarun");
			
			Set set=new HashSet();
			set.add(a);
			set.add(a1);
			o.setChild(set);
			
			s.update(o);
			t.commit();
			
	}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
	Question o=new Question();
	o.setId(1);
	o.setQname("java");
	
		Answers a=new Answers();
		a.setId(1);
		a.setAnswername("Highlevel");
		a.setPostedBy("Manish");
		
		Answers a1=new Answers();
		a1.setId(2);
		a1.setAnswername("Advanced");
		a1.setPostedBy("Tarun");
		
		Set set=new HashSet();
		set.add(a);
		set.add(a1);
		o.setChild(set);
		
		s.save(o);
		t.commit();
		
	}

}
