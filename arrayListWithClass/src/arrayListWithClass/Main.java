package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"Atakan","Bayrak"));
		customers.add(new Customer(2,"G�lhan","Bayrak"));
		customers.add(new Customer(3,"Ay�a","Bayrak"));
		
		for(Customer customer: customers) {
			System.out.println(customer.firstName) ;
		}
	}

}
