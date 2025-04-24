package ATMSYSTEM;

import java.util.Scanner;

public class ATMApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ATM atm = new ATM();
		User user = new User();

		try {
			atm.verifyServerConnection();
		} catch (ServerConnectionException e) {
			System.out.println("Server Error: " + e.getMessage());
			return;
		}

		boolean isAuthenticated = false;

		while (!isAuthenticated && !user.isCardBlocked()) {
			System.out.print("Enter your 4-digit PIN: ");
			int enteredPin = scanner.nextInt();

			try {
				isAuthenticated = user.authenticatePin(enteredPin);
			} catch (CardBlockedException e) {
				System.out.println("Login Error: " + e.getMessage());
				return;
			}
		}

		if (isAuthenticated) {
			System.out.print("Enter amount to withdraw: ");
			double amount = scanner.nextDouble();

			try {
				atm.processWithdrawal(user, amount);
			} catch (DailyLimitExceededException | InsufficientFundsException | UserInsufficientFundsException e) {
				System.out.println("Withdrawal Error: " + e.getMessage());
			}
		}

		scanner.close();
	}
}
