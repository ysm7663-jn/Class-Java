package ex03_array_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 문제. 성적 관리 프로그램
		// 학생 3명의 이름 {"짱구", "철수", "맹구"};
		// 각 학생의 성적 임의의 정수 1개
		// 학생의 점수를 입력 받아서, 평균, 최고, 최저 점수 출력
		
		Scanner sc = new Scanner(System.in);
		
		String [] students = {"짱구", "철수", "맹구"};
		
		int [] scores = new int[students.length]; 
		
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i] + "의 점수 입력 >> ");
			scores[i] = sc.nextInt();
		}
		
		double avg = 0;
		int total = scores[0];
		int max = scores[0];
		int min = scores[0];
		
		for(int i = 1; i < scores.length; i++) {
			total += scores[i];
			
			if(scores[i] > max)
				max = scores[i];
			
			if(scores[i] < min)
				min = scores[i];
			
		}
			
		System.out.println("평균 : " + (double)(total / scores.length) + "점, 최고 : " + max + "점, 최저 : " + min );
		
		sc.close();
		
		
	}

}


// collection을 사용하게 돼도, String 배열은 계속 사용됨 (int, double과 별개로)