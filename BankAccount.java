package oops;
abstract class BankAccount {
	private String accountHolder;
	private double balance;

	public BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
	}

	public void withdraw(double amount) {
	}
}
