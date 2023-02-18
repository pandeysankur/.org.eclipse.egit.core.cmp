package abstrac_Method;

import java.util.ArrayList;
import java.util.List;

public class C_Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.customerId = "1001";
		customer.customerName = "Ashish Sharma";
		customer.customerNumber = "029992939";
		customer.address = "Vision Entity Marunji Pune";

		customer.displayCustomerDetails();
		customer.payBill(10000, 10);
		
		List<String> myList = new ArrayList<>();
		myList.contains("Coffee");
	}

}
