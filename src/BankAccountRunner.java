
public class BankAccountRunner {

	public static void main (String args[]) {
	BankAccount BankAccountOne = new BankAccount("Hiya", 100); 
	BankAccount BankAccountTwo = new BankAccount("Hiya Sh", 200);
	
	//1
	
	if( BankAccountOne.balance > BankAccountTwo.balance) {
		System.out.println("Balance: "+BankAccountOne.balance);
	}
	else {
		System.out.println("Balance: "+BankAccountTwo.balance);
	}
	
	//2
	
	BankAccountOne.withdraw(5);
	System.out.println("Balance: "+BankAccountOne.balance);
	
	//3
	
	BankAccount BankAccountThree = new BankAccount("Hiya", 1000);
	System.out.println("Balance: "+BankAccountThree.balance);
	System.out.println("Name: "+BankAccountThree.name);
	
	
}
}