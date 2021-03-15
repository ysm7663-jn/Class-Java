package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {

		// 문제. 비밀번호 맞추기("1234"로 가정)
		// 비밀번호를 입력 받아서 "1234"와 같으면 "성공"
		// 비밀번호가 다르면 다시 입력
		// 최대 5번 가능하고 최종적으로 "실패"

		Scanner sc = new Scanner(System.in);

		int n;

		String password = "1234";

		String input = sc.next();
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("비밀번호를 입력하세요 >> ");
			input = sc.next();

			if (input.equals("1234")) {
				System.out.println("성공");
				break;
			}
			if(i == 5)
				System.out.println("실패");
		}

		sc.close();

	}

}
