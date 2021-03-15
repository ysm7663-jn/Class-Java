package ex04_loop_quiz;

public class Quiz05 {

	public static void main(String[] args) {

		// 1. 세로로 출력하는 전체 구구단

		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				System.out.println(i + " * " + j + " = " + (i * j));
				
			}
			
			System.out.println("----------------------");
			
		}

		// 2. 가로로 출력하는 전체 구구단
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {

				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			
			System.out.println();
			
		}
		

	}

}
