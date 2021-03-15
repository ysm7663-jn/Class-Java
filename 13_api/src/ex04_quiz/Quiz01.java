package ex04_quiz;

import java.util.Scanner;

public class Quiz01 {

	// static 메소드 (클래스 메소드)
	// static 메소드 + static 필드만 호출할 수 있다.

	// inputFullName 메소드
	// 실행 예)
	// 성(lastName)을 입력하세요 >>> james
	// 이름(firstName)을 입력하세요 >>> dean
	// james dean 을 반환하는 메소드로 구현하시오.
	private static Scanner sc = new Scanner(System.in);

	public static String inputFullName() {

		System.out.print("성(lastName)을 입력하세요 >>> ");
		String lastName = sc.next();
		System.out.print("이름(firstName)을 입력하세요 >>> ");
		String firstName = sc.next();

		StringBuffer sb = new StringBuffer();
		sb.append(lastName).append(" ").append(firstName);

		return sb.toString(); // StringBuffer -> String

	}

	public static void main(String[] args) {

		String fullName1 = inputFullName(); // inputFullName() 메소드는 같은 클래스에 있다.
		String fullName2 = inputFullName();

		System.out.println("성명1 : " + fullName1);
		System.out.println("성명2 : " + fullName2);

		if (fullName1.equals(fullName2)) {
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다.");
		}

	}

}
