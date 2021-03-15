package ex03_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Member {

	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	// hashCode() 메소드를 만들면 Object 클래스의 hashCode() 메소드 사용되지 않는다.
	@Override
	public int hashCode() {

		// return 1; // 임의 설정 -> 모든 Member는 hash값이 1이므로 같은 Member일 가능성이 있다고 판단한다. (최악의 hashCode)
		// return id.length();	// id의 글자수가 같은 Member일 가능성이 있다고 판단한다.
		return id.charAt(0);	// id의 첫 번째 글자가 같으면, 같은 Member일 가능성이 있다고 판단한다.  >>> 그룹이 세밀해질수록 더 좋다
	}
	
	// hashCode() 결과가 같으면 equals() 메소드를 호출해서 비교한다.
	// equals() 메소드를 만들면 Object 클래스의 equals() 메소드는 사용되지 않는다.
	@Override
	public boolean equals(Object obj) {	// m1.equals(m2)
		// this.id = m1     obj = m2 (다운캐스팅 필요)
		return id.equals(((Member)obj).id);
	}
	
	// hashCode 와 equals 자동생성 기능이 있다. hashCode() 의 계산법은 자동 생성이 더 뛰어나기 때문에 자동 생성 사용할 것 

}

public class Ex02_HashSet {

	public static void main(String[] args) {

		// HashSet 클래스는 중복 저장이 불가능하다.
		// 중복 체크 방법
		// 1단계. hashCode 값을 비교한다.(같은 hashCode이면 같은 객체일 가능성이 있다.
		// 2단계. equals로 비교한다.

		Member m1 = new Member("abc");
		Member m2 = new Member("abc");
		Member m3 = new Member("xyz");

		Set<Member> set = new HashSet<>();

		set.add(m1);
		set.add(m2);

		System.out.println(set);
		
		// HashMap의 활용
		// 회원(Member)별 포인트(Integer) 관리
		
		Map<Member, Integer> map = new HashMap<>();
		
		map.put(m1, 5000);	// m1 회원의 포인트 : 5000
		map.put(m1, 6000);	// m1 회원의 포인트 : 6000 으로 수정
		map.put(m3, 10000);	// m1 회원의 포인트 : 10000
		
		System.out.println(map); 
		}

}
