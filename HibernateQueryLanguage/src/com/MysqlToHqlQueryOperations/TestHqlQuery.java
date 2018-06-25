package com.MysqlToHqlQueryOperations;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestHqlQuery {
	
public static void main(String[] args)
{
Session session=SessionFactoryClass.getSession();
Transaction t=SessionFactoryClass.getTransaction();
/*
InsertQuery in=new InsertQuery();
System.out.println("Insert Record In customerdetail Table With HQL :");
in.SaveByHQL();
System.out.println("--------------------------------------");
*/

/*
SelectQuery sq=new SelectQuery();
System.out.println("Select All Record In Table With Mysql :");
sq.SelectQueryWithSql();
System.out.println("--------------------------------------");

System.out.println("Select All Record In Table With HQL :");
sq.SelectQueryWithHQL();
System.out.println("--------------------------------------");

System.out.println("Select All Record In Table With HQL Using CRITERIA :");
sq.SelectQueryWithCriteria();
System.out.println("--------------------------------------");
*/

/*
DistinctQuery dq=new DistinctQuery();
System.out.println("Select All Distinct Record In Table With MySQL :");
dq.SelectDistinctWithMySQL();
System.out.println("--------------------------------------");
System.out.println("Select All Distinct Record In Table With MySQL :");
dq.SelectDistinctWithHQL();
System.out.println("--------------------------------------");
*/
/*
System.out.println("Like With MySQL");
System.out.println();
LikeQuery like=new LikeQuery();
like.LikeWithMysql();
System.out.println();

System.out.println("Like With HQL");
System.out.println();
like.LikeWithHQL();
System.out.println();
*/
/*
LikeQuery like=new LikeQuery();
System.out.println("Like With Criteria");
System.out.println();
like.LikeQueryWithCriteria();
System.out.println();
*/


/*
System.out.println("Get Particular Column With MySQL");
System.out.println();
GetSomeColumns col=new GetSomeColumns();
col.getColumnWithMysql();
System.out.println();



System.out.println("Get Particular Column With HQL");
System.out.println();
col.getColumnWithHQL();
System.out.println();
*/

/*
System.out.println("Order By WIth MySql");
System.out.println();
OrderBy ord=new OrderBy();
ord.OrderByWithMySQL();
System.out.println();

System.out.println("Order By WIth MySql");
System.out.println();
ord.OrderByWithHQL();
System.out.println();
*/

/*

System.out.println("Aggregation Function With MySQL :MIN()");
AggregateFuntion af=new AggregateFuntion();
af.MinWithMySql();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With MySQL :Max()");
af.MaxWithMySql();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With MySQL :Avg()");
af.AvgWithMySql();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With MySQL :Sum()");
af.SumWithMySql();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With MySQL :Count()");
af.CountWithMySql();
System.out.println("--------------------------------------");



System.out.println("Aggregation Function With HQL :MIN()");
//AggregateFuntion af=new AggregateFuntion();
af.MinWithHQL();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With HQL :MAX()");
af.MaxWithHQL();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With HQL :AVG()");
af.AvgWithHQL();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With HQL :SUM()");
af.SumWithHQL();
System.out.println("--------------------------------------");

System.out.println("Aggregation Function With HQL :Count()");
af.CountWithHQL();
System.out.println("--------------------------------------");
*/

/*
GroupBy gf=new GroupBy();
System.out.println("Group By With MySQL");
gf.GroupByMysql();
System.out.println("--------------------------------------");

System.out.println("Group By With MySQL");
gf.GroupByHQL();
System.out.println("--------------------------------------");
*/

/*
SearchWithWhere search =new SearchWithWhere();
System.out.println("Group By With MySQL");
search.SearchWithMysql();
System.out.println("--------------------------------------");

System.out.println("Group By With HQL");
search.SearchWithHQL();
System.out.println("--------------------------------------");
*/

/*
UsingNamedParameter UNP=new UsingNamedParameter();
System.out.println("Select Record With Set Parameter With HQL");
UNP.UsingSetAndGetParameterWithHQL();
System.out.println("--------------------------------------");

System.out.println("Select Record With Set Parameter With Criteria Equal");
UNP.GetIdByCriteriaEq();
System.out.println("--------------------------------------");
*/

/*
UpdateQuery Uq=new UpdateQuery();
System.out.println("Select Record With Set Parameter With HQL");
Uq.UpdateQueryInHQL();
System.out.println("--------------------------------------");
*/

/*
DeleteQuery dq=new DeleteQuery();
System.out.println("Deleted Record With Set Parameter With HQL");
dq.DeleteQueryInHQL();
System.out.println("--------------------------------------");
*/


SelectTOP st=new SelectTOP();
/*System.out.println("select Top 3 record With MySQL");
st.SelectTopWithMySQL();
System.out.println("--------------------------------------");


System.out.println("select Top 3 record With HQL");
st.SelectTopWithHQL();
System.out.println("--------------------------------------");

System.out.println("select Record Except first 2 record  Criteria");
st.SelectTopWithCriteria();
System.out.println("--------------------------------------");
*/


/*BetweenOrRange bor=new BetweenOrRange();
System.out.println("Between Query In MySql");
bor.BetweenQueryInMySQL();
System.out.println("--------------------------------------");

System.out.println("Between Query In HQL");
bor.BetweenQueryHQL();
System.out.println("--------------------------------------");

System.out.println("Between Query In Criteria HQL");
bor.BetweenQueryWithCriteria();
System.out.println("--------------------------------------");
*/

/*
HavingQueryExample hqe= new HavingQueryExample();
System.out.println("Having Clouse With Mysql");
hqe.HavingWithMySql();
System.out.println("--------------------------------------");

System.out.println("Having Clouse With Hql");
hqe.HavingWithHQL();
System.out.println("--------------------------------------");
*/
/*
System.out.println("Having Clouse Without Group By With Hql");
//hqe.HavingWithoutGroupByInHQL();//Error 
System.out.println("--------------------------------------");
*/
/*
System.out.println("Combine two or more criteria With Hql");
CombineTwoOrMoreCriteria cto=new  CombineTwoOrMoreCriteria();
cto.Combine();
System.out.println("--------------------------------------");
*/

InClouse inc=new InClouse();
/*System.out.println("In clouse with mysql");
inc.InClouseWithMysql();
System.out.println("--------------------------------------");
*/
/*
System.out.println("In clouse with Hql");
inc.InClouseWithHql();
System.out.println("--------------------------------------");
*
System.out.println("In clouse with Criteria");
inc.InClouseWithCriteria();
System.out.println("--------------------------------------");
*/
System.out.println("In clouse with Criteria");
inc.SelectSecondMaxSalaryUsingIn();
System.out.println("--------------------------------------");

session.close();

}


}
