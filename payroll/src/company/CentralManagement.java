package company;
import database.AffiliateDatabase;
import database.EmployeeDatabase;
import database.SaleDatabase;
import database.ServiceDatabase;
import database.TimeCardDatabase;
import interaction.MainMenu;
import useful.Utilities;

public class CentralManagement {
	
	public static void main(String[] args) {
		
		EmployeeDatabase empData = new EmployeeDatabase();
		SaleDatabase saleData = new SaleDatabase();
		AffiliateDatabase affilData = new AffiliateDatabase();
		ServiceDatabase servData = new ServiceDatabase();
		TimeCardDatabase timeData = new TimeCardDatabase();
		MainMenu menu = new MainMenu();
		
		menu.mainMenu(empData, saleData, affilData, servData, timeData);
		
	}

}