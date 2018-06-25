package com.MysqlToHqlQueryOperations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AggregateFuntion {
	
	static Session session=SessionFactoryClass.getSession();
	//static Transaction t=SessionFactoryClass.getTransaction();
	
	public static void MinWithMySql()
	{
		 Query q=session.createSQLQuery("select min(salary) from e2");
		 List l=q.list();
		
		 Iterator itr=l.iterator();
		
		  while(itr.hasNext())
		 {
			Integer min=(Integer)itr.next();
			 System.out.println("Min Salary Is:"+min);
		 }
	}
	public static void MaxWithMySql()
	{
		 Query q=session.createSQLQuery("select max(salary) from e2");
		 List l=q.list();
		
		 Iterator itr=l.iterator();
		
		  while(itr.hasNext())
		 {
			Integer max=(Integer)itr.next();
			 System.out.println("Max Salary Is:"+max);
		 }
	}
	
	public static void AvgWithMySql()
	{
		Query q=session.createSQLQuery("select avg(salary) from e2");
		List<Integer> l=q.list();
		
		 Iterator itr=l.iterator();
		
		  while(itr.hasNext())
		 {
			BigDecimal avg=(BigDecimal)itr.next();
			 System.out.println("Avegrage Salary Is:"+avg);
		 }
	
	}
	
	public static void SumWithMySql()
	{
		Query q=session.createSQLQuery("select sum(salary) from e2");
		 List l=q.list();
		
		 Iterator itr=l.iterator();
		
		  while(itr.hasNext())
		 {
			  BigDecimal sum=(BigDecimal)itr.next();
			 System.out.println("Sum Salary Is:"+sum);
		 }
	
		
	}
	
	public static void CountWithMySql()
	{
		Query q=session.createSQLQuery("select count(*) from e2");
		 List l=q.list();
		
		 Iterator itr=l.iterator();
		
		  while(itr.hasNext())
		 {
			BigInteger e=(BigInteger)itr.next();
			 System.out.println("Count Number Of Employee  Is:"+e);
		 }
	
	}
	
	public static void MinWithHQL()
	{
		Query q=session.createQuery("select min(salary) from EmployeeDTO ");
		List l=q.list();
		Integer Minsal=(Integer)l.get(0);
			System.out.println("Min Salary Of Employee:"+Minsal);
	}
	public static void MaxWithHQL()
	{
		Query q=session.createQuery("select max(salary) from EmployeeDTO ");
		List l=q.list();
		Integer Maxsal=(Integer)l.get(0);
			System.out.println("Max Salary Of Employee:"+Maxsal);
	
	}
	
	public static void AvgWithHQL()
	{
		Query q=session.createQuery("select avg(salary) from EmployeeDTO ");
		List l=q.list();
		Double avg=(Double)l.get(0);
		System.out.println("AVG Salary Of Employee:"+avg);
	
	}
	
	public static void SumWithHQL()
	{
		Query q=session.createQuery("select sum(salary) from EmployeeDTO ");
		List l=q.list();
		Long sum=(Long)l.get(0);
			System.out.println("Sum Salary Of Employee:"+sum);
	
	}
	
	public static void CountWithHQL()
	{
		Query q=session.createQuery("select count(salary) from EmployeeDTO ");
		List l=q.list();
		Long c=(Long)l.get(0);
			System.out.println("Count Number  Of Employee:"+c);
	
	}

}
