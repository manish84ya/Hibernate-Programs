package com.QuestionAnswers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestAnswerQuestion {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
	   //SaveRecord();
		getRecord();
		//UpdateRecord();
	    //DeleteRecords();
}
	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List st=s.createQuery("from Question").list();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Question p=(Question)itr.next();
			System.out.println("Question: " +p.getQues());
	        Set set=p.getChild();
	        Iterator itr1=set.iterator();
	        
	        while(itr1.hasNext())
	        {
	        	Answer doc=(Answer)itr1.next();
	        	System.out.println("\tAnswer: " + doc.getAns());
	        }
	     }
		s.close();
		
	}

	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Question q=new Question();
		q.setQid(1);
		q.setQues("Array");
		
		Answer a1=new Answer();
		a1.setAid(10);
		a1.setAns("Homogeneous");
		
		Answer a2=new Answer();
		a2.setAid(5);
		a2.setAns("same elem");
		
		Answer a3=new Answer();
		a3.setAid(8);
		a3.setAns("fix size");
		
		
		//ONE-TO-MANY...........................................
		
		
		Set set=new HashSet();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		q.setChild(set);
		
		
		//MANY-TO-ONE............................................
		
		
		a1.setObj(q);
		a2.setObj(q);
		a3.setObj(q);
	    
		//Insert Or Save Data Into A field
		s.save(a3);
		//s.save(v);
		
		t.commit();
		s.close();
		
	}

}
