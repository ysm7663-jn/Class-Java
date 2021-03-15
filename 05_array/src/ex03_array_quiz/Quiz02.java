package ex03_array_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 문제. 가위바위보
		// 실행
		// 가위바위보 >>>
		// 당신은 가위, 컴퓨터는 보, 이겼습니다.
		// 가위 0; 바위 1, 보 2

		Scanner sc = new Scanner(System.in);

		String[] player = { "가위", " 바위", "보" };

		// 컴퓨터 난수

		int com = (int) (Math.random() * 3);
		// 컴퓨터가 낸 건 player[com]

		// 사용자 입력

		System.out.println("가위바위보 >>> ");
		int user;
		switch (sc.next()) {

		case "가위":
			user = 0;
			break;
		case "바위":
			user = 1;
			break;
		default:
			user = 2;

		}

		String result = "";
		switch (user - com) {
		case 0:
			result = "비겼습니다.";
			break;

		case -2:
		case 1:
			result = "이겼습니다.";
			break;

		default:
			result = "졌습니다.";
		}
		
		System.out.println("컴퓨터는 " + player[com] + " 사용자는 " + player[user] + " 결과는 " + result );

	}

}
