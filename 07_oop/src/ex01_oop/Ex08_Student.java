package ex01_oop;

class Exam {
	
	String examName;
	int kor, eng, math;		// 0 ~ 100
	double avg;
	char grade;		// A>=90, B>=80, C>=70, D>=60, F
	
	// constructor
	Exam (String examName) {
		this.examName = examName;
	}
	
	// method
	// 코딩 순서대로 실행되기 때문에 순서 신경 쓰기
	void setScore() {
		kor = (int)(Math.random() * 101) + 0;
		eng = (int)(Math.random() * 101) + 0;
		math = (int)(Math.random() * 101) + 0;
		setAverage();
		setGrade();
	}
	
	void setAverage() {
		avg = (kor + eng + math) / 3.0;
	}
	
	void setGrade() {
		if(avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';
	}
	
	void info() {
		System.out.println(examName + "의 결과");
		System.out.println("국어, 영어, 수학 : " + kor + ", " + eng + ", " + math);
		System.out.println("평균 : " + avg + "(" + grade + ")");
	}
	
}

class Student {
	
	String name;
	Exam exam;
	
	Student(String name) {
		this.name = name;
	}
	
	void setExam(Exam exam) {
		this.exam = exam;
	}
	
	void setScore () {
		exam.setScore();
	}
	
	void info() {
		System.out.println("학생이름 : " + name);
		exam.info();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
}

public class Ex08_Student {

	public static void main(String[] args) {
		
		Exam exam1 = new Exam("중간고사");
		Exam exam2 = new Exam("기말고사");
		
		Student student = new Student("짱구");
		
		student.setExam(exam1);
		student.setScore ();
		student.info();
		
		student.setExam(exam2);
		student.setScore();
		student.info();
		

	}

}
