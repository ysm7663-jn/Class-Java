package ex01_input;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		
		/*
		 * 사용했던 클래스
		 * 모두 동일한 패키지에 저장돼있음
		 * 패키지명 : java.lang 
		 * 1. String
		 * 2. System
		 * 3. Integer
		 * 4. Double
		 * 5. Boolean
		 * 
		 * java.lang 패키지에 저장된 클래스들은 import가 필요가 없다
		 */
		
		/*
		 * Scanner 클래스
		 * 	1. 콘솔 입력 = 키보드 입력
		 * 	2. 패키지 : java.util
		 * 		import가 반드시 필요 (자동 완성 단축키 (= Ctrl + Spacebar) 클래스 입력)
		 * 	3. 생성방법
		 * 		Scanner 객체 = new Scanner(입력스트림);
		 *  4. 소멸 방법
		 *  	객체.close();
		 *  5. 입력 받을 때 사용하는 메소드
		 *  	1) 정수 입력
		 *  		nextInt(), nextLong(), nextShort(), nextByte() 
		 *  	2) 실수 입력
		 *  		nextDouble(), nextFloat()
		 *  	3) 논리 입력
		 *  		nextBoolean()
		 *  	4) 문자열 입력
		 *  		next() : 공백 문자 전까지 입력(공백 입력 불가)
		 *  		nextLine() : 엔터 전까지 입력(공백 입력 가능)
		 *  	5) 문자 입력
		 *  		메소드가 없음
		 *  		문자열 입력 후 첫 번째 글짜만 빼서 사용
		 *  		첫 번째 글자를 빼는 메소드 : charAt(0)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >>> ");
		String name = sc.nextLine();		// 이름에 공백이 포함될 수 있음
		
		System.out.print("나이를 입력하세요 >>> ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 >>> ");
		double hegiht = sc.nextDouble();
		
		System.out.print("성별을 입력하세요 >>> ");
		char gender = sc.next().charAt(0);
		
		System.out.println("이름 : " + name); 
		System.out.println("나이 : " + age); 
		System.out.println("키 : " + hegiht); 
		System.out.println("성별 : " + gender); 
		
		// System.out.println();		// 출력 후 줄을 바꿈
		// System.out.print();			//	출력만 제공
		
		sc.close();		// 생략 가능

	}

}
