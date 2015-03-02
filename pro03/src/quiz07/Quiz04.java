package quiz07;

class MyException extends RuntimeException{
	private String errCode;
	private final int code=100;
	
	public MyException(String msg){
		this.errCode="�������� �ʴ� ����Դϴ�.";
	}
	public int getErrorCode(){
		return code;
	}
	
	public String getMessage(){
		String msg="";
		msg+="[�����ڵ�:"+code+"] "+ errCode;
		return msg;
	}
}
public class Quiz04 {
	public static void main(String[] args) {
		MyException my=new MyException("�������� �ʴ� ����Դϴ�.");
		System.out.println(my.getMessage());
	}
}
