package company;

public class TimeCard {
	
	int workedHours;
	int extraHours;
	int employeeIdenticalNumber;
	
	public TimeCard() {
		this.extraHours = 0;
	}
	
	public void setHours(int hours) {
		
		this.workedHours = hours;
	
		if(hours > 8) {
			this.extraHours = hours - 8;
		}
		
	}
	
	public int getWorkedHours() {
		return workedHours;
	}
	
	public int getExtraHours() {
		return extraHours;
	}
	
	public void setEmployeeIdenticalNumber(int identicalNumber) {
		this.employeeIdenticalNumber = identicalNumber;
	}

	public int getEmployeeIdenticalNumber() {
		return employeeIdenticalNumber;
	}

}
