package ATMSYSTEM;

public class User {
	private final int correctPin = 2866;
	private int invalidPinAttempts = 0;
	private boolean cardBlocked = false;
	private double accountBalance = 10000;

	public boolean authenticatePin(int enteredPin) throws CardBlockedException {
		if (cardBlocked) {
			throw new CardBlockedException("Card is blocked due to too many incorrect attempts.");
		}

		if (enteredPin != correctPin) {
			invalidPinAttempts++;
			if (invalidPinAttempts >= 3) {
				cardBlocked = true;
				throw new CardBlockedException("Card blocked after 3 invalid PIN attempts.");
			}
			System.out.println("Invalid PIN. Try again.");
			return false;
		}

		System.out.println("PIN verified successfully.");
		return true;
	}

	public boolean isCardBlocked() {
		return cardBlocked;
	}

	public boolean canWithdraw(double amount) {
		return accountBalance >= amount;
	}

	public void withdrawFromAccount(double amount) {
		accountBalance -= amount;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
}
