package database;
import java.util.ArrayList;
import java.util.Scanner;
import company.TimeCard;


public class TimeCardDatabase {

	ArrayList<TimeCard> timeCards = new ArrayList<TimeCard>();
	Scanner input = new Scanner(System.in);
	
	public void addTimeCard(TimeCard timeCard) {
		this.timeCards.add(timeCard);
	}
	
	
}
