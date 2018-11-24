package database;
import java.util.ArrayList;
import company.Employee;

public class EmployeeDatabase {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	int countEmployeeHistory = 0;
	
	public void addEmployee(Employee employee) {
		employee.setIdenticalNumber(this.countEmployeeHistory);
		this.employees.add(employee);
		this.countEmployeeHistory ++;
	}

	public void removeEmployee(String name) {
		
		for(Employee employee : employees) {
			
			if(employee.getName().equals(name)){
				employees.remove(employee);
				break;
			}
			
		}
		
	}
	
}
