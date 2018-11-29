package company;
import java.util.Scanner;

public class TimeCard {
	
	int workedHours;
	int extraHours;
	String employeeName;
	Scanner input = new Scanner(System.in);
	
	public TimeCard() {
		this.extraHours = 0;
	}
	
	public void setHours(int hours) {
		
		this.workedHours = hours;
	
		if(hours > 8) {
			this.extraHours = hours - 8;
			this.workedHours = 8;
		}
		
	}
	
	public int getWorkedHours() {
		return workedHours;
	}
	
	public int getExtraHours() {
		return extraHours;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public TimeCard createTimeCard() {
		
		TimeCard timeCard = new TimeCard();
		
		System.out.println("How many hours worked?");
		int hours = input.nextInt();
		timeCard.setHours(hours);
		input.nextLine();
		
		System.out.println("What is the name of the worker?");
		String employeeName = input.nextLine();
		timeCard.setEmployeeName(employeeName);
		
		return timeCard;
	}

	public void printDataTimeCard(TimeCard timeCard) {
		
		System.out.println("\nNormal hours: " + timeCard.getWorkedHours());
		System.out.println("Extra hours: " + timeCard.getExtraHours());
		System.out.println("EmployeeName: " + timeCard.getEmployeeName());
		
	}
	
}
