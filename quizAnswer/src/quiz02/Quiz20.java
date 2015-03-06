package quiz02;

public class Quiz20 {
	public static void main(String[] args){		
		int fSum=0, wSum=0, dSum=0;
		
		for(int i=0;i<=20;i++){
			fSum=fSum+i;
		}
		System.out.println("fSum:" + fSum);
		
		int j=0;
		while(j<=20){
			wSum=wSum+j;
			j++;
		}
		System.out.println("wSum:" + wSum);
		
		int k=0;
		do{
			dSum=dSum+k;
			k++;
		}while(k<=20);
		System.out.println("dSum:" + dSum);
	}
}
