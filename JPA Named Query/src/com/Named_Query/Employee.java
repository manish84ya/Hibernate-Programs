package com.Named_Query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries
(
		{
			@NamedQuery
			(
					name="Select_Query_With_Name",
					query="From Employee e where e.name=:name"
				
			),
			
			@NamedQuery
			(
			name="Select_Query_With_Parameter",
			query="From Employee e where e.name=?"
			)
		}
)

@Entity
@Table(name="Employee")

public class Employee 
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="desg")
	private String desg;
	
	@Column(name="exp")
	private Integer exp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}
	
	
	
	
}
