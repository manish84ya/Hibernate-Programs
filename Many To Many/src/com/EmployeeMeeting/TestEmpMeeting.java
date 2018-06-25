package com.EmployeeMeeting;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentCourses.StudentDTO;


public class TestEmpMeeting {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{

		//SaveRecord();
		//GetRecordStudentToCourse();
		//GetRecordCourseToStudent();
		DeleteRecordsFromStudent();
		//DeleteRecordsFromCourse();
//		UpdateRecordfromStudent();
	}


	public static void DeleteRecordsFromStudent()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		EmpDTO obj=(EmpDTO)s.get(EmpDTO.class, 100);
		s.delete(obj);
		t.commit();
		s.close();
	}
public static void SaveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	EmpDTO s1=new EmpDTO();
	s1.setEid(100);
	s1.setEname("Mani");
	s1.setEsal("25000");
	EmpDTO s2=new EmpDTO();
	s2.setEid(101);
	s2.setEname("chandu");
	s2.setEsal("25000");
	
	MeetingDTO c1=new MeetingDTO();
	c1.setMid(500);
	c1.setSubject("hib");
	c1.setMd("18");
	
	
	MeetingDTO c2=new MeetingDTO();
	c2.setMid(501);
	c2.setSubject("pojo");
	c2.setMd("19");
	
	Set set=new HashSet();
	set.add(c1);
	set.add(c2);
	
	s1.setMeeting(set);
	s2.setMeeting(set);
	s.save(s1);
	s.save(s2);
	t.commit();
	s.close();
		
	
}

}
