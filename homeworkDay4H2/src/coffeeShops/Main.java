package coffeeShops;


import java.time.LocalDate;
import java.util.Date;
import abstracts.*;
import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import concrete.StarbuckCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbuckCustomerManager(null);
/*	Customer customer = new Customer(1,"Hümeyra","Yusuf",new Date(2002,5,25),"44500823499");*/
		customerManager.save(new Customer(1,"hümeyra","yusuf",2002,(long) 1234523349));
		
		

	}

}

