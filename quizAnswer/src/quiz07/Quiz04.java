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
		return "[에러코드:" + getErrorCode() + "] " + super.getMessage() ;
	}
}

public class Quiz04 {
	public static void main(String[] args) {
		MyException my=new MyException("지원하지 않는 기능입니다.");
		System.out.println(my.getMessage());
	}
}
