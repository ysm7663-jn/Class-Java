package ex02_inheritance_quiz;

class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void info() {
		System.out.print("이름 : " + name + ", 나이 : " + age + "살");
	}

}

class Student extends Person {

	String school;

	Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	@Override
	void info() {
		super.info();
		System.out.println(", 학교 : " + school);
	}

}

class Worker extends Person {

	String job;

	Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	@Override
	void info() {
		super.info();
		System.out.println(", 직업 : " + job);
	}

}

public class Quiz02 {

	public static void main(String[] args) {

		// 학생과 직장인
		Student student = new Student("짱구", 15, "서강대"); // 이름, 나이, 학교

		Worker worker = new Worker("철수", 25, "변호사"); // 이름, 나이, 직업

		student.info(); // 이름 : 짱구, 나이 : 15살, 학교 : 서강대

		worker.info();
	}

}
