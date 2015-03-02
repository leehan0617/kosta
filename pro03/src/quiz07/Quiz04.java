package quiz07;

class MyException extends RuntimeException{
	private String errCode;
	private final int code=100;
	
	public MyException(String msg){
		this.errCode="지원하지 않는 기능입니다.";
	}
	public int getErrorCode(){
		return code;
	}
	
	public String getMessage(){
		String msg="";
		msg+="[에러코드:"+code+"] "+ errCode;
		return msg;
	}
}
public class Quiz04 {
	public static void main(String[] args) {
		MyException my=new MyException("지원하지 않는 기능입니다.");
		System.out.println(my.getMessage());
	}
}
