package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 문제. 임의의 양수를 입력 받아서,
		// 짝수면 "짝수", 홀수면 "홀수", 3의 배수 "3의 배수" 구분하여 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("수를 입력하세요 >> ");
		int n = sc.nextInt();

		if (n % 3 == 0)
			System.out.println("3의 배수");

		else if (n % 2 == 0)
			System.out.println("짝수");
		
		else
			System.out.println("홀수");
		
		sc.close();

	}

}
