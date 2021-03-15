package ex02_exception_class;

import java.util.Scanner;

class NameException extends Exception {

	public NameException(String message) {
		super(message);
	}
}

class Human {

	private String name;

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameException {

		if (name.length() > 6 || name.length() < 0) {
			NameException e = new NameException("이름은 2 ~ 6자만 가능합니다.");
			throw e;
		}

		this.name = name;

	}

}

public class Ex02_NameException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			Human h = new Human("짱구");

			System.out.print("이름을 입력하세요 >> ");
			String name = sc.next();

			h.setName(name);
			System.out.println("변경된 이름 : " + h.getName());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
