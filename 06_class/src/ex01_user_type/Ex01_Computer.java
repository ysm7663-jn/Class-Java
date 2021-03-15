package ex01_user_type;

/*
 * 
 * 객체 지향 언어
 * 	1. 모든 사물을 객체로 만들어서 처리하는 언어
 * 	2. 객체를 만드는 설계도를 클래스
 * 		클래스				객체
 * 		붕어빵 기계 			붕어빵
 * 	3. 개발자가 만드는 '타입'을 클래스라고 볼 수 있다.
 */

/*
 * 클래스의 구성
 * 	1. 필드(field)
 * 		객체가 가질 값
 * 	2. 메소드(method)
 * 		객체가 가질 기능
 * 	3. 예시
 * 		컴퓨터 클래스
 * 		- 필드 : 모델명, 제조사, 가격, 생산년도 등
 * 		- 메소드 : 계산, 인터넷, 앱, 게임 등
 */

/*
 * 객체
 * 1. 클래스가 있어야만 객체를 생성할 수 있다,
 * 2. 객체는필드와 메소드를 가진다
 * 3. 생성 방법
 * 	1) new를 이용한 동적 생성
 * 	2) 정적 생성
 * 4. 필드와 메소드 호출 방법
 * 	1) 객체.필드
 * 	2) 객체.메소드()
 */

// 하나의 자바 파일에 여러 클래스를 둘 수 있다.(비추천)
// 파일명과 같은 이름의 클래스만 public을 붙인다.

class Computer{
	
	String name;
	String manufacturer;
	int price;
	
}


public class Ex01_Computer {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		myCom.name = "GRAM";
		myCom.manufacturer = "LG";
		myCom.price = 180;
		
		Computer yourCom = new Computer();
		
		yourCom.name = "Flex";
		yourCom.manufacturer = "SAMSUNG";
		yourCom.price = 150;
		

	}

}
