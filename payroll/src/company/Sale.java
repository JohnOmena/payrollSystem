package company;

import java.util.Scanner;

public class Sale {

	String productName;
	double saleValue;
	String employeeName;
	Scanner input = new Scanner(System.in);
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setSaleValue(double saleValue) {
		this.saleValue = saleValue;
	}
	
	public double getSaleValue() {
		return saleValue;
	}
	
	public void setEmployee(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeIdenticalNumber() {
		return employeeName;
	}
	
	public Sale createSale() {
		
		Sale sale = new Sale();
		
		System.out.println("Name of the product?");
		String productName = input.nextLine();
		sale.setProductName(productName);
		
		System.out.println("How much is this product?");
		double saleValue = input.nextDouble();
		sale.setSaleValue(saleValue);
		
		System.out.println("Who sold the product?");
		String employeeName = input.nextLine();
		sale.setEmployee(employeeName);
				
		return sale;
	}

}
