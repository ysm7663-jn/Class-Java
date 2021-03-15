package ex02_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex03_LinkedHashSet {

	public static void main(String[] args) {

		// LinkedHashSet 클래스는 저장된 요소들의 순서가 유지된다.
		Set<String> set = new LinkedHashSet<>();

		// 추가 : add() 메소드
		set.add("사과");
		set.add("바나나");
		set.add("체리");

		// Iterator 클래스를 이용한 순회
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
