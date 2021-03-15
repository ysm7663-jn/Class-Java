package ex04_constuctor;

import java.util.Calendar;
import java.util.Date;

class Person {
	
	String name;
	String sn;				// 주민등록번호(- 포함)
	int age;				// sn으로 자동 계산, (1, 2, 5, 6 - 1900년대 / 3, 4, 7, 8 - 2000년대 )
	char gender;			// sn으로 자동 계산	 (1, 3, 5, 7 - 남자 /  2, 4, 6, 8 - 여)
	boolean isKorean;		// sn으로 자동 계산	 (1, 2, 3, 4 - 한국인 / 5, 6, 7, 8 - 외국인)
	
	
	Person(String name, String sn) {
		this.name = name;
		this.sn = sn;
		
		isKorean = sn.charAt(7) >= '1' &&  sn.charAt(7) <= '4';
	}
	
	int getAge() {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		String age1 = sn.substring(0, 2);
		char ch = sn.charAt(7); 
		
		if(ch < '3')
			age = year - (1900 + Integer.parseInt(age1)) + 1;
		else
			age = year - (2000 + Integer.parseInt(age1)) + 1;
		
		return age;
		
	}
	
	char getGender() {
		
		gender = sn.charAt(7);
		
		if(gender % 2 == 0)
			gender = '여';
		else
			gender = '남';
		
		return gender;
	}
	
	
	
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("주민 : " + sn);
		System.out.println("나이 : " + getAge() + "살");
		System.out.println("성별 : " + getGender());
		System.out.println(isKorean ? "한국인" : "외국인");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	
}


public class Ex03_Person {

	public static void main(String[] args) {
		
		Person p1 = new Person("짱구", "951212-1234567");
		Person p2 = new Person("유리", "051212-4567891");
		
		p1.print();
		p2.print();

	}

}
