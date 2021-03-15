package ex01_list;

import java.util.ArrayList;

/*
 * ArrayList      * 옛날에는 Vector라는 것을 사용하기도 함
 * 1. List 인터페이스를 구현하는 클래스이다.
 *   1) ArrayList<Integer> iList = new ArrayList<>();
 *   2) List<Integer> iList = new ArrayList<>();	// 주로 사용
 *   
 * 2. 배열을 사용하기 쉽게 만들어 놓은 클래스이다.
 * 
 * 3. 장점 : 순차적인 접근이 빠르다.(검색이 빠르다)
 * 4. 단점 : 중간 위치에 요소를 추가(뒤의 값을 뒤로 밀어야하기 때문)하거나 삭제(뒤의 값을 당겨야하기 때문)할 때 느리다.
 */

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<>();
		
		// 1. 저장 : add() 메소드 
		iList.add(10);
		iList.add(new Integer(20));
		iList.add(new Integer("30"));
		
		// 2. 크기 : size() 메소드
		System.out.println("iList 크기 : " + iList.size());
		
		// 3. 저장된 요소 가져오기 : get() 메소드
		System.out.println("첫 번째 요소 : " + iList.get(0));
		System.out.println("마지막 요소 : " + iList.get(iList.size() - 1));
		
		// 4. 전체 순회하는 for문
		// method 호출을 여러번 진행함, 성능이 필드 호출보다 안 좋음
		// 나쁜 코드
		for(int i = 0; i < iList.size(); i++)
			System.out.println((i + 1) + "번째 요소 : " + iList.get(i));

		System.out.println("-----");
		
		// 5. 개선된 for문 (size() 메소드 호출을 한 번으로 줄임)
		// 클린 코드
		for(int i = 0, size = iList.size(); i < size; i++)
			System.out.println((i + 1) + "번째 요소 : " + iList.get(i));
					
		System.out.println("-----");
		
		// 6. 삭제 : remove 메소드
		iList.remove(0);  // 첫 번째 요소 삭제(인덱스 0), 삭제 된 값을 return
		System.out.println(iList.get(0));	// 삭제된 자리 뒤의 요소들이 앞 당겨져 빈 자리를 메꾼다.
		
		iList.remove(new Integer(20)); // 요소 번호가 아닌 요소의 값을 찾아 삭제, booleand type 으로 return
		
		// 7. 검색 : contains() 메소드
		if (iList.contains(new Integer(30)))	// iList에 30이 있는가?
			System.out.println("30이 있다.");
		
		// 8. 출력 
		System.out.println(iList); //[ , , , .]
		
		// 9. 초기화 (모두 삭제)
		iList.clear();
		System.out.println(iList);	// []
		
		
		
		
				

	}

}
