package ex04_constuctor;

import java.util.Arrays;

class Student {

	String name;
	String school;
	int score[];
	double average;
	boolean isPass;
	
	Student(String name, String school){
		this.name = name;
		this.school = school;
	}
	
	void doExam() {
		score = new int[3];
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) { 
			score[i] = (int)(Math.random() * 51) + 50;
			sum += score[i]; 
		}
		
		average = sum / score.length;
		
		isPass = average >= 80;
		
	}
	
	void info() {
		System.out.println("이름 : " + name); 
		System.out.println("학교 : " + school); 
		System.out.println("점수 : " + Arrays.toString(score)); 
		System.out.println("평균 : " + average); 
		System.out.println(isPass ? "합격" : "불학격");
	}

}

public class Ex05_Student {

	public static void main(String[] args) {
		
		// 클래스, 메소드의 소스 코드를 확인하려면,
		// Ctrl키를 누르고 클릭
		
		Student std = new Student("제임스 ", "서강대");
		
		std.doExam();
		std.info();
		
		// 이름 : 제임스
		// 학교 : 서강대
		// 점수 : [50, 75, 100]
		// 평균 : 75.0점
		// 불합격 (평균 80점 이상 합격)
	}
}