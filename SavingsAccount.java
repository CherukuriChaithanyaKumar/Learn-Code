package oops;

public class SavingsAccount extends BankAccount {

		public SavingsAccount(String accountHolder, double balance) {
			super(accountHolder, balance);
		}

		@Override
		public void deposit(double amount) {
			double newBalance = getBalance() + amount;
			System.out.println(amount + " deposited into Savings Account. New balance: " + newBalance);
		}

		@Override
		public void withdraw(double amount) {
			if (amount <= getBalance()) {
				double newBalance = getBalance() - amount;
				System.out.println(amount + " withdrawn from Savings Account. New balance: " + newBalance);
			} else {
				System.out.println("Insufficient balance in Savings Account.");
			}
		}
	}

