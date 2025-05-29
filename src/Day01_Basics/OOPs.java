package Day01_Basics;

abstract class BankAccount{
	private String accountNumber;
	private double balance;
	
	BankAccount(String accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. Current balance: ₹"+balance);
	}
	public abstract void withdraw(double amount);
	
	public double getBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	
}

class SavingsAccount extends BankAccount{
	
	private static final double minBalance = 1000;
	
	SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance()-amount >= minBalance) {
			setBalance(getBalance()-amount);
			
			System.out.println("Withdraw successfull from Saving Account!!");
		}else {
			System.out.println("Cannot withdraw: Minimum balance of ₹" + minBalance + " must be maintained.");
		}
	}
	
}
class CurrentAccount extends BankAccount{
	
	private static final double overDraft = -5000;
	
	CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance()-amount >= overDraft) {
			setBalance(getBalance()-amount);
			System.out.println("Withdraw successfull from Current Account!!");
		}else {
			System.out.println("Cannot withdraw: Overdraft limit of ₹" + overDraft + " exceeded.");
		}
	}
	
}
public class OOPs {
	public static void main(String[] args) {
		BankAccount acc1 = new SavingsAccount("S001", 2000);
		BankAccount acc2 = new CurrentAccount("C001", 5000);
		
		acc1.withdraw(1000);
		acc2.withdraw(10000);
		
		System.out.println("Balance in Savings Account: ₹" + acc1.getBalance());
        System.out.println("Balance in Current Account: ₹" + acc2.getBalance());

        acc1.deposit(500);
        acc2.deposit(500);

        System.out.println("Savings Account Number: " + acc1.getAccountNumber());
        System.out.println("Current Account Number: " + acc2.getAccountNumber());
	}
}
