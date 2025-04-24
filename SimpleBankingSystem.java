package oops;

public class SimpleBankingSystem {
		public static void main(String[] args) {
			SavingsAccount savingsAccount = new SavingsAccount("John Doe", 5000.00);

			savingsAccount.deposit(1500.00);
			savingsAccount.withdraw(1000.00);
			savingsAccount.withdraw(7000.00);
		}
	}

