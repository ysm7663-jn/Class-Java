package ex02_object_array;

import java.text.DecimalFormat;
import java.util.Arrays;

class Student {

	String name;
	int[] scores; // 모든 점수들
	double avg; // 평균
	char grade; // 학점
	boolean isPass; // 합격유무(평균 60점 기준)
	double allAvg;

	Student(String name) {
		this.name = name;
	}

	void setScores(int scoreCount) {
		this.scores = new int[scoreCount];
		for (int i = 0; i < scores.length; i++) { // i < scoreCount도 가능
			this.scores[i] = (int) (Math.random() * 101);
		}
		this.avg = getAvg();
		this.grade = getGrade();
		this.isPass = isPass();

	}

	double getAvg() {
		int sum = 0;

		for (int i = 0; i < scores.length; i++)
			sum += scores[i];

		return (double) sum / scores.length;
	}

	char getGrade() {
		if (avg >= 90)
			return 'A';
		else if (avg >= 80)
			return 'B';
		else if (avg >= 70)
			return 'C';
		else if (avg >= 60)
			return 'D';
		else
			return 'F';
	}

	boolean isPass() {
		return avg >= 60;
	}

	void info() {
		System.out.print(name + ", ");
		System.out.print(Arrays.toString(scores) + ", ");
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print(df.format(avg) + ", ");
		System.out.print(grade + ", ");
		System.out.println(isPass ? "합격" : "불합격");

	}

}

class Lecture {

	String lectureName;
	Student[] studentList;
	int idx;
	double allAvg;

	Lecture(String lectureName, int studentNum) {
		this.lectureName = lectureName;
		studentList = new Student[studentNum];
	}

	void addSutdent(Student student) {
		studentList[idx++] = student;
	}

	void doExam() {
		double total = 0.0;
		for (int i = 0; i < idx; i++) {
			studentList[i].setScores(3);
			total += studentList[i].getAvg();
			this.allAvg = total / idx;
		}
	}

	void info() {
		System.out.println("강좌명 : " + lectureName + " (전체 평균 : " + new DecimalFormat("0.00").format(allAvg) + "점)");
		for (int i = 0; i < idx; i++)
			studentList[i].info();
	}

}

public class Ex04_Student {

	public static void main(String[] args) {

		// 학생 5명의 이름
		String[] names = { "짱구", "철수", "맹구", "유리", "훈이" };

		// 강좌 생성
		Lecture lecture = new Lecture("웹 개발자 양성", names.length);

		// 강좌에 학생 5명 등록
		for (int i = 0; i < names.length; i++) {
			lecture.addSutdent(new Student(names[i])); // 5번 호출
		}

		// 강좌 시험 개설
		lecture.doExam();

		// 강좌 시험 결과
		lecture.info(); // 학생 정보 모두 출력 + 강좌의 평균 출력
	}

}