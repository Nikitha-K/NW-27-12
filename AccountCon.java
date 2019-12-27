
//Account details program using constructors

public class AccountCon {
	
	private int accountNumber;
	private String customerName;
	private double balance;
	 
	
/*	public AccountCon(){
	accountNumber=12345;
	customerName="Gramener";
	balance =123233;
}
	*/
	public AccountCon(){
	}
	
	
	public AccountCon(int accountNumber, String customerName, double balance) {
		//super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
	


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
