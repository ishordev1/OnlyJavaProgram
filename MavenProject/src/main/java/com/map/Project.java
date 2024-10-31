package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	@Id
	@Column(name="p_id")
private int pid;
	@Column(name="project_name")
	
private String projectName;
@ManyToMany(mappedBy="project")
private List<Emp> emps;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public List<Emp> getEmps() {
	return emps;
}
public void setEmps(List<Emp> emps) {
	this.emps = emps;
}
public Project() {
	super();
	// TODO Auto-generated constructor stub
}



}
