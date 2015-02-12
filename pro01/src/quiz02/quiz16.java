package quiz02;

/*
 * 다음과 같이 출력하세요. (for문, while문 이용하여 2가지 프로그램 하시오.)
[출력화면]
*
**
***
****
*****
******
*******
********
*********
**********
***********
*/
public class quiz16 {
	public static void main(String[] args) {
		for(int i=1;i<=11;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		int i=1,j=1;
		while(i<=11){
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++; j=1;
		}
	}

}
