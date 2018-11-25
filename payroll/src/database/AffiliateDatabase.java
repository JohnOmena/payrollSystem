package database;
import java.util.ArrayList;
import syndicate.Affiliate;

public class AffiliateDatabase {

	ArrayList<Affiliate> affiliates = new ArrayList<Affiliate>();
	int countAffiliateHistory;
	
	public AffiliateDatabase() {
		this.countAffiliateHistory = 0;
	}
	
	public void addAffiliate(Affiliate affiliate) {
		affiliate.setIdenticalAffiliate(this.countAffiliateHistory);
		this.affiliates.add(affiliate);
		this.countAffiliateHistory ++;
	}
	
	public void removeAffiliate(String name) {
		
		for(Affiliate affiliate : affiliates) {
			
			if(affiliate.getAffliliateName().equals(name)){
				affiliates.remove(affiliate);
				break;
			}
	
		}
		
	}
	
}
