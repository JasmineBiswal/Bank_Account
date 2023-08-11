package Project;

public class BankAccount {
	private double balance;
	private String name;
	public BankAccount(String name) {
		this.name = name;
		balance = 0.0;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public void deposit(double amount) {
		balance += amount;
		System.out.println(name + " has $" + balance);
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance -= amount;
			System.out.println("After withdraw " + name + " has $" + balance);
		}else {
			System.out.println("Withdrawal by " + name + " fails as withdrawal ammount was high.");
		}
	}
	public void transfer(double amount, BankAccount acc) {
		if(this.balance<amount) {
			System.out.println("Transer fails");
		}
		else {
			this.balance -= amount;
			acc.balance += amount;
			System.out.println("Amount of money now "+ this.name + " has in the account after transfer is $" + acc.balance);
		}
	}

	

}
