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
		
		System.out.println("a:�迭�� ������ ���ٿ� 10���� ����ϴ� �Լ�");
		questionA(array);
		System.out.println();
		
		System.out.println("b:Ȧ���鸸 ����ϴ� �Լ�:");
		questionB(array);
		System.out.println();
		
		System.out.println("c:�ε����� Ȧ���� �Լ�:");
		questionC(array);
		System.out.println();
		
		System.out.println("d.¦���� ������ :"+questionD(array)+"�Դϴ�.");
		System.out.println("e.�迭�� ������ ���� :"+questionE(array)+"�Դϴ�.");
		System.out.println("f.�������� ���� ��ġ�� :"+questionF(array)+"�Դϴ�.");
		System.out.println("g.���� ū ���� ��ġ�� :"+questionG(array)+"�Դϴ�.");
		
		for(int i=0;i<array.length;i++){
			System.out.print("����� ���ο� �迭:"+questionH(array)[i]+"\t");
		}
	}
	
	//a.�迭�� ������ ���ٿ� 10���� ����ϴ� �Լ�,�̶� �� ������ ���� ����������
	public static void questionA(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
			
			if(i%10-9==0 && i!=0){
				System.out.println();
			}
		}
	}
	
	//b.Ȧ���鸸 ����ϴ� �Լ�,��µǴ� ����� a�� ������
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
	
	//c.�ε����� Ȧ���� ������ ����ϴ� �Լ�, ��µǴ� �����a �� ������
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
