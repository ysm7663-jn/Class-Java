package ex02_variable;

public class Ex02_primitive_type {

	public static void main(String[] args) {

		// main 자동 완성 : main + Ctrl + space bar

		/*
		 기본 자료형 (primitive type)
		 - 값을 저장할 수 있은 자료형
		 
		 1. 정수 타입
		 	1) byte 
		 		- 크기 : 1 byte (8 bit)
		 		- 개수 : 2의 8제곱 (256개)
		 		- 범위 : -128 ~ 127 (~2의 7제곱 ~ 2의 7제곱 -1)
		 		- 용도 : 이미지, 동영상 등을 그대로 저장하기 위한 byte 배열
		 		
		 	2) short 	
		 		- 크기 : 2 byte (16 bit)
		 		- 개수 : 2의 16제곱 (65,536개)
		 		- 범위 : -32,768 ~ 32,767
		 		- 용도 : 옛날 코드 호환용
		 		
		 	3)	int
		 		- 크기 : 4 byte (32 bit)
		 		- 개수 : 2의 32제곱 (4,294,967,296개, 43억) 
		 		- 범위 : -21억 ~ 21억
		 		- 용도 : 일반적인 정수 저장용
		 		
		 	4) long
		 		- 크기 : 8 byte (64 bit)
		 		- 개수 : 2의 64제곱
		 		- 범위 : 
		 		- 용도 : int 보다 크거나 작은 정수용
		 		- 사용 방법 : long money = 3000000000L; 접미사(suffix) L 붙여야 long 타입이 적용됨
		 		
		 2. 실수 타입
		 	1) float
		 		- 크기 : 4 byte 
		 		- 용도 : 옛날 코드 호환용
		 		- 사용 방법 : 접미사 F 붙여 사용
		 		
		 	2) double
		 		- 크기 : 8 byte
		 		- 용도 : 일반적인 실수 저장용
		 		
		 3. 문자 타입
		 	1) char
		 		- 크기 : 2 byte (유니코드 : 전 세계 모든 문자 저장)
		 		- 문자 표현 코드
		 			- ASCII : 1 byte (영문 표준 코드)
		 			- UNICODE : 2 byte (국제 표준 코드)
		 			
		 4. 논리 타입
		 	1) boolean
		 		- 크기 : 이론상 1 bit (2 가지 경우)
		 		- 용도 : 조건식의 참, 거짓 처리용
		 		- 참 : true / 거짓 : false
		 		 
		 */
		
		long money = 3000000000L;
		System.out.println(money);
		
		double pi = 3.141592;
		System.out.println(pi);
		
		char ch = '한';
		System.out.println(ch);
		
		boolean isBig = true;
		System.out.println(isBig);
		
	}

}
