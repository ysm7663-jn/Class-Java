package ex02_inheritance_quiz;

class Elec { // 전자제품

	int watt; // 소비전력

	Elec(int watt) {
		this.watt = watt;
	}

	void info() {
		System.out.print(", 전력 : " + watt + "w");
	}

}

class Computer extends Elec {

	String name;
	int price;

	Computer(String name, int price, int watt) {
		super(watt);
		this.name = name;
		this.price = price;
	}

	@Override
	void info() {
		System.out.print("모델 : " + name + ", 가격 : " + price + "만원");
		super.info();
	}

}

class NoteBook extends Computer {

	int battery;
	
	NoteBook(String name, int price, int battery, int watt) {
		super(name, price, watt);
		this.battery = battery;
	}
	
	@Override
	void info() {
		System.out.println();
		System.out.print("배터리 용량 : " + battery + "w, ");
		super.info();
	}
	
}

public class Quiz03 {

	public static void main(String[] args) {

		Computer com = new Computer("알라딘", 200, 500);
		com.info(); // 모델 : 알라딘, 가격 : 200만원, 소비전력 : 500w

		NoteBook note = new NoteBook("gram", 150, 80, 400);
		note.info(); // 배터리 용량 : 80w, 모델 : gram, 가격 : 150만원, 소비전력 : 400w

	}

}
