package com.backend;

public class Employee 
{
	private int id;
	private String name;
	private int deptid;
	private int salary;
	public Employee(int id, String name, int deptid, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
