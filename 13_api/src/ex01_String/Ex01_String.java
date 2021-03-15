package ex01_String;

public class Ex01_String {

	public static void main(String[] args) {

		// 1. 동일한 문자열 리터럴(직접 적은것)은 자바에 의해 최적화된다.
		// 하나의 문자열 리터럴만 생성해서 사용한다.
		String a = "apple";
		String b = "apple";

		System.out.println(a == b); // true

		String c = new String("banana");
		String d = new String("banana");

		// 2. new는 무조건 새로 생성된다.
		System.out.println(c == d); // false

		// 3. == 참조 값(주소 값)을 비교한다.
		// 내용을 비교하려면 equals, equalsIgnorCase 메소드를 사용한다.
		System.out.println(a.equals(b)); // true
		System.out.println(c.equals(d)); // true

		// 4. 문자열의 길이는 length 메소드를 이용한다.
		System.out.println("apple은 " + a.length() + "글자이다.");
		System.out.println("banana는 " + c.length() + "글자이다.");

		// 5. 문자열의 특정 문자는 charAt 메소드를 이용한다.
		System.out.println("apple의 첫 번째 글자는 " + a.charAt(0) + "이다.");

		// 6. 문자열에서 특정 문자열만 추출할 때는 substring 메소드를 이용한다.
		// substring(시작 인데스) : 시작 포함 끝까지 출력
		// substring(시작 인덱스, 종료 인덱스) : 시작 <= < 종로 영역을 추출
		System.out.println("apple의 첫 3글자는 " + a.substring(0, 3) + "입니다."); // 0, 1, 2만 출력

		// 7. 특정 문자(문자열)의 인덱스를 반환하는 indexOf 메소드가 있다.
		// 발견된 첫 번째 문자(문자열)의 인덱스가 반환된다.
		// indexOf(찾을 문자) : 처음부터 검색
		// indexOf(찾을 문자, 시작 인덱스) : 시작 인덱스부터 검색
		String str = "best of best of best";
		System.out.println("첫 번째 best 인덱스 : " + str.indexOf("best"));
		System.out.println("두 번째 best 인덱스 : " + str.indexOf("best", 5)); // 시작인덱스 : 1 ~ 8 모두 가능
		// 첫 번째 best가 언제 나오는지 모르는 상황이라면 : 첫 번째 best 인덱스 다음부터 검색
		System.out.println("두 번째 best 인덱스 : " + str.indexOf("best", str.indexOf("best") + 1));

		// 8. 거꾸로 찾는 lastIndexOf 메소드가 있다.
		System.out.println("마지막 best의 인덱스 : " + str.lastIndexOf("best"));

		// 9. 문자열의 앞뒤의 white space(공백 문자)를 제거하는 trim 메소다가 있다.
		String name = "  james ";
		System.out.println("name의 글자수 : " + name.length());
		System.out.println("name의 실제 글자수 : " + name.trim().length());

		// 10. String으로 변경하는 toString 메소드가 있다.
		Integer n = new Integer(10); // 객체 n
		System.out.println(n.toString()); // n.toString()의 결과타입은 String이다.
		System.out.println(n.toString().equals("10")); // true (객체 n은 String이 되었기 때문에 String의 메소드를 호출할 수 있다.)

		// 문제. 파일명을 파일명과 확장자로 분리해서 저장하시오.
		String fullName = "Study.java";
		String fileName = fullName.substring(0, fullName.lastIndexOf("."));
		String extName = fullName.substring(fullName.lastIndexOf(".") + 1);

		System.out.println("파일명 : " + fileName + ", 확장자 : " + extName);

	}

}
