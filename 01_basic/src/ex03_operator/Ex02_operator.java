package ex03_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		
		/*
		 * 4. 관계 연산자
		 * 	1) > : 초과, 크다
		 * 	2) >= :이상, 크거나 같다
		 * 	3) < : 미만, 작다
		 * 	4) <= : 이하, 작거나 같다
		 * 	5) != : 같지 않다 
		 * 	6) == : 같다 (primitive type)
		 * 	7) equals : 같다 (reference type)
		 * 
		 * 결과 : true / false
		 * 
		 * 5. 논리 연산자
		 * 	1) && : 모든 조건식의 결과가 true이면 true, 아니면 false  (and)
		 * 	2) || : 조건식의 결과가 하나라도 true이면 true, 아니면 false (or)
		 * 	3) !  : 조건식의 결과를 반대로 변경 (not)
		 * 	4) short circuit evaluation 을 지원
		 * 		(1) && : 조건식의 결과가 false가 나타나면 더 이상 진행하지 않는다. 어차피 결과가 false이기 때문
		 * 		(2) || : 조건식의 결과가 true가 나타나면 더 이상 진행하지 않는다. 어차피 결과가 true이기 때문
		 * 
		 * 6. 조건 연산자
		 * 	1) 조건식의 결과가 true일 때와 false일 때 모두 한 번에 처리하는 연산자
		 * 	2) 조건식 ? true일 때 실행문 : false일 때 실행문
		 * 	3) 3개의 항이 필요 (삼항 연산자)
		 * 	4) 조건문인 if - else문의 대용으로 사용됨
		 *  
		 */
		
		int a = 10;
		int b = 11;
		
		System.out.println(a > b);		// false
		System.out.println(a >= b);		// false
		System.out.println(a < b);		// true
		System.out.println(a <= b);		// true
		System.out.println(a == b);		// false
		System.out.println(a != b);		// true
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1 == str2);		// false (두 Hello가 저장된 위치를 비교)
		System.out.println(str1.equals(str2));		// true (두 Hello의 내용을 비교)

		int c = 10;
		int d = 11;
		
		boolean r1 = ((c > d) && (c == 10));		// false
		boolean r2 = ((c > d) || (c == 10));		// true
		boolean r3 = !r1;		// true
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		String str3 = "Hello";
		String str4 = "Hello";
		
		boolean r4 = !str3.equals(str4);		// str3 과 str4의 내용이 다른가?  false
		
		System.out.println(r4);
		
		// Short Circuit Evaluation
		int x = 10;
		int y = 10;
		
		boolean r5 = x > 10 && y++ > 10;		
		System.out.println(r5);					// false
		System.out.println(y);					// 10, x에서 거짓이 나오기 때문에 뒤는 처리하지 않음
		
		// 조건 연산자
		int score = 85;		// 80점 이상 "합격", 아닐 경우 "불학격"
		
		String pass = score >= 80 ? "합격" : "불합격";
		System.out.println(pass);
		
		// 문제1. 국어점수와 영어점수가 모두 80점 이상이고 평균이 85점 이상이면 true, 아니면 false
		
		int kor = 80, eng = 90;
		int avg = (kor + eng) / 2;
		
		boolean result = (kor >= 80 && eng >= 80) && avg >= 85;
		System.out.println(result);
		
		
		// 문제2.나이가 20살 이상이면 요금 5000원, 20살 미만이면 요금 2500원 출력
		
		int age = 25;
		int fee = age >= 20 ? 5000 : 2500;
		System.out.println(fee);
		
		
		// 문제3. 아이디가 "admin"이면 "관리자" 출력, 아니면 "일반유저" 출력
		
		String id = "admin";
		System.out.println(id.equals("admin") ? "관리자" : "일반유저");
		
		
		// 문제4. 두 자리 정수(10 ~ 99)중 하나를 선언하고, 그 수가 '카프리카수'인지 판단해서 맞는지 아닌지 출력
		// 45, 55, 99
		// 45 -> 45 * 45 -> 2025 -> 20 25 -> 20 + 25 = 45
		
		int n = 99;
		int front = (n * n) / 100;
		int back = (n * n) % 100;
		
		System.out.println(n == (front + back) ? "맞다" : "아니다");
				
	}

}
