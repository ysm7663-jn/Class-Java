package ex02_inheritance_quiz;

class Protector {

	String name;

	Protector() {
		name = "없음";
	}

	Protector(String name) {
		this.name = name;
	}

	void info() {
		System.out.println("(주인 : " + name + ")");
	}

}

class Cat extends Protector {

	String catName;

	Cat(String catName, String name) {
		super(name);
		this.catName = catName;
	}

	Cat(String catName) {
		super();
		this.catName = catName;
	}

	@Override
	void info() {
		System.out.print("이름 : " + catName);
		super.info();
	}

}

public class Quiz01 {

	public static void main(String[] args) {

		Cat cat1 = new Cat("야옹이", "제임스");
		cat1.info(); // 이름 : 야옹이 (주인 : 제임스)

		Cat cat2 = new Cat("냥냥이");
		cat2.info();

	}

}
