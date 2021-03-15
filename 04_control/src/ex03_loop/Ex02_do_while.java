package ex03_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		
		// do - while문
		// 1. 본문을 반드시 한 번은 실행하는 while문
		// 2. 형식
		// 		do {
		//			반복 실행문;
		//		} while (조건식);
		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		do {
			System.out.print("수를 입력하세요 >> ");
			n = sc.nextInt();
			
			sum += n;
		} while(n != 0);
		
		System.out.println(sum);
		
		sc.close();

	}

}
