//To create a class named as Account and declare objects -Accno, Name and balance as private
//Finally create an application and access the objects using setters and getters

public class AccountAppln{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account account=new Account();
		
		account.setAccountNumber(32122);
		account.setCustomerName("Avinash");
		account.setBalance(30000);
		
		System.out.println(account.getAccountNumber());
		System.out.println(account.getCustomerName());
		System.out.println(account.getBalance());
		
		

	}

}
