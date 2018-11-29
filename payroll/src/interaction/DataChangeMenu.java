package interaction;
import java.util.Scanner;
import database.AffiliateDatabase;
import database.EmployeeDatabase;

public class DataChangeMenu {
	
	Scanner input = new Scanner(System.in);
	
	
	public void dataChangeMenu(String employeeName, EmployeeDatabase empData, AffiliateDatabase affilData) {
			
		System.out.println("------------------------");
		System.out.println("#      Change Menu     #");
		System.out.println("------------------------");
		System.out.println("1 - Change name");
		System.out.println("2 - Change adress");
		System.out.println("3 - Change type");
		System.out.println("4 - Change paymentType");
		System.out.println("5 - Change associaton with syndicate");
		System.out.println("6 - Change syndicate identification");
		System.out.println("7 - Change the syndicate rate");
		System.out.println("0 - Back to main menu");
		System.out.println("--------------------------");
		System.out.println("Choose an option: ");
		
		MainMenu main = new MainMenu();
		int option = input.nextInt();
		
		
	}
	
	public void dataChangeMenuDecision(int option) {
		
		switch(option) {
			
			case 1:
				
				break;
			case 2:
						
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			default:
				System.out.println("Returning to the main menu...");
			
		}
		
		
		
	}
	
	public void changeName() {
		
		System.out.println("What is the new name?");
		
	}
	
	public void changeAdress() {
		
		System.out.println("What is the new adress?");
		
	}

	public void changeEmployeType() {
		
		System.out.println("What is the new type?");
		
	}
	
	public void changePaymentType() {
		
		System.out.println("What is the new payment type?");
		
	}
	
	public void changeMembershipSyndicate() {
		
		System.out.println("Will he join the union?");
		
	}
	
	public void changeUnionIdentification() {
		
		System.out.println("What is the new union identification?");
		
	}

	public void changeSyndicateRate() {
		
		System.out.println("What is the new syndicate rate?");
		
	}
	
	public void optionYesOrNo() {
		
		
		
		
	}
	
	
}
