package com.NativeAndJPQL;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Aggregation {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
	static EntityManager em=emf.createEntityManager();
	
	public static void main(String[] args) 
	{
		//MinSQL();
		//MinHQL();
		//MaxSQL();
		//MaxHQL();
		//AvgSQL();
		//AvgHQL();
		//SumHQL();
		//SumSQL();
		CountSQL();
		//CountHQL();
	}
	/*
	public static  void MinSQL()
	{
		em.getTransaction().begin();
		Query q=em.createNativeQuery("select min(salary) from employee");
		List l=q.getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			BigInteger sal=(BigInteger)itr.next();
			System.out.println(sal);
			//EmployeeDTO e=(EmployeeDTO)itr.next();
			//System.out.println(e.getEname()+" "+e.getDeg()+" "+e.getSalary());
			
			em.close();
					
		}
		
	}
	public static void MinHQL()
	{
		em.getTransaction().begin();
		List l=em.createQuery("select min(salary) from EmployeeDTO").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Long sal=(Long)itr.next();
			System.out.println(sal);
			em.close();
		}
			
	}
		*/
	////////////////////////////////////////
		/*
	public static  void MaxSQL()
	{
		em.getTransaction().begin();
		Query q=em.createNativeQuery("select max(salary) from employee");
		List l=q.getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			BigInteger sal=(BigInteger)itr.next();
			System.out.println(sal);
			//EmployeeDTO e=(EmployeeDTO)itr.next();
			//System.out.println(e.getEname()+" "+e.getDeg()+" "+e.getSalary());
			em.getTransaction().commit();
			
		}
		
	}
	public static void MaxHQL()
	{
		em.getTransaction().begin();
		List l=em.createQuery("select max(salary) from EmployeeDTO").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Long sal=(Long)itr.next();
			System.out.println(sal);
			em.getTransaction().commit();
		
		}
			
	}
	*/
	////////////////////////////////////////////
	/*
	public static void AvgSQL()
	{
		
		List l=em.createNativeQuery("select avg(salary) from employee").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			BigDecimal avg=(BigDecimal)itr.next();
			 System.out.println("Avegrage Salary Is:"+avg);
		}
		
	
	}
	public static void AvgHQL()
	{
		
		List l=em.createQuery("select avg(salary) from EmployeeDTO").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Double avg=(Double)itr.next();
			 System.out.println("Avegrage Salary Is:"+avg);
		}
		
	
	}
	*/
	////////////////////////////////////
	/*
	public static void SumSQL()
	{
		
		List l=em.createNativeQuery("select sum(salary) from employee").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			BigDecimal sum=(BigDecimal)itr.next();
			 System.out.println("Avegrage Salary Is:"+sum);
		}
		
	
	}
	public static void SumHQL()
	{
		
		List l=em.createQuery("select sum(salary) from EmployeeDTO").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Long sum=(Long)itr.next();
			 System.out.println("Avegrage Salary Is:"+sum);
		}
		
	
	}
	*/
	public static void CountSQL()
	{
		List l=em.createNativeQuery("select count(*) from employee").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			BigInteger sum=(BigInteger)itr.next();
			 System.out.println("Count Number Of Employee  Is:"+sum);
		}
	}
	public static void CountHQL()
	{
		List l=em.createQuery("select count(salary) from EmployeeDTO").getResultList();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Long sum=(Long)itr.next();
			 System.out.println("Count Number Of Employee  Is:"+sum);
		}
	}
	

}
