
//To create a class named as Customer and declare objects -ID, Name and city as private
//Finally create an application and access the objects using setters and getters

public class Customer {

	private int customerId;
	private String customerName;
	private String city;
	
	public int getCustomerId() {
	return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

	
