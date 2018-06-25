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
@Table(name="Team")
@Data
public class TeamDTO 
{
	@Id
	@Column(name="tid")
	private Long tid;
	
	@Column(name="tname")
	private String tname;
	
	@Column(name="tsize")
	private Integer tsize;
	
	@OneToMany(targetEntity=PlayerDTO.class,cascade=CascadeType.ALL)
	@JoinColumn(name="tid",referencedColumnName="tid")
	private Set player;
	

}
