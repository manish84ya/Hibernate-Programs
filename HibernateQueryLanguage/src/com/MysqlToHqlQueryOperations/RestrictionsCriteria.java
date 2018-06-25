package com.MysqlToHqlQueryOperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class RestrictionsCriteria 
{
	
static Session session=SessionFactoryClass.getSession();
public static void main(String[] args)
{
	//LikeQueryWithCriteria();
	//IsNullOrNot();
	//OrderbyUsingRestrictions();
	//SelectQueryWithCriteria();
	//LessThanEquals();
	//BetweenQueryWithCriteria();
	//GreaterThanEquals();
	CombineWithOr();
	CombineWithAnd();
}




public static void LikeQueryWithCriteria()
{
	   Criteria crit=session.createCriteria(CustomerDTO.class);
	   crit.add(Restrictions.like("city", "In%"));
		crit.addOrder(Order.asc("firstName"));
	  // crit.add(Restrictions.like("city","%l" ,MatchMode.ANYWHERE));
	   //crit.add(Restrictions.like("city","%l" ,MatchMode.END));
	   //crit.add(Restrictions.like("city","%l" ,MatchMode.EXACT));
	   //crit.add(Restrictions.like("city","%l" ,MatchMode.START));
	   //crit.add(Restrictions.ilike("city", "I%"));
	   //crit.add(Restrictions.ilike("city", "I%", MatchMode.ANYWHERE));
	   //crit.add(Restrictions.isNull("city"));
	   //crit.add(Restrictions.isNotNull("city"));
	  // crit.add(Restrictions.isEmpty("city"));
	   //crit.add(Restrictions.isNotEmpty("city"));
	   
	   List l=crit.list();
	   Iterator itr=l.iterator();
	   CustomerDTO obj;
	   while(itr.hasNext())
	   {
		   obj=(CustomerDTO)itr.next();
		   System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAddress()+" "+obj.getCity()+" "+obj.getContactNumber()+" "+obj.getCountry()+" "+obj.getPostalCode());

	   }
}
public static void IsNullOrNot()
{

	   Criteria crit=session.createCriteria(EmployeeDTO.class);
	   //crit.add(Restrictions.isNull("lastName"));
	   crit.add(Restrictions.isNotNull("lastName"));
	   List l=crit.list();
	   Iterator itr=l.iterator();
	   EmployeeDTO obj;
	   while(itr.hasNext())
	   {
		   obj=(EmployeeDTO)itr.next();
		   System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName());
	     }
}


/*public static void iSEmptyORNot()
{
	IsEmptyByList obj=new IsEmptyByList();
	List l=obj.emptyyy();
	Criteria crit=session.createCriteria(IsEmptyByList.emptyyy());
	//List l1=crit.list();
	crit.add(Restrictions.isEmpty("l"));
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		String v=(String)itr.next();
		System.out.println(v);
	}
	
 /*     Criteria crit=session.createCriteria(IsEmptyByList.class);
	   List l=crit.list();
		crit.add(Restrictions.isEmpty(""));  
	   //crit.add(Restrictions.isEmpty("l"));
	   //crit.add(Restrictions.ne("lastName",""));
	   //crit.add(Restrictions.isNotEmpty("lastName"));
	   
	   //List l=crit.list();
	   
		Iterator itr=l.iterator();
	   IsEmptyByList obj;
	   
	   while(itr.hasNext())
	   {
		   obj=(IsEmptyByList)itr.next();
		   //System.out.println(obj.empty());
		   System.out.println(obj);
	     }
}*/


public static void SelectQueryWithCriteria()
{
	
	Criteria cri=session.createCriteria(CustomerDTO.class);
	List l=cri.list();
	Iterator itr=l.iterator();
	CustomerDTO obj;
	while(itr.hasNext())
	{
		obj=(CustomerDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAddress()+" "+obj.getCity()+" "+obj.getContactNumber()+" "+obj.getCountry()+" "+obj.getPostalCode());
	}
}



public static void OrderbyUsingRestrictions()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	crit.add(Restrictions.like("lastName","C%"));
   //crit.addOrder(Order.asc("firstName"));
	crit.addOrder(Order.desc("firstName"));
	
	   List l=crit.list();
	   Iterator itr=l.iterator();
	   EmployeeDTO obj;
	   while(itr.hasNext())
	   {
		   obj=(EmployeeDTO)itr.next();
		   System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName());

	   }
	
}

public static void BetweenQueryWithCriteria()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	crit.add(Restrictions.between("salary", 10000, 20000));
	//crit.add(Restrictions.ge("salary", 15000));
	//crit.add(Restrictions.gt("salary", 15000));
	//crit.add(Restrictions.le("salary", 15000));
	//crit.add(Restrictions.lt("salary", 25000));
	
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
		
	}
}
public static void LessThanEquals()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	
	crit.add(Restrictions.le("salary", 15000));
		//crit.add(Restrictions.lt("salary", 25000));
		
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
		
	}
}

public static void GreaterThanEquals()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	crit.add(Restrictions.ge("salary", 15000));
		//crit.add(Restrictions.gt("salary", 25000));
		
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
		
	}
}


public static void CombineWithAnd()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	crit.add(Restrictions.eq("firstName", "Manish"));
	crit.add(Restrictions.le("salary", 25000));
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getSalary());
	}
}
public static void CombineWithOr()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	crit.add(Restrictions.or(
			Restrictions.eq("firstName", "Manish"),
			Restrictions.le("salary", 25000)
			));
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getSalary());
	}
}


}

