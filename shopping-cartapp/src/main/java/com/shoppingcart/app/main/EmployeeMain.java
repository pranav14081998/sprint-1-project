package com.shoppingcart.app.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoppingcart.app.controller.EmployeeController;
import com.shoppingcart.app.exception.EmployeeNotFoundException;
import com.shoppingcart.app.model.Employee;

@Controller
public class EmployeeMain {

	@Autowired
	private EmployeeController employeeController;
	
	public void employeeRun() {
		System.out.println("\n Employee Entity records :");
		addEmployees(createEmployees());	
	}

	//method to add Employees
	private void addEmployees(List<Employee> employees) {
		for(Employee employee : employees) {
			try {
				employeeController.addEmployee(employee);
			}
			catch (EmployeeNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of Employees
	private List<Employee> createEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Singh", "Shivam", "Part Time", "shiv123@gmail.com", 
				"COMTECH21", "Shivam Singh", "Cloud server", null, null, null);
		
		Employee e2 = new Employee("Kandu", "Rahul", "Full Time", "roh3kan@outlook.com", 
				"NONTECH14", "Rahul Kandu", "Java Developer", null, null, null);
		
		Employee e3 = new Employee("Sinha", "Priya", "Work From Home", "Priya06@gmail.com", 
				"CAPGNTECH", "Priya Sinha", "System Worker", null, null, null);
		
		Employee e4 = new Employee("Kumar", "Alok", "Full Time", "Alok@yahoo.com", 
				"INFOTECH", "Alok Kumar", "Manager", null, null, null);
		
		Employee e5 = new Employee("Patel", "Mayuri", "Part Time", "may1234@outlook.com", 
				"TCSION", "Alok Das", "President", null, null, null);
	
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		return employees;
	}
}
