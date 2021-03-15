package ex01_list;

import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList
 * 1. List 인터페이스를 구현한 클래스이다.
 * 2. 연결리스트를 만들어 놓은 것이다.
 * 3. 각 요소들이 링크를 이용해 연결되어 있다. 
 * 4. 장점 : 모든 위치에 추가/삭제가 빠르다. 
 * 5. 단점 : 전체 순회가 느리다.
 */

public class Ex03_LinkedList {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("짱구");
		list.add(new String("철수"));
		list.add("맹구");

		if (list.contains("훈이"))
			System.out.println("훈이가 있다.");
		System.out.println("훈이가 없다.");

		list.remove(0);
		list.remove("철수");

		for (int i = 0, size = list.size(); i < size; i++)
			System.out.println(list.get(i));

	}

}
