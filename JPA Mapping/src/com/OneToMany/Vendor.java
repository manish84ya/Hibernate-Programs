package com.OneToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.*;
@Getter
@Setter
@Entity
@Table(name="Vendor")

public class Vendor {
@Id
@Column(name="vid")
private Integer vid;

@Column(name="vname")
private String vname;
@OneToMany(targetEntity=Customer.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinColumn(name="vid",referencedColumnName="vid")
private Set Children;



	
}
