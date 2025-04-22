package ATMSYSTEM;

public class User {
    private int userPin = 1234;
    private int invalidPinAttempts = 0; 
    private boolean cardBlocked = false; 

    public void enterPin(int enteredPin) throws CardBlockedException {
        if (cardBlocked) {
            throw new CardBlockedException("Card is blocked due to too many incorrect attempts.");
        }

        if (enteredPin != userPin) {
            invalidPinAttempts++;
            if (invalidPinAttempts >= 3) {
                cardBlocked = true;
                throw new CardBlockedException("Card blocked after 3 invalid PIN attempts.");
            }
            System.out.println("Invalid PIN. Try again.");
        } else {
            System.out.println("PIN verified successfully.");
        }
    }

    public boolean isCardBlocked() {
        return cardBlocked;
    }
}
