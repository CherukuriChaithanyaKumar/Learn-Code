package ATMSYSTEM;

import java.util.Scanner;

public class ATMTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        ATM atm = new ATM();

        try {
            atm.checkServerConnection(); 
        } catch (ServerConnectionException e) {
            System.out.println("Server Error: " + e.getMessage());
            return; 
        }

        boolean authenticated = false; 

        while (!authenticated && !user.isCardBlocked()) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = scanner.nextInt();

            try {
                user.enterPin(enteredPin); 
                authenticated = true; 
            } catch (CardBlockedException e) {
                System.out.println("Login Error: " + e.getMessage());
                return;
            }
        }

        if (user.isCardBlocked()) {
            System.out.println("Card is blocked. No further transactions allowed.");
            return;
        }

        if (authenticated == true) {
            System.out.print("Enter amount to withdraw: ₹");
            double amount = scanner.nextDouble();

            try {
                atm.withdrawCash(amount);
            } catch (InsufficientFundsException | DailyLimitExceededException e) {
                System.out.println("Withdrawal Error: " + e.getMessage());
            }
        } else {
            System.out.println("Authentication failed. Cannot proceed to withdrawal.");
        }

        scanner.close();
    }
}
