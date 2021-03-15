package ex03_Object;

class Book {

	private String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	public void info() {
		System.out.println("책 제목 : " + title);
	}

	/*
	 * Object 클래스의 toString() 메소드
	 * 
	 * public String toString() { return xxx; }
	 */

	// Object 클래스의 toSting() 메소드를 사용하기 싫으면
	// 다시 만들면 된다. (메소드 오버라이드)
	@Override
	public String toString() {
		return "책 제목 : " + title;
	}

}

public class Ex03_toString {

	public static void main(String[] args) {

		Book book = new Book("이것이 자바다");

		// 책 정보 출력
		book.info();

		// 책 정보 출력하고 싶어서 이런 코드도 가능한가?
		System.out.println(book);
		// 결과값 : Class at Addr
		System.out.println(book.toString());
		// 위와 같은 결과(같은 코드) * 주로 위에있는 코드 사용

		// Object 클래스의 toString 메소드는

		// '클래스타입(Class) @(at) 메모리 주소(Addr)' 를 반환한다.

		// getClass().getName() @ hashCode()값 (16진수)

	}

}
