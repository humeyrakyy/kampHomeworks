package concrete;



import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPreson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
	
}

	
	
	

}
