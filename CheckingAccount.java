package Week4;

public class CheckingAccount {
								// Exercise 3
	//we creating this class without the main method to make the variable and then use it in other class> AccountTest class
	
	double balance =0.0;
	String name;
	double interestRate;
	
	public void displayCustomer() {
		System.out.println("Customer: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Rate: " + interestRate);
	}
	
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Warning: withdraw amount can't be negative.");
		}
		else if(amount> balance) {
			System.out.println("Warning: Insufficient funds.");
		}
		else {
			balance -= amount;
			System.out.println("Withdraw successful! new balance: " + balance);
		}
	}
	
	public double calclnterest() {
		double interest = balance*interestRate/12;	
		System.out.println(interest);
		return interest;
	}
}