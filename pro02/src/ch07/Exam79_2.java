package ch07;

class Total{
	private Student[] array=new Student[3];
	private int index;
	private int total;
	private float average;
	

	public void addStudent(String name,int kor,int eng,int mat){
		array[index]=new Student(name,kor,eng,mat);
		index++;
	}
	
	public int getTotal(){
		for(int i=0;i<index;i++){
			total+=array[i].getTotal();
		}
		return total;
	}
	
	public float getAvg(){
		average=(float)getTotal()/(6*index);
		return average;
	}
	
	public static void dispTitle(){
		System.out.println("ÀÌ¸§"+"\t"+"±¹¾î"+"\t"+"¿µ¾î"+"\t"+"¼öÇÐ");
	}
	
	public void disp(){
		for(int i=0;i<index;i++){
			array[i].disp();
		}
		System.out.println("------------------------");
		System.out.println("ÃÑÁ¡"+"\t"+getTotal()+"\t"+"Æò±Õ"+getAvg());
	}
	
		
	class Student{
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		public Student(String name,int kor,int eng,int mat){
			this.name=name;
			this.kor=kor;
			this.eng=eng;
			this.mat=mat;
		}
		
		public int getTotal(){
			return kor+eng+mat;
		}
		
		public float getAverage(){
			return (float)getTotal()/3;
		}
		
		public void disp(){
			System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat);
		}
	}
}

public class Exam79_2 {
	public static void main(String[] args) {
		Total total=new Total();
		total.addStudent("È«±æµ¿", 100, 80, 70);
		total.addStudent("ÀÌÇÑºó", 100, 90, 90);
		Total.dispTitle();
		total.disp();
	}

}
