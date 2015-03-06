package quiz02;

public class Quiz12 {
	public static void main(String[] args) {
		float sum=0.0f;
		for(float i=0.01f; i<=1.0f; i=i+0.01f){
			sum +=i;
		}
		System.out.println("sum:" + sum);

	}

}
