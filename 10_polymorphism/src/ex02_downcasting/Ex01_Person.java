package ex02_downcasting;

// 모든 사람은 Person 타입이다.
class Person {

	// method
	public void eat() {
		System.out.println("먹는다.");
	}

	public void sleep() {
		System.out.println("잔다.");
	}

}

class Student extends Person {

	// method
	public void study() {
		System.out.println("공부한다.");
	}
}

class Worker extends Person {

	// method
	public void work() {
		System.out.println("일한다.");
	}

}

public class Ex01_Person {

	public static void main(String[] args) {

		// upcasting
		// 슈퍼클래스타입으로 객체 = new 서브클래스();

		Person p1 = new Student();
		Person p2 = new Worker();

		p1.eat();
		p1.sleep();
		// p1.study(); // ???우예 부르노 // Person 클래스의 메소드만 호출할 수 있어서

		p2.eat();
		p2.sleep();
		// p2.work(); // 이건 또 뭐꼬 // Person 클래스의 메소드만 호출할 수 있어서

		// downcasting
		// Person 타입의 p1 객체를 Student 타입으로 변환하면 study 메소드도 보인다.
		// 1. 슈퍼클래스 타입의 객체를 서브클래스 타입으로 변환한다.
		// 2. 반드시 강제로 변환해야 한다.

		((Student) p1).study(); // . 의 우선순위가 높기 때문에 (Student)p1에 괄호를 하나 더 채워 우선순위를 높인다.
		((Worker) p2).work();

		// 실수해보자.
		// 잘못된 다운캐스팅
		Person p3 = new Student();

		// ((Worker)p3).work(); // 잘못된 다운캐스팅이지만, 이클립스는 문제를 못 잡는다.
		// casting 작업은 무조건 수행한다. 위험한 작업

		// 안전한 캐스팅을 위해서
		// 타입을 확인하고 캐스팅하자.
		// 클래스타입 확인 : instanceof

		if (p3 instanceof Worker) // p3 객체(인스턴스)가 Worker 타입이면
			((Worker) p3).work();

		else if (p3 instanceof Student)
			((Student) p3).study();

	}
}
