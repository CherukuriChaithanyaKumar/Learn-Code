package ATMSYSTEM;

public class ATM {
	private double cashReserve = 20000;
	private final double dailyWithdrawalLimit = 40000;
	private double totalWithdrawnToday = 0;

	public void verifyServerConnection() throws ServerConnectionException {
		boolean serverAvailable = true;
		if (!serverAvailable) {
			throw new ServerConnectionException("Unable to connect to the server.");
		}
		System.out.println("Connected to the server.");
	}

	public void processWithdrawal(User user, double amount)
			throws InsufficientFundsException, DailyLimitExceededException, UserInsufficientFundsException {
		validateDailyLimit(amount);
		validateUserBalance(user, amount);
		validateATMCash(amount);

		cashReserve -= amount;
		totalWithdrawnToday += amount;
		user.withdrawFromAccount(amount);

		System.out.println("Withdrawal successful.");
		System.out.println("Remaining ATM cash: ₹" + cashReserve);
		System.out.println("Remaining user balance: ₹" + user.getAccountBalance());
	}

	private void validateDailyLimit(double amount) throws DailyLimitExceededException {
		if (totalWithdrawnToday + amount > dailyWithdrawalLimit) {
			throw new DailyLimitExceededException("Cannot withdraw more than the daily limit.");
		}
	}

	private void validateUserBalance(User user, double amount) throws UserInsufficientFundsException {
		if (!user.canWithdraw(amount)) {
			throw new UserInsufficientFundsException("Insufficient funds in your account.");
		}
	}

	private void validateATMCash(double amount) throws InsufficientFundsException {
		if (amount > cashReserve) {
			throw new InsufficientFundsException("ATM has insufficient cash.");
		}
	}
}
