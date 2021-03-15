package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {

		// 문제. 10000원 모두 쓰기
		// 사용할 금액을 입력 받아서 10000원에서 공제

		Scanner sc = new Scanner(System.in);

		int money = 10000;
		int n;

		do {

			System.out.println("현재 " + money + "원 있습니다.");

			if (money == 0)
				break;

			System.out.print("결제 금액 >> ");
			n = sc.nextInt();

			if (n > money) {
				System.out.println((n - money) + "이 부족합니다.");
				continue;
			}

			else if (n <= 0) {
				System.out.println("0 이하의 돈은 사용할 수 없습니다.");
				continue;
			}

			money -= n;

		} while (money != 0);

		System.out.println("현재 " + money + "원 있습니다.");

		sc.close();

	}

}

/*
 * 난수의 값 만큼 결제 되게하는 문제
 */
