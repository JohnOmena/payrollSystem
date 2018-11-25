package database;
import java.util.ArrayList;
import java.util.Scanner;

import company.Employee;

public class EmployeeDatabase {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	int countEmployeeHistory;
	Scanner input = new Scanner(System.in);
	
	public EmployeeDatabase() {
		
		this.countEmployeeHistory = 0;
	
	}
	
	public void addEmployee(Employee employee) {
		
		employee.setIdenticalNumber(this.countEmployeeHistory);
		this.employees.add(employee);
		this.countEmployeeHistory ++;
		System.out.println("Employee added, press any key to return to the main menu.");
		String pause = input.nextLine();
	
	}

	public void removeEmployee() {
		
		Employee employee = new Employee();
		System.out.println("What is the name of the employee to be removed?");
		String name = input.nextLine();
		
		for(Employee empTemp : employees) {
			if(empTemp.getName().equals(name)) {
				employees.remove(empTemp);
			}
		}
		
		System.out.println("Employee removed, press any key to return to the main menu.");
		String pause = input.nextLine();
		
	}
	
	public Employee searchEmployee(String name) {
		
		Employee employee = new Employee();
		
		for(Employee empTemp : employees) {
			if(empTemp.getName().equals(name)) {
				employee = empTemp;
			}
		}

		return employee;
	}
}
