package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		// 문제. 권한을 정수(1,2,3) 입력 받아서
		// 권한 1 : "실행, 쓰기, 읽기"
		// 권한 2 : "쓰기, 읽기"
		// 권한 3 : "읽기"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		int n = sc.nextInt();
		
		switch (n) {
		case 1: System.out.println("실행, 쓰기, 읽기"); break;
		case 2: System.out.println("쓰기, 읽기"); break;
		case 3: System.out.println("읽기"); 
		
		}
		
		sc.close();

	}

}
