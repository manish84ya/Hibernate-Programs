package com.MysqlToHqlQueryOperations;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;

public class UpdateQuery {
static Session session=SessionFactoryClass.getSession();
static Transaction t=SessionFactoryClass.getTransaction();
public static void UpdateQueryInHQL()
{
	String qry="update EmployeeDTO e set e.firstName=:name  where e.id=:id";
	
	Query q=session.createQuery(qry);
	q.setParameter("name","Raman");
	q.setParameter("id",6);
	int res=q.executeUpdate();
    t.commit();
	System.out.println("Rows Affected "+res);
}

}
