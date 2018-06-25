package com.MysqlToHqlQueryOperations;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.*;

public class UsingNamedParameter {
static Session session=SessionFactoryClass.getSession();
public static void UsingSetAndGetParameterWithHQL()
{
	Query q=session.createQuery("from EmployeeDTO where id=:emp_id");
	q.setParameter("emp_id", 1);
	List l=q.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName());
			
	}
}
public static void GetIdByCriteriaEq()
{
Criteria crit=session.createCriteria(EmployeeDTO.class);
//crit.add(Restrictions.eq("id", 1));
crit.add(Restrictions.idEq(1));

List l=crit.list();
Iterator itr=l.iterator();
EmployeeDTO obj;
while(itr.hasNext())
{
	obj=(EmployeeDTO)itr.next();
	System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName());
	
}
}

}
