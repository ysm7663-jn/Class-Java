package ex04_constuctor;

/*
 *  생성자 
 *  1. 메소드의 일종
 *  2. 생성자의 특징
 *  	1) 결과타입 : 존재하지 않는다.(void 아님, 아무것도 작성하지 않음)
 *  	2) 메소드명 : 클래스명과 동일
 *  	3) 매개변수 : 일반 메소드와 동일
 *  
 *  3. 생성자는 객체 생성(new) 시점에 호출된다.
 *  4. 메소드 오버로딩이 가능하다
 *  	Computer com1 = new Computer();
 *  	Computer com2 = new Computer("gram");
 *  	Computer com3 = new Computer("gram", "LG");
 *  
 *  생성자 : 객체 생성 + 필드 값 채우고 싶어서 사용 
 *  
 */

class Computer{
	// field
	String model;
	String manufacturer;
	int price;
	
	// constructor
	Computer () {
		System.out.println("Computer() 호출");
	}
	
	Computer (String modle)	{
		this.model = model;
	}
	
	Computer (String model, String manufacturer)	{
		this.model = model;
		this.manufacturer = manufacturer;
	}
	
	Computer (String model, String manufacturer, int price)	{
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	// method 
	// 필드 정보를 출력
	void info() {
		System.out.println("모델 : " + model);
		System.out.println("제조사 : " + manufacturer);
		System.out.println("가격 : " + price);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	
}

public class Ex01_Computer {

	public static void main(String[] args) {
		
		Computer com1 = new Computer();
		Computer com2 = new Computer("gram");
		Computer com3 = new Computer("gram","LG");
		Computer com4 = new Computer("gram","LG",180);
		
		com1.info();
		com2.info();
		com3.info();
		com4.info();
	}

}
