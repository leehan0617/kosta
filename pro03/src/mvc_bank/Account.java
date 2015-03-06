package mvc_bank;

public class Account {
	private int id;			//°èÁÂ¹øÈ£
	private String name;    //ÀÌ¸§
	private long balance;   //ÀÜ¾×
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
