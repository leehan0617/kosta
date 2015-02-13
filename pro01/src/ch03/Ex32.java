package ch03;

public class Ex32 {
	public static void main(String[] args) {
		//2За 3ї­
		int[][] array=new int[][]{{10,20,30},{40,50,60}};
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
	}

}
