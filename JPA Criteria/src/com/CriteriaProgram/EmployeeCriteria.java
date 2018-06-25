package com.CriteriaProgram;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*; 

@Entity
@Table(name="e2")
@Data
public class EmployeeCriteria 
{
@Id
@Column(name="id")
private  Integer id;

@Column(name="name")
private String name;



}
