package ex02_variable;

public class Ex03_reference_type {

	public static void main(String[] args) {

		/*
		 *  참조 자료형 (reference type)
		 *  - 값이 저장된 참조(주소)를 저장
		 *  
		 *  변수
		 *    - 값을 저장할 수 있는 메모리 공간
		 *    - 메모리 공간은 1바이트마다 분할되어 각각 고유의 번호(주소 = 참조)로 분리됨
		 *    
		 *   1) 문자열 (String)
		 *   	- 문자열을 저장하지 않음
		 *   	- 문자열이 저장되어 있는 참조값(주소값)을 저장
		 *   	- 사용 방법
		 *   		- String s = new String("Hello");	// 대부분의 참조 자료형 처리 방식
		 *   		- String s = "Hello";				// 자주 사용되기 때문에 특별히 자바가 지원            = s는 Hello가 저장돼있는 주소값
		 */
		
		String s1 = new String("Hello");
		
		String s2 = "Hello";
		
		System.out.println(s1);
		System.out.println(s2);
		
		// 메모리에는 2개의 Hello가 저장돼있음
		// 각 Hello의 저장 위치가 s1, s2에 저장 돼있음
		// 따라서, s1과 s2는 다른 값
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}

}
