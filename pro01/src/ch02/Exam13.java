package ch02;

public class Exam13 {
	public static void main(String[] args) {
		int su=4;
		switch(su){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default:
				System.out.println("Error");
		}
		
		int value=3;
		switch(value){
		case 1:case 2:case 3:
			System.out.println("hahaha");
			break;
		case 4:case 5:case 6:
			System.out.println("hohoho");
			break;
		case 7:case 8:case 9:
			System.out.println("hehehe");
			break;
		default:
			System.out.println("etc");
			break;
		}
	}
}
