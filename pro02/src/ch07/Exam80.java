package ch07;

class BanSungjuk{
	private int inwon=3;
	private Person[] array=new Person[inwon];
	private int index;
	
	public void addPerson(String name,int kor,int eng,int mat){
		array[index]=new Person(name,kor,eng,mat);
		index++;
	}
	
	public void getPersonResult(){
		for(int i=0;i<array.length;i++){
			array[i].personResult();
		}
	}
	
	public int banTotal(){
		int banTotal=0;
		for(int i=0;i<array.length;i++){
			banTotal +=array[i].tot;
		}
		return banTotal;
	}
	
	public float banAverage(){
		return banTotal()/(inwon*3);
	}
	
	public void output(){
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
		System.out.println("--------------------");
		System.out.println("ÃÑÁ¡"+this.banTotal()+"\t"+"Æò±Õ:"+this.banAverage());
	}
	
	class Person{
		private String name;
		private int kor,eng,mat,tot;
		private float avg;
		
		public Person(String name,int kor,int eng,int mat){
			this.name=name;
			this.kor=kor;
			this.eng=eng;
			this.mat=mat;
		}
		
		public void personResult(){
			tot=kor+mat+eng;
			avg=(float)tot/3;
		}
		
		public void disp(){
			System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		}
	}
}

public class Exam80 {
	public static void main(String[] args) {
		BanSungjuk bsj=new BanSungjuk();
		bsj.addPerson("a", 100, 100, 100);
		bsj.addPerson("b", 70,  60,  80);
		bsj.addPerson("c", 60, 75, 50);
		bsj.getPersonResult();
		bsj.output();
	}

}
