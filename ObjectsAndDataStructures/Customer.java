package ObjectsAndDataStructures;

public class Customer {
	private String firstName;
	private String lastName;
	private Wallet myWallet;

	public Customer(String firstName, String lastName, float initialBalance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.myWallet = new Wallet();
		this.myWallet.setTotalMoney(initialBalance);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Wallet getWallet() {
		return myWallet;
	}

	public static void main(String[] args) {

		Customer myCustomer = new Customer("Chaithanya", "Kumar", 1.00f);

		float payment = 2.00f;

		Wallet theWallet = myCustomer.getWallet();

		if (theWallet.getTotalMoney() >= payment) {
			theWallet.subtractMoney(payment);
			System.out.println("Payment of " + payment + " dollars has been made.");
			System.out.println("Remaining balance: " + theWallet.getTotalMoney());
		} else {
			System.out.println("Insufficient funds. Please come back later.");
		}
	}
}
