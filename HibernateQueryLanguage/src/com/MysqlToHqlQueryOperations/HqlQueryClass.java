package com.MysqlToHqlQueryOperations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HqlQueryClass {

	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	CustomerDTO obj=new CustomerDTO();

	//Insert Or Create Table..HIBERNATE
    public static void Save()
    {
    	CustomerDTO obj=new CustomerDTO();
    	obj.setFirstName("aanish");
    	obj.setLastName("Chaurasiya");
    	obj.setAddress("303");
    	obj.setCity("Indore");
    	obj.setContactNumber("9770934845");
    	obj.setPostalCode(455263);
    	obj.setCountry("India");
    	session.save(obj);
    	t.commit();
    }
	
	//Select Query for sql
	public static void SelectQueryWithSql()
	{
		SQLQuery q=session.createSQLQuery("select * from customerdetail");
		List<Object[]> l=q.list();
		for(Object[] row : l)
		{
			CustomerDTO obj = new CustomerDTO();
			obj.setId(Integer.parseInt(row[0].toString()));
			obj.setFirstName(row[1].toString());
			obj.setLastName(row[2].toString());
			obj.setAddress(row[3].toString());
			obj.setCity(row[4].toString());
			obj.setContactNumber(row[7].toString());
			obj.setCountry(row[6].toString());
			obj.setPostalCode(Integer.parseInt(row[5].toString()));
			System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAddress()+" "+obj.getCity()+" "+obj.getContactNumber()+" "+obj.getCountry()+" "+obj.getPostalCode());
		}
	
	}
	//select query for hql
	public static void SelectQueryWithHQL()
	{
		Query q=session.createQuery("from CustomerDTO");
		List l=q.list();
		Iterator itr=l.iterator();
		CustomerDTO obj;
		while(itr.hasNext())
		{
			obj=(CustomerDTO)itr.next();
			System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAddress()+" "+obj.getCity()+" "+obj.getContactNumber()+" "+obj.getCountry()+" "+obj.getPostalCode());
				
		}
		
	}
	
	
	public static void SelectDistinctWithMySQL()
	{
		SQLQuery q=session.createSQLQuery("select distinct c.city from customerdetail c");
		List<Object[]> l=q.list();
		
		for(Object[] row : l)
		{
		CustomerDTO obj = new CustomerDTO();
		obj.setId(Integer.parseInt(row[0].toString()));
		obj.setFirstName(row[1].toString());
		obj.setLastName(row[2].toString());
		obj.setAddress(row[3].toString());
		obj.setCity(row[4].toString());
		obj.setContactNumber(row[7].toString());
		obj.setCountry(row[6].toString());
		obj.setPostalCode(Integer.parseInt(row[5].toString()));
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAddress()+" "+obj.getCity()+" "+obj.getContactNumber()+" "+obj.getCountry()+" "+obj.getPostalCode());
		}
		
	}
	
	
	
}
