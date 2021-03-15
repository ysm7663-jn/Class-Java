package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		// 문제. 국어와 영어 점수를 입력 받아서,
		// "합격", "불합격"을 구분하여 출력
		// 국어와 영어 점수가 모두 80점 이상, 평균이 85점 이상이면 "합격"

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 >> ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 >> ");
		int eng = sc.nextInt();

		double avg = (kor + eng) / 2.0;

		if (kor >= 80 && eng >= 80 && avg >= 85)
			System.out.println("합격");

		else
			System.out.println("불합격");

	}

}
