package ex03_array_quiz;

public class Quiz10 {

	public static void main(String[] args) {
		
		// 문제. 전체 구구단
		
		int [][] a = new int[9][8];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = (j + 2) * (i + 1);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
