package com.StudentCourses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSC {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{

	//SaveRecord();
	GetRecordStudentToCourse();
	//GetRecordCourseToStudent();
	//DeleteRecordsFromStudent();
	//DeleteRecordsFromCourse();
	//UpdateRecordfromStudent();
}

public static void UpdateRecordfromStudent()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	StudentDTO stu=(StudentDTO)s.get(StudentDTO.class, 1000);
	//stu.setMarks(85);
	CourseDTO crc=(CourseDTO)s.get(CourseDTO.class, 5000);
	crc.setCdur(60);
	Set set=stu.getCourses();
	set.add(crc);
	stu.setCourses(set);
	s.update(stu);
	t.commit();
	s.close();
	
	
}

public static void DeleteRecordsFromStudent()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	StudentDTO stu=(StudentDTO)s.get(StudentDTO.class, 1000);
	s.delete(stu);
	t.commit();
	s.close();
}
public static void DeleteRecordsFromCourse()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	CourseDTO stu=(CourseDTO)s.get(CourseDTO.class, 5000);
	s.delete(stu);
	t.commit();
	s.close();
}
public static void GetRecordStudentToCourse()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	List std=s.createQuery("from StudentDTO").list();
	Iterator itr=std.iterator();
     while(itr.hasNext())
     {
    	 StudentDTO obj=(StudentDTO)itr.next();
    	 System.out.println("\tName: " + obj.getSname()); 
         System.out.println("\tMarks: " +obj.getMarks()); 
         Set crc=obj.getCourses();
         Iterator itr1=crc.iterator();
         while(itr1.hasNext())
         {
        	 CourseDTO cr=(CourseDTO)itr1.next();
        	 System.out.println("\tCourse Name: " +cr.getCname()); 
             System.out.println("\tDuration: " +cr.getCdur()); 
             
             
         }
         System.out.println("------------------------------"); 
         
     }
	
	
}

public static void GetRecordCourseToStudent()
{

	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	List std=s.createQuery("from CourseDTO").list();
	Iterator itr=std.iterator();
     while(itr.hasNext())
     {
    	 CourseDTO obj=(CourseDTO)itr.next();
    	 System.out.println("Course Name: " +obj.getCname()); 
         System.out.println("CourseDuration: " +obj.getCdur()); 
         Set stu=obj.getStudents();
         Iterator itr1=stu.iterator();
         while(itr1.hasNext())
         {
        	 StudentDTO st=(StudentDTO)itr1.next();
        	 System.out.println("\tStudent Name: " +st.getSname()); 
             System.out.println("\tStudent Marks: " +st.getMarks()); 
         }
         System.out.println("------------------------------"); 
        
     }

}

public static void SaveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	StudentDTO s1=new StudentDTO();
	s1.setSid(1000);
	s1.setSname("Manish");
	s1.setMarks(980);
	
	StudentDTO s2=new StudentDTO();
	s2.setSid(1010);
	s2.setSname("Chandan");
	s2.setMarks(999);
	
	CourseDTO c1=new CourseDTO();
	c1.setCid(5000);
	c1.setCname("Hibernate");
	c1.setCdur(70);
	
	CourseDTO c2=new CourseDTO();
	c2.setCid(5010);
	c2.setCname("Spring");
	c2.setCdur(60);
	
	Set set=new HashSet();
	set.add(c1);
	set.add(c2);
	
	s1.setCourses(set);
	s2.setCourses(set);
	s.save(s1);
	s.save(s2);
	t.commit();
	s.close();
	
	
}

}
