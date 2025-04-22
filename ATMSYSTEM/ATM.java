package ATMSYSTEM;

public class ATM {
    private double balance = 20000;
    private double dailyLimit = 10000; 
    private double totalWithdrawnToday = 0;

    public void checkServerConnection() throws ServerConnectionException {
        boolean serverUp = true;
        if (!serverUp) {
            throw new ServerConnectionException("Unable to connect to the server.");
        }
        System.out.println("Connected to the server.");
    }

    // Method to withdraw cash
    public void withdrawCash(double amount) throws InsufficientFundsException, DailyLimitExceededException {
        if (totalWithdrawnToday + amount > dailyLimit) {
            throw new DailyLimitExceededException("Cannot withdraw more than the daily limit.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money in the ATM.");
        }
        balance -= amount;
        totalWithdrawnToday += amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }
}
