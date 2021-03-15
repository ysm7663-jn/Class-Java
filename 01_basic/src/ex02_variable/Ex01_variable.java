package ex02_variable;

public class Ex01_variable {

	public static void main(String[] args) {

		// 한 줄 삭제 : 커서 두고 Ctrl + d
		
		/*
		 변수 (variable)
		 1. 기본 자료형과 참조 자료형(reference type)
		 2. 타입(자료형)에 따라 값을 저장할 메모리 공간을 활보해 둔 것
		 3. 변수명 규칙
		 	1) 숫자, 영문, 한글, 특수문자(_)를 혼합해서 사용 가능
		 	2) 공백 문자 사용 할 수 없음
		 	3) 숫자로 시작은 불가
		 	4) 변수 선언(변수 사용을 알림)은 코드 어디서든 할 수 있음
		 	5) camel case 
		 		- 첫 글자는 소문자
		 		- 이후 단어의 첫 글자만 대문자, 나머진 소문자 (ex : myAge)
		 		- 자바 주의 점 : 첫 글자가 대문자이면, 모든 개발자는 클래스인 줄 앎
		 */
		
		int a;	// 정수를 저장할 수 있는 변수 a 선언
		
		a = 100;	// 변수 a에 100 저장
		
		System.out.println(a);
		
	}

}
