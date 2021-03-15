package ex03_access_modifier;

class Person {
	
	private String name;				// null
	private int age;					// 0
	private char gender;				// 코드 값 0인 문자 : 널 문자('\0')
	private double height;				// 0.0
	private boolean adult;			// false
	
	// constructor
	// 내용을 비우는 생성자
	public Person() {
		// 하는 일 없음 : new Person()을 호출할 수 있도록 만들어 둔다.
	}
	
	// 내용을 채우는 생성자
	public Person(String name, int age, char gender, double height, boolean adult) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.adult = adult;
	}
	
	// method
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
		setAdult(this.age >= 20);
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public boolean isAdult() {
		return adult;
	}
	
}

public class Ex03_Person {

	public static void main(String[] args) {
		
		// 1. 이름과 나이만 가진 Person
		Person p1 = new Person();
		p1.setName("짱구");
		p1.setAge(20);
		
		// 2. 모든 걸 가진 Person
		Person p2 = new Person("맹구", 22, '남', 175.5, true);
		
		// 3. 모든 걸 가진 Person
		Person p3 = new Person();
		p3.setName("철수");
		p3.setAge(22);
		p3.setGender('남');
		p3.setHeight(172.5);
		p3.setAdult(true);
		
		System.out.print(p1.getName());
		System.out.print(p1.getAge());
		
	}

}
