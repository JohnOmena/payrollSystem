package company;
import database.EmployeeDatabase;

public class Employee {

	String name;
	String adress;
	String type;
	int comissionRate;
	int identicalNumber;
	
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
	
	public void setComissionRate(int comissionRate) {
		this.comissionRate = comissionRate;
	}
	
	public int getComissionRate() {
		return comissionRate;
	}
	
	
	
}