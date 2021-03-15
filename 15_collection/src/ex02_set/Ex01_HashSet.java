package ex02_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {

	public static void main(String[] args) {

		// hash = 검색 그룹의 값 (ex) 회원 1000명이면, 성으로 hash 그룹을 만들고, 해당 성을 가진 그룹에서만 검색할 수 있어 탐색 속도가 향상 된다.
		
		/*
		 * HashSet 클래스 
		 * 1. Set 인터페이스를 구현한 클래스이다. 
		 * 2. Set 인터페이스의 특징 
		 *   1) 저장된 요소간 순서가 없다. 
		 *   2) 중복 저장이 불가능하다.(unique)
		 * 
		 * 3. HahSet 클래스의 중복 판단 원리 
		 *  1) hashCode 비교 - 주소 비교(int 값) 
		 * 	 (1) 값이 같으면 : 중복 가능성 있음(다음에 equals() 호출)
		 *   (2) 값이 다르면 : 중복 가능성 없음 
		 *  2) equals() - 동등 비교
		 */

		Set<String> set = new HashSet<>();

		// 1. 추가 : add
		set.add("java");
		set.add("db");
		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("jsp");
		set.add("spring");
		set.add("java"); // 중복
		set.add("css"); // 중복

		// 2. 순회
		for (String course : set)
			System.out.println(course);

	}

}
