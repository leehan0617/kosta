package quiz06;

public class Quiz07 {
	public static void main(String[] args) {
		Drink coffee=new Drink("커피", 200, 3);
		Drink tea=new Drink("녹차", 150, 2);	
		Drink.title();
		coffee.disp();
		tea.disp();
		
		Alcohol wine=new Alcohol("와인", 300, 2, 15.0f);
		Alcohol.title();
		wine.disp();	
	}
}
