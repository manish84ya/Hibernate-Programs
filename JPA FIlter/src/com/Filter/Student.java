package com.Filter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

@Entity 
@Table(name="Student_Anno")
@FilterDef
(
		name="studentFilter",parameters= 
		{
				@ParamDef(name="maxAge",type="integer"),
				@ParamDef(name="minAge",type="integer"),
				@ParamDef(name="minNumber",type="integer")
				
		}
)
@Filters 
(
		{
			@Filter(name="studentFilter",condition=":minAge<=age and :maxAge>=age"),
			@Filter(name="studentFilter",condition=":minNumber<=number")
		}
)

public class Student 
{
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="name")
	private String name;
	
	@Column(name="number")
	private Integer number;
	
	public Student()
	{
		
	}
	public Student(Integer id,Integer age,String name,Integer number)
	{
		this.id=id;
		this.age=age;
		this.name=name;
		this.number=number;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
}
