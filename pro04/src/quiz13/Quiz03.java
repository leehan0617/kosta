package quiz13;
/*
 * 3.  �ѹ��� ������ ���鼭 ��� (5�� �ݺ� ����)
    ���ȭ��) 
         	-----------------
	**************

	-----------------
	**************

	**************
	-----------------

	-----------------
	**************

	-----------------
	**************
 */
class PrintMinus extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			try{
				System.out.println("-----------------");
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class PrintStar extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			try{
				System.out.println("*****************");
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		PrintMinus pm=new PrintMinus();
		PrintStar ps=new PrintStar();
		
		pm.start();
		ps.start();
		
		for(int i=0;i<5;i++){
			try{
				System.out.println();
				Thread.sleep(1200);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
