package company;

public class Sale {

	String productName;
	int saleValue;
	int employeeIdenticalNumber;
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setSaleValue(int saleValue) {
		this.saleValue = saleValue;
	}
	
	public int getSaleValue() {
		return saleValue;
	}
	
	public void setEmployeeIdenticalNumber(int identicalNumber) {
		this.employeeIdenticalNumber = identicalNumber;
	}
	
	public int getEmployeeIdenticalNumber() {
		return employeeIdenticalNumber;
	}
	
	public Sale createSale() {
		
		Sale sale = new Sale();
		
		System.out.println("Name of the product?");
		
		
		return sale;
	}

}
