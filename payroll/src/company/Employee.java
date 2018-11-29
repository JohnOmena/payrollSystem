package company;
import java.util.Scanner;
import enums.EmployeeType;

public class Employee {

	String name;
	String adress;
	String type;
	String paymentType;
	double comissionRate;
	int identicalNumber;
	
	Scanner input = new Scanner(System.in);
	
	public Employee() {
		this.comissionRate = 0.0;
	}
	
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
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	
	public Employee createEmployee() {
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		String name = input.nextLine();
		employee.setName(name);
		
		System.out.println("Adress: ");
		String adress = input.nextLine();
		employee.setAdress(adress);
		
		System.out.println("Employee type: ");
		System.out.println("[1] Hourly");
		System.out.println("[2] Salaried");
		System.out.println("[3] Salaried and Comissioned");
		System.out.println("=> Choose an option: ");
			
		int option = input.nextInt();
		
		switch(option) {
			
			case 1:
				employee.setType("Hourly");
				break;
			
			case 2:	
				employee.setType("Salaried");
				break;
			case 3:
				employee.setType("SalariedComissioned");
				System.out.println("How much is the commission rate?");
				double comissionRate = input.nextDouble();
				employee.setComissionRate(comissionRate);
				break;
		}
		
		System.out.println("Payment type:\n"
						+ "[1] CheckHands\n"
						+ "[2] CheckMail\n"
						+ "[3] BankAccount\n"
		 				+ "=> Choose an option:");
		
		option = input.nextInt();
		
		switch(option) {
		
			case 1:
				employee.setPaymentType("CheckHands");
				break;
			case 2:	
				employee.setPaymentType("CheckMail");
				break;
			case 3:
				employee.setPaymentType("BankAccount");
				break;
		}
		
		return employee;
	}
	
	public void printDataEmployee(Employee employee) {
		
		System.out.println("\nName: " + employee.getName());
		System.out.println("Adress: " + employee.getAdress());
		System.out.println("Type: " + employee.getType());
		System.out.println("PaymentType: " + employee.getPaymentType());
		System.out.println("ComissionRate: " + employee.getComissionRate());
		System.out.println("Identical Number: " + employee.getIdenticalNumber());
		
	}
	
}