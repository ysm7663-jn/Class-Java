package ex05_quiz;

import java.util.HashSet;
import java.util.Set;

// 문제. 로또 발생기
// HashSet 클래스를 이용해서 당첨 번호 6개만 생성

public class Quiz02 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		while (set.size() != 6) {
			set.add((int) (Math.random() * 45) + 1);

		}

		System.out.print(set);
	}

}
