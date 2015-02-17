package ch05;

class Pay{
	public String name;
	public int bonbong;
	public int tex;
	public int silsu;
	
	public void input(String str,int b){
		name=str;
		bonbong=b;
	}
	
	public void yonsan(){
		tex=(int)(bonbong*0.045+0.5);
		silsu=bonbong-tex;
	}
	
	public void output(){
		System.out.println(name + "\t" + bonbong + "\t" + tex + "\t" + silsu);
	}
}
public class Ex55 {
	public static void main(String[] args) {
		Pay pay=new Pay();
		pay.input("ø’¥´¿Ã",2000000);
		pay.yonsan();
		pay.output();
		
		Pay b=new Pay();
		b.input("æ∆∑ŒπÃ",10000000);
		b.yonsan();
		b.output();
		
		Pay c=new Pay();
		c.input("≈ı≈ı",1500000);
		c.yonsan();
		c.output();
	}

}
