package mvc_bank;

public class Account {
	private int id;			//���¹�ȣ
	private String name;    //�̸�
	private long balance;   //�ܾ�
	
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
