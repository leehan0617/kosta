package quiz13;
/*
 *    1) ���������� : ������
    2) ������:  PC(�����)
    3) �Ӱ迵�� : synchronized

    ���) 	ù��° ��ǻ��������1��° ���
	�¹�° ��ǻ��������2��° ���
	�ι�° ��ǻ��������3��° ���
	�¹�° ��ǻ��������4��° ���
	ù��° ��ǻ��������5��° ���
	�ι�° ��ǻ��������6��° ���
	�¹�° ��ǻ��������7��° ���
	ù��° ��ǻ��������8��° ���
	�ι�° ��ǻ��������9��° ���

 */
class Printer{
	private static int counter=0;
	
	public int usePrint(){
		counter++;
		return counter;
	}
}

class PC extends Thread{
	private Printer printer;
	private String name;
	
	public PC(Printer printer,String name){
		this.printer=printer;
		this.name=name;
	}
	
	public synchronized void run(){
		for(int i=0;i<3;i++){
			try{
				System.out.println(name+" ��ǻ��������"+printer.usePrint()+"���");
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Quiz04 {
	public static void main(String[] args) {
		Printer printer=new Printer();

		PC a=new PC(printer, "ù��° ��ǻ��");
		PC b=new PC(printer, "�ι�° ��ǻ��");
		PC c=new PC(printer, "�¹�° ��ǻ��");
	
		a.start();
		b.start();
		c.start();
	}
}