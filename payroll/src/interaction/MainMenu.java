package interaction;
import java.util.Scanner;

public class MainMenu {
	
	public static void mainMenu() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("#       Main Menu      #");
		System.out.println("------------------------");
		System.out.println("1 - Add employee");
		System.out.println("1 - Add employee");
		System.out.println("2 - Remove employee");
		System.out.println("3 - Launch time card");
		System.out.println("4 - Launch sale result");
		System.out.println("5 - Launch service charge");
		System.out.println("6 - Change an employee details");
		System.out.println("7 - Turn payroll to today");
		System.out.println("8 - Undo");
		System.out.println("9 - Redo");
		System.out.println("10 - Payment Schedule");
		System.out.println("11 - Creation of New Payment Bills");
		System.out.println("0 - Exit");
		System.out.println("--------------------------");
		System.out.println("Choose an option: ");
		
		int option = input.nextInt();
		
		
		
	}
	
	public void mainMenuDecision(int option) {
		
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
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				
				break;
			case 0:
				
				break;
			default:
                System.out.println("Choose a true option!");
				
		}
		
	}
	
	
}