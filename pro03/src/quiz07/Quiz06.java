package quiz07;

class Point{
	private int input1,input2,input3;
	
	public Point(int input1,int input2,int input3){
		this.input1=input1;
		this.input2=input2;
		this.input3=input3;
	}
	
	public String toString(){
		String str="";
		str+="[   "+input1+"   "+input2+"   "+input3+"   ]";
		return str;		
	}
	
	public boolean equals(Point p){
		Point temp=new Point(input1,input2,input3);
		if(temp.input1==p.input1 && temp.input2==p.input2 && temp.input3== p.input3){
			return true;
		}else
			return false;
	}
}

public class Quiz06 {
	public static void main(String[] args) {
		Point p=new Point(1, 2, 3);
		Point o=new Point(1, 2, 3);
		
		System.out.println(p);
		System.out.println(o);
		System.out.println("°á°ú:" + p.equals(o));
	}
}

