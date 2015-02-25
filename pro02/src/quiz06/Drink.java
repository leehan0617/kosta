package quiz06;

public class Drink {
	protected String name;
	protected int price;
	protected int count;
	
	public Drink(String name,int price,int count){
		this.name=name;
		this.price=price;
		this.count=count;
	}
	
	public static void title(){
		System.out.println("상품"+"\t"+"단위"+"\t"+"수량"+"\t"+"금액");
	}
	
	public void disp(){
		System.out.println(name+"\t"+price+"\t"+count+"\t"+(price*count));
	}

}
