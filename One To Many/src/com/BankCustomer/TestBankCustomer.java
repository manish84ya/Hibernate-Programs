package com.BankCustomer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBankCustomer {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		//saveRecord();
		//getRecord();
		getRecordThroughFILTER();
		//DeleteRecords();
		//UpdateRecords();
	}
	
	public static void UpdateRecords()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Bank b=new Bank();
		b.setBid(124);
		b.setBname("SBI");
		BankCustomer bc=new BankCustomer();
		bc.setCid(12);
		bc.setAcc(66522);
		bc.setCmob(669817);
		bc.setCname("manish");
		
		BankCustomer bc1=new BankCustomer();
		bc1.setCid(222);
		bc1.setAcc(854442);
		bc1.setCmob(78447);
		bc1.setCname("Chandan");
		
		BankCustomer bc2=new BankCustomer();
		bc2.setCid(333);
		bc2.setAcc(54584);
		bc2.setCmob(12494);
		bc2.setCname("Payal");
		
		Set set=new HashSet();
		set.add(bc);
		set.add(bc1);
		set.add(bc2);
		
		b.setCh(set);
		s.update(b);
		t.commit();

		
		
	
	}
	public static void DeleteRecords()
	{
		Session s=sf.openSession();
		//Bank b=(Bank)s.get(Bank.class,new Integer(123));
		BankCustomer b=(BankCustomer)s.get(BankCustomer.class,333);
		Transaction t=s.beginTransaction();
		s.delete(b);
		t.commit();
		s.close();
		
	}
	
	public static void getRecordThroughFILTER()
	{
		Session s=sf.openSession();
		Filter f= s.enableFilter("Bank_name_filter");
		f.setParameter("B_name","SBI");
		
		List l=s.createQuery("from Bank").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Bank b=(Bank)itr.next();
			System.out.println("\tBank name: "+b.getBname());
			Set set=b.getCh();
			Iterator itr1=set.iterator();
			System.out.println("\nCustomer Details Are:");
			while(itr1.hasNext())
			{
				BankCustomer bc=(BankCustomer)itr1.next();
				System.out.println(bc.getCid()+" "+bc.getCname()+" "+bc.getAcc()+" "+bc.getCmob());
				
			}
		}
		s.disableFilter("Bank_name_filter");
		
	}
	
	public static void getRecord()
	{
		Session s=sf.openSession();
		Object obj=s.get(Bank.class,new Integer(124));
		Bank b=(Bank)obj;
		
		System.out.println(b.getBid()+" "+b.getBname());
		Set set=b.getCh();
		Iterator itr=set.iterator();
		System.out.println("\nCustomer Details Are:");
		while(itr.hasNext())
		{
			BankCustomer bc=(BankCustomer)itr.next();
			System.out.println(bc.getCid()+" "+bc.getCname()+" "+bc.getAcc()+" "+bc.getCmob());
			
		}
		
}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Bank b=new Bank();
		b.setBid(124);
		b.setBname("BOB");
		BankCustomer bc=new BankCustomer();
		bc.setCid(11);
		bc.setAcc(65682);
		bc.setCmob(6987);
		bc.setCname("anish");
		
		BankCustomer bc1=new BankCustomer();
		bc1.setCid(222);
		bc1.setAcc(8885442);
		bc1.setCmob(7859847);
		bc1.setCname("Chandani");
		
		BankCustomer bc2=new BankCustomer();
		bc2.setCid(333);
		bc2.setAcc(569458);
		bc2.setCmob(123649);
		bc2.setCname("Pankaj");
		
		Set set=new HashSet();
		set.add(bc);
		set.add(bc1);
		set.add(bc2);
		
		b.setCh(set);
		s.save(b);
		t.commit();
		
	}
	

}
