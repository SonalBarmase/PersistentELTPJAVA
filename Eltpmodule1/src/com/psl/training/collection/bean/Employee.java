package com.psl.training.collection.bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparator<Employee>{
	private int empid;
	private String empName;
	private String deptId;
	private String location;
	private Date joinDate;
	List<String> vehicles = new ArrayList<>();
	public List<String> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}
	
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, String deptId, String location, Date joinDate) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.deptId = deptId;
		this.location = location;
		this.joinDate = joinDate;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
