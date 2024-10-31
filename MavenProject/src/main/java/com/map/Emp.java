package com.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Emp {
	@Id
	@Column(name="emp_id")
private int empId;
private String name;


@ManyToMany
//@JoinColumn(name="Emp_Pro")

//this help to rename the mid table it means employe_project. 
//emp_pro=table name,       empid=column name,      proid =another columnname
@JoinTable (
		name="emp_pro",
        joinColumns= { @JoinColumn(name="empid")},
        inverseJoinColumns = {@JoinColumn(name="proid")}		
        )
private List<Project> project;


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public List<Project> getProject() {
	return project;
}


public void setProject(List<Project> project) {
	this.project = project;
}


public Emp() {
	super();
	// TODO Auto-generated constructor stub
}




}
