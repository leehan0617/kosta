package quiz06;

public class Alcohol extends Drink{
	private float alcper;
	
	public Alcohol(String name,int price,int count,float alcper){
		super(name,price,count);
		this.alcper=alcper;
	}
	
	public static void title(){
		System.out.println("상품명(도수[%])"+"\t"+"단위"+"\t"+"수량"+"\t"+"금액");
	}
	
	public void disp(){
		System.out.println(name+"("+alcper+")"+"\t"+price+"\t"+count+"\t"+(price*count));
	}
}
