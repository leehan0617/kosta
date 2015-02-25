package quiz06;

public class Account {
	protected int number;
	protected String name;
	protected int balance;
	
	public void deposit(int money){
		balance+=money;
	}
}
