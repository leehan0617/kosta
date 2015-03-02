package quiz07;

class Event{
	protected int su, value;	
	public Event(int su, int value){
		this.su=su;
		this.value=value;
	}
	public int getSu(){
		return su;
	}
	public int getValue(){
		return value;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		int su=10;
		int value=20;
		Event event=new Event(su,value){
			public int getSu(){
				return su+value;
			}
		};
		
		System.out.println(event.getSu());
	}

}
