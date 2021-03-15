package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 문제. 사용자로부터 문자열을 계속해서 입력 받는다.
		// "종료" 문자열을 입력하면 종료 
		// 총 몇 번만에 종료되었는지 그 횟수를 마지막에 출력

		// String str = null;		// str 자체가 없다.
		// String str = "";			// str의 내용물이 없다.
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		int cnt = 0;
		
		while (!str.equals("종료")) {
			System.out.print("문자열을 입력하세요 >> ");
			str = sc.next();
			cnt++;
		}
		
		System.out.println(cnt);
			
		
	}

}
