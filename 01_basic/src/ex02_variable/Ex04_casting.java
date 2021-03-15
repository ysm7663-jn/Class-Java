package ex02_variable;

public class Ex04_casting {

	public static void main(String[] args) {
		
		/*
		 * 타입 변환 = 형 변환 (casting)
		 * 
		 * 1. 자동 타입 변환
		 * 	- java가 스스로 타입을 변환
		 * 	- 작은 크기의 타입 -> 큰 크기 타입
		 * 	- 정수와 실수의 연산 -> 정수를 실수로 자동 타입 변환 후 연산
		 * 
		 * 2. 강제 타입 변환
		 * 	- 개발자가 직접 타입을 변환
		 * 	- 크기 상관 없이 무조건 변환 
		 * 	- 사용 방법 : (타입) 변수
		 */

		
		System.out.println(1 + 1.5);
		
		int a = 1;
		int b = 2;
		
		System.out.println(a / b);		// a 와 b 중 하나를 강제로 실수 타입으로 변경하면 나눗셈 연산 가능
		System.out.println((double)a / b);		// a는 casting 당시에만 형 변환

		
		}

}
