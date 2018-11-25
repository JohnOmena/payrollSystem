package database;
import java.util.ArrayList;
import java.util.Scanner;
import syndicate.Service;


public class ServiceDatabase {

	ArrayList<Service> services = new ArrayList<Service>();
	Scanner input = new Scanner(System.in);
	
	public void addService(Service service) {
		this.services.add(service);
	}
	
}
