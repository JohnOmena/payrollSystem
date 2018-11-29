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
	
	}

	public void removeEmployee() {
		
		Employee employee = new Employee();
		System.out.println("What is the name of the employee to be removed?");
		String name = input.nextLine();
		
		for(Employee empTemp : employees) {
			if(empTemp.getName().equals(name)) {
				employees.remove(empTemp);
				break;
			}
		}

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

	public void updateWorkerData(String name) {
		
		System.out.println("What is the new employee's name?");
		String nameAtt = input.nextLine();
		
		System.out.println("What is the new adress?");
		String adressAtt = input.nextLine();
		
		System.out.println("What is the new type of employee?");
		String typeAtt = input.nextLine();
		
		System.out.println("What is the new paymentType? checkHands, checkMail or bankAccount?");
		String paymentTypeAtt = input.nextLine();
		
	}
	
	public void printEmployeeDatabase() {
		
		System.out.println("\nUpdated employee database:");
		
		for(Employee employee : this.employees) {
			employee.printDataEmployee(employee);
		}
		
	}
	
}
