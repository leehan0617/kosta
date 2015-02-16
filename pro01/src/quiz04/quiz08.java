package quiz04;

public class quiz08 {
	public static void main(String[] args) {
		int[] array=new int[100];
//		for(int i=0;i<array.length;i++){
//			array[i]=(int)(Math.random()*999 +1);
//		}
		for(int i=0;i<array.length;i++){
			array[i]=i+2;
		}
		
		System.out.println("a:배열의 수들을 한줄에 10개씩 출력하는 함수");
		questionA(array);
		System.out.println();
		
		System.out.println("b:홀수들만 출력하는 함수:");
		questionB(array);
		System.out.println();
		
		System.out.println("c:인덱스가 홀수인 함수:");
		questionC(array);
		System.out.println();
		
		System.out.println("d.짝수의 개수는 :"+questionD(array)+"입니다.");
		System.out.println("e.배열의 수들의 합은 :"+questionE(array)+"입니다.");
		System.out.println("f.가장작은 수의 위치는 :"+questionF(array)+"입니다.");
		System.out.println("g.가장 큰 수의 위치는 :"+questionG(array)+"입니다.");
		
		for(int i=0;i<array.length;i++){
			System.out.print("복사된 새로운 배열:"+questionH(array)[i]+"\t");
		}
	}
	
	//a.배열의 수들을 한줄에 10개씩 출력하는 함수,이때 각 수들은 줄이 맞춰져야함
	public static void questionA(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
			
			if(i%10-9==0 && i!=0){
				System.out.println();
			}
		}
	}
	
	//b.홀수들만 출력하는 함수,출력되는 방식은 a와 동일함
	public static void questionB(int[] array){
		int temp=0;
		for(int i=0;i<array.length;i++){
			if(array[i]%2==1){
				System.out.print(array[i]+"\t");
				temp++;
			}
			
			if(temp%10==0){
				System.out.println();
			}
		}
	}
	
	//c.인덱스가 홀수인 수들을 출력하는 함수, 출력되는 방식은a 와 동일함
	public static void questionC(int[] array){
		int temp=0;
		
		for(int i=0;i<array.length;i++){
			if(i%2==1){
				System.out.print(array[i]+"\t");
				temp++;
			}
			
			if(temp%10==0){
				System.out.println();
			}
		}
	}
	
	public static int questionD(int[] array){
		int sum=0;
		
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				sum++;
			}
		}
		
		return sum;
	}
	
	public static int questionE(int[] array){
		int result=0;
		
		for(int i=0;i<array.length;i++){
			result+=array[i];
		}
		return result;
	}
	
	public static int questionF(int[] array){
		int minValue=array[0];
		int index=0;
		
		for(int i=0;i<array.length;i++){
			if(array[i]<minValue){
				minValue=array[i];
				index=i;
			}
		}
		
		return index;
	}
	
	public static int questionG(int [] array){
		int maxValue=array[0];
		int index=0;
		
		for(int i=0;i<array.length;i++){
			if(array[i]>maxValue){
				maxValue = array[i];
				index=i;
			}
		}
		
		return index;
	}
	
	public static int[] questionH(int [] array){
		int[] newArray=new int[100];
		
		for(int i=0;i<array.length;i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
}
