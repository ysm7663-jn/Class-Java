package ex02_Quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {

		// 문제. 체질량 지수(BMI)를 구하고, 건강 상태 출력
		// 체질량 지수 = 몸무게(kg) / 키(m) ^ 2
		
		// 건강상태 = 체질량지수 25이상 "과체중" , 24 ~ 20 "정상", 20미만 " 저체중"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요(kg) >> ");
		double weight = sc.nextDouble();
		System.out.print("키를 입력하세요(cm) >> ");
		double height = sc.nextDouble();
		
		height /= 100;
		
		double bmi = weight / (height * height);
		
		String health = bmi >= 25 ? "과체중" : bmi >= 20 ? "정상" : "저체중";
		
		System.out.println("체질량 지수 : " + bmi + ", 건강상태 : " + health);
		

	}

}
