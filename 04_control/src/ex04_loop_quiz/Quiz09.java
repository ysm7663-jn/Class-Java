package ex04_loop_quiz;

public class Quiz09 {

	public static void main(String[] args) {

		// 문제. 구구단의 일부만 출력
		// 2 * 1 = 2
		// ...
		// 4 * 4 = 16 끝

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				System.out.println(i + " * "  + j + " = " + (i * j));
				
				if (i == 4 && j == 4) 
					break;

			}
			if(i == 4)
				break;
		}

	}

}
