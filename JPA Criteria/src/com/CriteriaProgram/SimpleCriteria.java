package com.CriteriaProgram;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class SimpleCriteria 
{
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_Criteria");
	static EntityManager em=emf.createEntityManager();
	public static void main(String[] args)
	{
		em.getTransaction().begin();
		CriteriaBuilder cri=em.getCriteriaBuilder();
		CriteriaQuery<Object> cq=cri.createQuery();
		Root<EmployeeCriteria> from=cq.from(EmployeeCriteria.class);
		
		System.out.println("Select All Record");
		cq.select(from);
		Query qry=em.createQuery(cq);
		   List<Object> resultlist = qry.getResultList();

		   for(Object o:resultlist)
		   {
		      EmployeeCriteria e = (EmployeeCriteria)o;
		      System.out.println(" Ename : " + e.getName());
		   }
		
		
	}
	public static void SaveRecord()
	{
		em.getTransaction().begin();
		EmployeeCriteria e=new EmployeeCriteria();
		e.setId(4);
		e.setName("Manish");
		
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
