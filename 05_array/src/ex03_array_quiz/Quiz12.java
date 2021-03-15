package ex03_array_quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {

		// 문제. 성적 관리 프로그램
		// 학생 3명의 이름 {"짱구", "철수", "맹구"};
		// 각 학생의 성적 0 ~ 100 사이 정수 3개
		// 입력 받은 성적들을 합계와 함께 출력

		// 짱구의 국어 점수 >> 10
		// 짱구의 영어 점수 >> 10
		// 짱구의 수학 점수 >> 10

		Scanner sc = new Scanner(System.in);

		String[] name = { "짱구", "철수", "맹구", "유리", "합계" };
		String[] subject = { "국어", "영어", "수학", "과학", "총점" };

		int[][] score = new int[name.length][subject.length];

		// 입력 받기
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print(name[i] + "의 ");
				System.out.print(subject[j] + "점수 >> ");
				score[i][j] = sc.nextInt();

				score[i][subject.length - 1] += score[i][j]; // 총점
				score[name.length - 1][j] += score[i][j]; // 합계
				score[name.length - 1][subject.length - 1] += score[i][j];	// 전체 합계
				// 각각의 점수 : score[i][j]
				// 개인별 총점 : score[i][subject.length-1]
				// 과목별 합계 : score[name.length-1][j]
				// 전체 합계 : score[name.length-1][subject.length-1]
			}
		}

		// 이름, 과목 출력
		System.out.println("성적 결과");
		System.out.print("\t");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();

		// 점수 출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();

	}

}
