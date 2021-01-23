package com.psl.training.collection.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.psl.training.collection.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		List<String> vehicles1 = new ArrayList<>();
		Employee emp1= new Employee(105, "Ram", "IT", "Pune", Date.valueOf("2012-3-4"));
		Employee emp2 = new Employee(101, "Radha", "Sales", "Pune", Date.valueOf("2013-10-8"));
		Employee emp3=  new Employee(102, "Arjun", "Sales", "Mumbai", Date.valueOf("2014-3-14"));
		Employee emp4 = new Employee(106, "Chintu", "IT", "Pune", Date.valueOf("2012-11-4"));
		Employee emp5 = new Employee(103, "Beena", "Production", "Pune", Date.valueOf("2012-3-24"));
		Employee emp6 = new Employee(104, "Deepak", "IT", "Mumbai", Date.valueOf("2012-5-23"));
		
		vehicles1.add("Honda");vehicles1.add("BMW");vehicles1.add("2Wheeler");
		vehicles1.add("Hyundai");vehicles1.add("Tesla");
		
		emp1.setVehicles(vehicles1);
		
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		empSet.add(emp6);
		System.out.println(empSet);

	}

}
