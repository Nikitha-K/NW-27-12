//Account details application program using constructors

public class AccountConAppn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountCon account1=new AccountCon();
		AccountCon account2=new AccountCon(32652,"Sarthi",4556);
		AccountCon account3=new AccountCon(323252,"Yaarthi",12356);
		
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getCustomerName());
		System.out.println(account1.getBalance());
		
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getCustomerName());
		System.out.println(account2.getBalance());
		
		System.out.println(account3.getAccountNumber());
		System.out.println(account3.getCustomerName());
		System.out.println(account3.getBalance());
				
		
	}

}
