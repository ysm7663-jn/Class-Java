// 매개변수만 있고 결과 타입이 없는 메소드

package ex03_method;

import java.util.Date;

class User {
	
	// field
	String id;
	String pw;
	Date date;			// Date 타입의 date 객체		Date date = new Date();
	
	// method
	// 1. 필드 정보 저장
	// 1) 결과타입 : void
	// 2) 메소드명 : setinfo
	// 3) 매개변수 : String uId, String uPw
	
	void  setInfo (String uId, String uPw) {
		
		id = uId;
		pw = uPw;
		date = new Date();		// new Date() 는 현재 날짜와 시간을 의미 		// 객체는 new 없으면 생성되지 않음 
		
	}
	
	// 2. 필드 정보 출력 메소드
	// 1) 결과타입 : void
	// 2) 메소드명 : info
	// 3) 매개변수 : 없음
	
	void info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw.substring(0, 2) + "*******");    // substring 0 <= x < 2 사이값
		System.out.println("가입일 : " + date.toString());						// 날짜를 문자열로 바꿔준다
	}
	
}

public class Ex01_User {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.setInfo("admin", "123456");
		user.info();
		
	}

}

