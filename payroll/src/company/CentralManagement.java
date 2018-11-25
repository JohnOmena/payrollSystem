package company;
import database.AffiliateDatabase;
import database.EmployeeDatabase;
import database.SaleDatabase;
import database.ServiceDatabase;
import interaction.MainMenu;
import useful.Utilities;

public class CentralManagement {
	
	public static void main(String[] args) {
		
		EmployeeDatabase empData = new EmployeeDatabase();
		SaleDatabase saleData = new SaleDatabase();
		AffiliateDatabase affilData = new AffiliateDatabase();
		ServiceDatabase servData = new ServiceDatabase();
		Utilities utilities = new Utilities();
		MainMenu menu = new MainMenu();
		
		menu.mainMenu(empData, saleData, affilData, servData, utilities);
		
	}

}