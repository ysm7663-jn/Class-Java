package ex03_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		/*
		 * while문
		 * 1. 조건식의 결과가 true이면 반복되는 제어문
		 * 2. 형식
		 * 		while(조건식) {
		 *			반복 실행문;
		 * 		}
		 */
		
		// 1. 1 ~ 3 출력
		
		int a = 1;
		
		while(a <= 3) {
			System.out.println(a);
			a++;
		}
		
		// 변수 n        조건식   n <= 3      결과            실행문
		//   1                  1 <= 3        true		System.out.println(1);
		//   2                  2 <= 3        true      System.out.println(2);
		//   3                  3 <= 3        true      System.out.println(3);
		//   4                  4 <= 3        false			   종료      

		
		// 2. 3 ~ 1 출력
		int b = 3;
		
		while(b >= 1) {
			System.out.println(b);
			b--;
		}
		
		
		// 3. 'A' ~ 'Z' 출력하기
		// char 타입의 변수는 내부적으로 정수 처리
		// char 타입의 변수도 연산이 가능
		
		char ch = 'A';
		
		while(ch <= 'Z') {
			System.out.println(ch);
			ch++;
		}
		
		
		// 4. 사용자가 0을 입력할때까지 계속 입력 받아서 합계를 구하라
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		
		while(true){
			System.out.println("수를 입력하세요 >> ");
			n = sc.nextInt();
			
			if(n == 0)
				break;
			
			sum += n;
			
		}
		
		System.out.println(sum);
		
		sc.close();
		
		
	}

}
