package syndicate;

public class Service {
	
	String service;
	double serviceFee;
	int identicalAffiliate;
	
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
	
	public void setIdenticalAffiliate(int identicalAffiliate) {
		this.identicalAffiliate = identicalAffiliate;
	}

	public int getIdenticalAffiliate() {
		return identicalAffiliate;
	}
	
}
