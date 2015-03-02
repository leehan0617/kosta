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
	public static void main(String[] ar){
		Event h=new Event(10, 20){
			public int getSu(){
				return su+value;
			}
		};
		System.out.println("гу:" +  h.getSu());
	}
}
