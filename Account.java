package assignment_1;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1=new BankAccount("1223456", "Yogita", 5000);
		BankAccount account2=new BankAccount("1223457", "Sakshi", 500);
		BankAccount account3=new BankAccount("1223458", "Vikas", 1000);
		account1.accountDetails();
		account2.accountDetails();
		account3.accountDetails();
		
		
		System.out.println("...................................................");
		account1.deposit(500);
		account2.deposit(500);
		account3.deposit(500);
		account1.accountDetails();
		account1.withdraw(500);
	}

}

class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
			System.out.println("New Balance: "+balance);
			
		}
		else {
			System.out.println("Invalid Deposit");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0&&amount<=balance) {
			balance-=amount;
			System.out.println("Withdraw: "+amount);
			System.out.println("New balance: "+balance);
		}
		else {
			System.out.println("Invalid or insufficient funds for withdrawal");
		}
	}
	
	public void accountDetails() {
		System.out.println("Account Number: "+accountNumber+
				         ", Account Holder: "+accountHolderName+
				         ", Balance: "+balance);
	}
	
}
