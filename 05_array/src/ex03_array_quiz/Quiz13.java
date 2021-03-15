package ex03_array_quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		// 문제. 영한 사전
		// 4계절을 영어로 묻고 답하기
		// 봄을 영어로 하면? >>> spring
		// 정답
		// 여름을 영어로 하면? >>> summer
		// 정답
		// 가을을 영어로 하면? >>> fall
		// 정답
		// 겨울을 영어로 하면? >>> walter
		// 오답

		String[][] dictionary = { 
				{ "봄", "spring" }, 
				{ "여름", "summer" }, 
				{ "가을", "fall" }, 
				{ "겨울", "winter" } 
			};

		Scanner sc = new Scanner(System.in);

		String anw = "";
		
		for (int i = 0; i < dictionary.length; i++) {

				System.out.print(dictionary[i][0] + "을 영어로 하면? >>> ");
				anw = sc.next();
				
				if (anw.equalsIgnoreCase(dictionary[i][1])) 
					System.out.println("정답");
				
				else 
					System.out.println("오답");
			}
		sc.close();
	}
}