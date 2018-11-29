package database;
import java.util.ArrayList;
import java.util.Scanner;

import company.Employee;
import company.TimeCard;


public class TimeCardDatabase {

	ArrayList<TimeCard> timeCards = new ArrayList<TimeCard>();
	Scanner input = new Scanner(System.in);
	
	public void addTimeCard(TimeCard timeCard) {
		this.timeCards.add(timeCard);
	}
	
	public void printTimeCardDatabase() {
		
		System.out.println("\nUpdated time card database:");
		
		for(TimeCard timeCard : this.timeCards) {
			timeCard.printDataTimeCard(timeCard);
		}
		
	}
		
	
}
