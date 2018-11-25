package database;
import java.util.ArrayList;
import java.util.Scanner;
import company.Sale;


public class SaleDatabase {

	ArrayList<Sale> sales = new ArrayList<Sale>();
	Scanner input = new Scanner(System.in);
	
	public void addSale(Sale sale) {
		
		this.sales.add(sale);
		System.out.println("Sale added, press any key to return to the main menu.");
		String pause = input.nextLine();
		
	}
	
	
}
