package ex02_Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세여 >>> ");
		int kor = s.nextInt();
		
		System.out.print("영어 점수를 입력하세여 >>> ");
		int eng = s.nextInt();
		
		double avg = (kor + eng) / 2.0;
		
		System.out.println("평균 점수 : " + avg);
				
		s.close();
		
	}

}
