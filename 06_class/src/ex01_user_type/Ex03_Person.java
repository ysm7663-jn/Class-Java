package ex01_user_type;

class Person {
	
	String name;				// null
	int age;					// 0
	char gender;				// 코드 값 0인 문자 : 널 문자('\0')
	double height;				// 0.0
	boolean isAdult;			// false
	
}


public class Ex03_Person {

	public static void main(String[] args) {
		
		Person your = new Person();
		
		your.name = "홍길동";
		your.age = 25;
		your.gender = '남';
		your.height = 175.5;
		your.isAdult = your.height >= 20;
		
		System.out.println(your.name);
		System.out.println(your.age);
		System.out.println(your.gender);
		System.out.println(your.height);
		System.out.println(your.isAdult ? "성인" : "미성년자");

	}

}
