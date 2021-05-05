package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import personinformation.*;

public class MernisServiceAdapters implements CustomerCheckService {

	@Override
	public boolean checkIfRealPreson(Customer customer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(customer.getNationaliyId(),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth());
		} catch (RemoteException e) {
		
			e.printStackTrace();
		}
		return false;
	}

}