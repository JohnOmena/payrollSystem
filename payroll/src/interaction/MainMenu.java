package interaction;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

import company.Employee;
import company.Sale;
import company.TimeCard;
import database.AffiliateDatabase;
import database.EmployeeDatabase;
import database.SaleDatabase;
import database.ServiceDatabase;
import database.TimeCardDatabase;
import syndicate.Service;
import useful.Utilities;

public class MainMenu {
	
	Scanner input = new Scanner(System.in);
	
	public void mainMenu(EmployeeDatabase empData, SaleDatabase saleData, AffiliateDatabase affilData, ServiceDatabase servData, TimeCardDatabase timeData) {
	
		Utilities utilities = new Utilities();
		utilities.cleanScreen();
		
		System.out.println("------------------------");
		System.out.println("#       Main Menu      #");
		System.out.println("------------------------");
		System.out.println("[1] - Add employee");
		System.out.println("[2] - Remove employee");
		System.out.println("[3] - Launch time card");
		System.out.println("[4] - Launch sale result");
		System.out.println("[5] - Launch service charge");
		System.out.println("[6] - Change an employee details");
		System.out.println("[7] - Turn payroll to today");
		System.out.println("[8] - Undo");
		System.out.println("[9] - Redo");
		System.out.println("[10] - Payment Schedule");
		System.out.println("[11] - Creation of New Payment Bills");
		System.out.println("[0] - Exit");
		System.out.println("--------------------------");
		System.out.println("=> Choose an option: ");
		
		MainMenu main = new MainMenu();
		int option = input.nextInt();
		
		utilities.cleanScreen();
		main.mainMenuDecision(option, empData, saleData, affilData, servData, timeData, main);
		
	}
	
	public void mainMenuDecision(int option, EmployeeDatabase empData, SaleDatabase saleData, AffiliateDatabase affilData, ServiceDatabase servData, TimeCardDatabase timeData, MainMenu main) {
		
		switch(option) {
		
			case 1:
				Employee employee = new Employee();
				employee = employee.createEmployee();
				empData.addEmployee(employee);
				empData.printAllDatabase();
				break;
			case 2:
				empData.removeEmployee();
				empData.printAllDatabase();
				break;
			case 3:
				TimeCard timeCard = new TimeCard();
				timeData.addTimeCard(timeCard.createTimeCard());
				break;
			case 4:
				Sale sale = new Sale();
				saleData.addSale(sale.createSale());
				break;
			case 5:
				Service service = new Service();
				servData.addService(service.createService());
				break;
			case 6:
				DataChangeMenu changeMenu = new DataChangeMenu();
				System.out.println("What is the employee name?");
				String employeeName = input.nextLine();
				changeMenu.dataChangeMenu(employeeName, empData, affilData);
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
		
		System.out.println("\nPress any key to return to the main menu.");
		String pause = input.nextLine();
		main.mainMenu(empData, saleData, affilData, servData, timeData);
		
	}
	
}