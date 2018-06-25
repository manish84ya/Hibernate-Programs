package com.CRUD_Operations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class EmployeeDTO 
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer Id;
	
	@Column(name="Employe_name")
	private String ename;
	
	@Column(name="deg")
	private String deg;
	
	@Column(name="salary")
	private Long salary;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	 
	
}
