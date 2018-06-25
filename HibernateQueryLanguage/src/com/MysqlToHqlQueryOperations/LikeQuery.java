package com.MysqlToHqlQueryOperations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class LikeQuery {
	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	
	public static void LikeWithMysql()
	{
		SQLQuery q=session.createSQLQuery("select * from customerdetail where city like 'b%'");
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
   public static void LikeWithHQL()
   {
	   Query q=session.createQuery("from CustomerDTO  where city like 'In%' ");
	   List l=q.list();
	   Iterator itr=l.iterator();
	   CustomerDTO obj;
	   while(itr.hasNext())
	   {
	
		   obj=(CustomerDTO)itr.next();
		  
			System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAddress()+" "+obj.getCity()+" "+obj.getContactNumber()+" "+obj.getCountry()+" "+obj.getPostalCode());
		 }
	}
   
      
	
}
