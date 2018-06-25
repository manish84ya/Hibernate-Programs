package com.NativeAndJPQL;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;

public class Projection_And_Restrictions {
	
	public static void main(String[] args)
	{
     	   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("abc");
		   EntityManager entitymanager = emfactory.createEntityManager( );
		 //  CriteriaBuilder criteriaBuilder =  entitymanager.getCriteriaBuilder();
		   
		 //  CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		   //Root<Employee> from = criteriaQuery.from(Employee.class);

	}
	
	/*
	   public static void SelectQueryWithCriteria()
	{
		
		Criteria cri=em.cr
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
*/
}
