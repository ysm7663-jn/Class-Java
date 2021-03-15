package ex04_constuctor;

class aPerson {
	
	String name;
	String sn;				// 주민등록번호(- 포함)
	int age;				// sn으로 자동 계산, (1, 2, 5, 6 - 1900년대 / 3, 4, 7, 8 - 2000년대 )
	char gender;			// sn으로 자동 계산	 (1, 3, 5, 7 - 남자 /  2, 4, 6, 8 - 여)
	boolean isKorean;		// sn으로 자동 계산	 (1, 2, 3, 4 - 한국인 / 5, 6, 7, 8 - 외국인)
	
	aPerson(String name, String sn) {
		this.name = name;
		this.sn = sn;
		
		switch (sn.charAt(7)) {
		case '1':
		case '2':
		case '5':
		case '6': age = 2020 - (1900 + Integer.parseInt(sn.substring(0,2))) + 1;
				  break;
		default :
				  age = 2020 - (2000 + Integer.parseInt(sn.substring(0,2))) + 1;
		}
		
		// 성별 : 홀수 - 남자 // 짝수 - 여자
		gender = sn.charAt(7) % 2 == 1 ? '남' : '여';
		
		// 한국인 : '1' ~ '4'   '4'이하
		isKorean = sn.charAt(7) >= '1' &&  sn.charAt(7) <= '4';
	}
	
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("주민등록번호 : " + sn.substring(0, 8) + "******");
		System.out.println("나이 : " + age + "살");
		System.out.println("성별 : " + gender);
		System.out.println(isKorean ? "한국인" : "외국인");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	

}

public class Ex03_person_T {

	public static void main(String[] args) {

		aPerson p1 = new aPerson("짱구", "951212-1234567");
		aPerson p2 = new aPerson("유리", "051212-4567891");
	
		p1.print();
		p2.print();
		
	}

}
