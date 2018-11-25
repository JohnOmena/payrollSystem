package interaction;
import java.util.Scanner;
import company.Employee;
import company.Sale;
import database.AffiliateDatabase;
import database.EmployeeDatabase;
import database.SaleDatabase;
import database.ServiceDatabase;
import useful.Utilities;

public class MainMenu {
	
	
	public void mainMenu(EmployeeDatabase empData, SaleDatabase saleData, AffiliateDatabase affilData, ServiceDatabase servData, Utilities utilities) {
		
		utilities.cleanScreen();
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
		
		MainMenu main = new MainMenu();
		int option = input.nextInt();
		
		main.mainMenuDecision(option, empData, saleData, affilData, servData, main, utilities);
		
	}
	
	public void mainMenuDecision(int option, EmployeeDatabase empData, SaleDatabase saleData, AffiliateDatabase affilData, ServiceDatabase servData, MainMenu main, Utilities utilities) {
		
		Employee employee = new Employee();
		Sale sale = new Sale();
		
		switch(option) {
		
			case 1:
				utilities.cleanScreen();
				empData.addEmployee(employee.createEmployee());
				main.mainMenu(empData, saleData, affilData, servData, utilities);
				break;
			case 2:
				utilities.cleanScreen();
				empData.removeEmployee();
				main.mainMenu(empData, saleData, affilData, servData, utilities);
				break;
			case 3:
				utilities.cleanScreen();
				saleData.addSale(sale.createSale());
				
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