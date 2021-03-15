package ex03_loop;

public class Ex07_label {

	public static void main(String[] args) {

		// label 
		// 소스코드의 특정 위치를 지정해주는 방법
		// 라벨명:
		
		// outer loop에 outer 라벨을 달아 놓고 사용한다.
		
		outer:			// outer label
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				if(i == 4 && j == 4)
					break outer;
			}
		}

	}

}
