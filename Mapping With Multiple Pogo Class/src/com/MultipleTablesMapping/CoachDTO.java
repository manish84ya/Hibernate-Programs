package com.MultipleTablesMapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Coach")
@Data
public class CoachDTO 
{
	@Id
	@Column(name="cid")
	private Long cid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="age")
	private Integer age;
	
	@OneToMany(targetEntity=TeamDTO.class,cascade=CascadeType.ALL)
	@JoinColumn(name="cid",referencedColumnName="cid")
	private Set team;

	
}
