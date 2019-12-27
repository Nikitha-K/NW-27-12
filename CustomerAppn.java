
//To create a class named as Customer and declare objects -ID, Name and city as private
//Finally create an application and access the objects using setters and getters

public class CustomerAppn {

	public static void main(String[] args) {
		
		Customer cust=new Customer();
		
		// TODO Auto-generated method stub
		cust.setCustomerName("Parthu");
		cust.setCustomerId(231425);
		cust.setCity("Chennai");
		
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getCity());
			
		
	}

}
