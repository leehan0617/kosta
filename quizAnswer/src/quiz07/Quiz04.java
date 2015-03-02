package quiz07;


class MyException extends RuntimeException{
	private final int errCode=100;
	
	MyException(String msg){
		super(msg);
	}
	
	public int getErrorCode(){
		return errCode;
	}
	
	public String getMessage(){
		return "[�����ڵ�:" + getErrorCode() + "] " + super.getMessage() ;
	}
}

public class Quiz04 {
	public static void main(String[] args) {
		MyException my=new MyException("�������� �ʴ� ����Դϴ�.");
		System.out.println(my.getMessage());
	}
}
