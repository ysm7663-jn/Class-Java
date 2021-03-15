package ex03_method;

// this = 객체(필드, 메소드) 자신의 참조값

class Computer {

	// field
	String model;
	String manufacturer;
	int price;

	// method
	// 1. setInfo
	void setInfo(String model, String manufacturer, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	// 2. Info
	void Info() {
		System.out.println("제품명 : " + model);
		System.out.println("제조사: " + manufacturer);
		System.out.println("가격 : " + price);
	}

}

public class Ex05_this {

	public static void main(String[] args) {

		Computer com = new Computer();

		com.setInfo("GRAM", "LG", 180);
		com.Info();

	}

}
