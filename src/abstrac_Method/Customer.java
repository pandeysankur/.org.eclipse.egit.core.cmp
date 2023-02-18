package abstrac_Method;

public class Customer {
	public String customerName;
	public String customerId;
	public String customerNumber;
	public String address;

	public void displayCustomerDetails() {
		System.out.println("customerId: " + customerId);
		System.out.println("customerName: " + customerName);
		System.out.println("customerNumber: " + customerNumber);
		System.out.println("customerAddress: " + address);
	}

	public void payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid......");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		System.out.println("Hi " + customerName + ", your final bill amount after discount is: "
				+ (int) (priceAfterDiscount * 100) / 100.0);
	}

}
