package com.MysqlToHqlQueryOperations;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteQuery {

	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	public void DeleteQueryInHQL()
	{
		Query q=session.createQuery("delete from EmployeeDTO where id=:EID");
		q.setParameter("EID",10);
		int res=q.executeUpdate();
		t.commit();
		System.out.println("Deleted Record Is:"+res);
		
		
	}
}
