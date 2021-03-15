package ex01_generic;

// 무엇이든 담을 수 있는 GenericBox
// GenericBox를 생성할 때 저장할 데이터의 타입을 미리 결정하는 방식으로 동작

class GenericBox<T> { // T : 저장할 데이터의 타입을 의미, GenericBox가 생성될 때 어떤 타입인지 전달된다.(타입은 구분 상관 없음)

	private T item;

	// 생성자 생략해도 new GenericBox() 가능

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}

// 담을 물건
class Computer {
}

class Book {
}

public class Ex02_GenericBox {

	public static void main(String[] args) {

		// GenericBox 생성 (가장 중요)
		// 생성할 때 저장할 데이터의 타입을 결정해서 전달해야 한다.

		// GenericBox <Book> box = new GenericBox<Book>();
		GenericBox<Book> box = new GenericBox<>(); // 최근 추세 (위와 같은 코드)

		// 바로 위 생성 시점에 GenericBox 클래스는 아래와 같이 변경된다.
//		class GenericBox<T> {
//			private Book item;
//
//			public Book getItem() {
//				return item;
//			}
//
//			public void setItem(Book item) {
//				this.item = item;
//			}
//
//		}

		// box에 Book을 저장한다.
		box.setItem(new Book()); // 정상

		// box에 Computer를 저장한다.
		// box.setItem(new Computer()); // 비정상 (ObjectBox에서는 되던 작업)

		// box에 저장된 item 꺼내기
		Book book = box.getItem(); // 정상, 캐스팅이 필요 없다.

		// box에 저장된 item 꺼내기
		// Computer computer = box.getItem(); // 비정상 (ObjectBox에서는 되던 작업)

		// 정수를 담을 수 있는 GenericBox
		// generic 처리 시 "기본 자료형(int, double 등)" 은 사용이 불가능하다
		// 대신 Wrapper Class(Integer, Double 등)를 사용한다.
		GenericBox<Integer> box2 = new GenericBox<>();

		box2.setItem(100); // (100) -> Integer item (Auto Boxing)

		int n = box2.getItem(); // int n = Integer (Auto UnBoxing)

		System.out.println(n);

	}

}
