package syndicate;

import java.util.Scanner;

public class Service {
	
	String service;
	double serviceFee;
	String affiliateName;
	Scanner input = new Scanner(System.in);
	
	public void setService(String service) {
		this.service = service;
	}
	
	public String getService() {
		return service;
	}
	
	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	
	public double getServiceFee() {
		return serviceFee;
	}
	
	public void setAffiliateName(String affiliateName) {
		this.affiliateName = affiliateName;
	}

	public String getIdenticalAffiliate() {
		return affiliateName;
	}
	
	public Service createService() {
		
		Service service = new Service();
		
		System.out.println("What is the name of the service?");
		String serviceName = input.nextLine();
		service.setService(serviceName);
		
		System.out.println("How much is the service fee?");
		double serviceFee = input.nextDouble();
		service.setServiceFee(serviceFee);
		
		System.out.println("What is the name of the affiliate?");
		String affiliateName = input.nextLine();
		service.setAffiliateName(affiliateName);
		
		return service;
	}

}
