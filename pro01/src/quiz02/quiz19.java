package quiz02;
/*
 * ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. �� x��y�� �����̰� ������ ������
0<=x<=10, 0<=y<=10�̴�. 
[���ȭ��]
x=1, y=2
x=3, y=1
x=5, y=0

 */
public class quiz19 {
	public static void main(String[] args) {
		for(int x=0;x<=10;x++){
			for(int y=0;y<=10;y++){
				if(x*2+y*4 ==10){
					System.out.println("x="+x+", y="+y);
				}
			}
		}
	}

}