package company;
import java.util.Scanner;
import enums.EmployeeType;

public class Employee {

	String name;
	String adress;
	String type;
	double comissionRate;
	int identicalNumber;
	Scanner input = new Scanner(System.in);
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setIdenticalNumber(int identicalNumber) {
		this.identicalNumber = identicalNumber;
	}
	
	public int getIdenticalNumber() {
		return identicalNumber;
	}
	
	public void setComissionRate(double comissionRate) {
		this.comissionRate = comissionRate;
	}
	
	public double getComissionRate() {
		return comissionRate;
	}
	
	public Employee createEmployee() {
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		String name = input.nextLine();
		employee.setName(name);
		
		System.out.println("Adress: ");
		String adress = input.nextLine();
		employee.setAdress(adress);
		
		System.out.println("Type: hourly, salaried or comissionedSalaried?");
		String type = input.nextLine();
		employee.setType(type);
		
		if(EmployeeType.commissionedSalaried.equals(type)){
			System.out.println("How much is the commission rate?");
			double comissionRate = input.nextDouble();
			employee.setComissionRate(comissionRate);
		}
		
		return employee;
	}
	
}