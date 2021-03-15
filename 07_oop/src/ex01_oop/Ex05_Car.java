package ex01_oop;

class Engine {
	
	// feild
	String type;	// 가솔린, 디젤
	int cc;			// 배기량
	int hp;			// 마력
	
	// constructor
	Engine (String type, int cc, int hp) {
		this.type = type;
		this.cc = cc;
		this.hp = hp;
	}
	
	// method
	void info() {
		System.out.println("종류 : " + type);
		System.out.println("배기량 : " + cc + "cc");
		System.out.println("마력 : " + hp + "hp");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
}

class Car {
	
	// feild
	String model;
	double fuelEfficiency;		// 연비
	Engine engine;
	
	// constructor
	Car(String model, double fuelEfficiency, String type, int cc, int hp){
		this.model = model;
		this.fuelEfficiency = fuelEfficiency;
		this.engine = new Engine(type, cc, hp);
	}
	
	Car(String model, double fuelEfficiency, Engine engine) {
		this.model = model;
		this.fuelEfficiency = fuelEfficiency;
		this.engine = engine;
	}
	
	// method
	void info() {
		System.out.println("모델명 : " + model);
		System.out.println("연비 : " + fuelEfficiency + "km/l");
		engine.info();
	}
}

public class Ex05_Car {

	public static void main(String[] args) {

		// 서로 다른 방식의 두 자동차 생성
		
		Car car1 = new Car("xm3", 13.4, new Engine("가솔린", 1598, 123));
		Car car2 = new Car("아반때", 14.9, "디젤", 1598, 123);
		
		car1.info();
		car2.info();
		
		
		
		
		
	}

}
