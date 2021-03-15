package ex02_Quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		// 문제. 온도 변환기
		// 섭씨 온도를 입력하면 해당 화씨 온도를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하세요 >> ");
		double cel = sc.nextDouble();
		
		double fah = cel * 1.8 + 32;
		
		System.out.println("화씨 온도는 : " + fah + "Ｆ");
		
		sc.close();

	}

}
