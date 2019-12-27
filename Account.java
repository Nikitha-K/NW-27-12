//To create a class named as Account and declare objects -Accno, Name and balance as private
//Finally create an application and access the objects using setters and getters

public class Account{
	
	private int accountNumber;
	private String customerName;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
		
	 

	
}
