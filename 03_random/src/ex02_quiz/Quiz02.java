package ex02_quiz;

import java.util.Random;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 문제. 아이템 획득하기
		// 10% 확률로 "전설 아이템", 나머지 확률로 "영웅 아이템" 출력
		
		Random rand = new Random();
		
		String item = rand.nextDouble() >= 0.9 ? "전설 아이템" : "영웅 아이템";
		
		System.out.println(item);
		

	}

}
