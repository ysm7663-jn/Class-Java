package ex05_quiz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// 문제. 임의의 User를 3명 저장하는 ArrayList를 생성하시오.
// 회원번호를 입력 받아 검색하여 일치하는 회원을 삭제하시오.

class User {

	private int no; // 회원번호
	private String id; // 아이디
	private Date date; // 가입일

	public User(int no, String id) {
		super();
		this.no = no;
		this.id = id;
		this.date = new Date();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return no + " " + id;
	}

}

public class Quiz01 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();

		list.add(new User(1, "james"));
		list.add(new User(2, "jack"));
		list.add(new User(3, "rose"));

		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원번호를 입력하세요 >> ");
		int num = sc.nextInt();

		// 저장된 User의 no와 입려된 no 비교
		int removeIndex = -1;
		for (int i = 0, size = list.size(); i < size; i++) {
			if (list.get(i).getNo() == num)
				// 해당 인덱스(i) User 삭제하기 위해서 인데스 저장해 두기
				removeIndex = i;
		}

		// removeIndex 요소 삭제
		if (removeIndex != -1)
			list.remove(removeIndex);

		// 출력
		// 개별 객체 정보를 문자열로 반환하는 toString 메소드를 함께 활용
		// 1) toString() 오버라이드 전이라면 => [객체, 객체, 객체]
		// System.out.println(list); // [객체, 객체, 객체] -> 주소값이 출력됨

		// 2) toString() 오버라이드 이후 User 클래스의 toString 메소드가 동작한다.
		System.out.println(list); // [아이디, 아이디, 아이디]

		sc.close();

	}

}
