package ex01_basic;

public class Ex02_literal {

	public static void main(String[] args) {
		
		// 1. 문자 표현 방식
		// 작은 따옴표 사용 ' '
		System.out.println('A');
		System.out.println('한');
		System.out.println('1');
		
		// 2. 문자열 표현 방식
		// 큰 따옴표 사용 " "
		System.out.println("Hello World");
		
		// 3. 정수, 실수 표현 방식
		// 그냥 입력
		System.out.println(1000);
		System.out.println(3.14);

		// 4. 논리값 표현 방식
		// true, false
		System.out.println(true);
		System.out.println(false);
		
		// 5. 이스케이프 시퀀스
		// 특수문자 개념
		// 백슬래시(\)
		
		// \n : 줄 바꿈(엔터와 동일한 역할)
		// \t : 탭(tab)
		// \' : 작은 따옴표 출력
		// \" : 큰 따옴표 출력	
		System.out.println("Hello\nWorld");
		System.out.println("Hello\tWorld");
		System.out.println("Hello\'World\'");
		System.out.println("Hello\"World\"");
	}

}
