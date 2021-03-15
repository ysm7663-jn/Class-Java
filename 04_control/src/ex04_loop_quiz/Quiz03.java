package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 문제. 평점 입력 받아서 해당 평점만큼 ★ 출력
		// 평점은 1 ~ 5 사이 정수로 입력, 벗어난 범위는 다시 입력 받기
		
		Scanner sc = new Scanner(System.in);
		
		int grade;
		String stars = "";
		//String stars = null;		// 문자열 + 연산자로 연결되는 경우 "" 로 초기화
		
		
		do {
			System.out.print("평점을 입력하세요 >> ");
			grade = sc.nextInt();
			
		} while(grade < 0 || grade > 5);
		
		while (grade > 0) {
			stars += "★";
			grade--;
		}
		
		System.out.print(stars);
			
		sc.close();
		
	}

}
