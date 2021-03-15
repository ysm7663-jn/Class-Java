package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		// 문제. 평점(1~5)을 3번 입력 받는다.
		// 1~5사이의 입력이 아니면 다시 입력 받는다.

		Scanner sc = new Scanner(System.in);

		int n;
		String str = "";

		for (int i = 1; i <= 3; i++) {

			do {
				System.out.print(i + "번째 평점 입력 >> ");
				n = sc.nextInt();
			} while (!(1 <= n && n <= 5));
			
			
			while(n > 0) {
				str += "★";
				n--;
			}
			System.out.println(str);
			str = "";

		}
		
		sc.close();

	}

}
