package ex03_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {

		// break문
		// switch문이나 loop문(while, do-while, for)을 종료

		// 무한 루프(infinite loop)
		// 1. while (true) { }
		// 2. for( ; ; ) { }

		// 1. 1 ~ 100 출력

		int i = 1;

		while (true) {
			System.out.println(i);
			if (i == 100)
				break;
			i++;
		}

		// 2. 0이 입력될때까지 계속 입력 받으시오

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수를 입력하세여 >> ");
			int n = sc.nextInt();

			if (n == 0)
				break;

		}

		// 3. 1부터 모든 정수의 합계를 구하시오
		// 합계가 3000이상이면 종료
		// 어디까지 더한 결과가 3000이상인지 출력
		int n = 1;
		int sum = 0;

		while (true) {

			sum += n;

			if (sum >= 3000) {
				break;
			}
			n++;
		}
		System.out.print("1부터 " + n + "까지 합은 " + sum + "입니다.");

		
		sc.close();
	}

}
