package ch07;

class Cart{
	public Item[] array=new Item[4];
	public int index;
	
	public void addItem(String name,int num,int price){
		array[index]=new Item(name,num,price);
		index++;
	}
	
	public int getTotalPrice(){
		int total=0;
		for(int i=0;i<array.length;i++){
			total+=array[i].getPrice();
		}
		return total;
	}
	
	public void disp(){
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
		System.out.println("--------------------");
		System.out.println("총합\t\t" + getTotalPrice());
	}

	class Item{
		private String name;   //상품명
		private int num,price; //수량,단가
		
		public Item(String name,int num,int price){
			this.name=name;
			this.num=num;
			this.price=price;
		}
		
		public int getPrice(){
			return num*price;
		}
		
		public void disp(){
			System.out.println(name + "\t" + num + "\t" + price + "\t" + getPrice());
		}
	}
}

public class Exam79 {
	public static void main(String[] args) {
		Cart cart=new Cart();
		cart.addItem("Choco", 2, 100);
		cart.addItem("Cake", 1, 300);
		cart.addItem("Bread", 5, 50);
		
//		cart.disp();
		
		Cart.Item item=cart.new Item("Flower",1,5000);
		cart.array[cart.index++]=item;
		cart.disp();
	}
}
