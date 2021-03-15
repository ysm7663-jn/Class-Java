package ex03_map;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap 클래스
 * 1. Map 인터페이스를 구현한 클래스이다.
 * 2. 데이터를 쌍(pair)으로 저장하는 클래스이다.
 * 3. 데이터 구성
 * 		1) 키(key)   : 중복 저장이 불가능
 * 		2) 값(value) : 중복 저장이 가능
 * 
 * 4. 아파트 각 호별 인구수
 *   101호 : 3명
 *   102호 : 4명
 *   103호 : 2명
 *   ...
 *   key : value
 *   
 * 5. 사전
 *   apple : 사과
 *   banana : 바나나
 *   ...
 *   key : value
 */

public class Ex01_HashMap {

	public static void main(String[] args) {

		// 영한사전 만들기

		// Map <키, 값>
		// Map<영어단어, 한글의미>

		Map<String, String> dict = new HashMap<>();

		// 1. 추가 : put(키, 값)
		dict.put("apple", "사과");
		dict.put("banana", "바나나");
		dict.put("cherry", "체리");

		dict.put("apple", "아이폰을 만드는 회사"); // 기존 apple의 값이 수정된다. (사과 -> 아이폰을 만드는 회사)

		// 2. 요소 가져오기 : get(키) 메소드
		System.out.println("apple의 뜻 : " + dict.get("apple"));
		System.out.println("banana의 뜻 : " + dict.get("banana"));
		System.out.println("cheey의 뜻 : " + dict.get("cherry"));

		// 3. 삭제
		dict.remove("cheery");

		// 4. 포함여부 확인 : containsKey(키)
		if (dict.containsKey("apple"))
			dict.remove("apple");

		// 5. 크기 : size() 메소드
		System.out.println("등록된 단어 수 : " + dict.size());

		// 6. 순회는 따로
	}

}
