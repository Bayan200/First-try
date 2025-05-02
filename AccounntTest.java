package Week4;

public class AccounntTest {
							// Exercise 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//we make an objects here and then use the variable from another class > CheckingAccount
		
		CheckingAccount cus1 = new CheckingAccount();  //naming the object here> cos1
		cus1.balance = 1000;  //use dot . to access to the other variable in another classes
		cus1.name= "Damine";
		cus1.displayCustomer();
		cus1.withdraw(50);
		cus1.balance += cus1.calclnterest();
		
		CheckingAccount cus2 = new CheckingAccount();
		cus2.balance = 2000;
		cus2.name= "Bill";
		cus2.displayCustomer();
		cus2.withdraw(50);
		
	}
}