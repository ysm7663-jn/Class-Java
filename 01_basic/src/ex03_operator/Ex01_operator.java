package ex03_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		
		/*
		 * 1. 산수 연산자
		 * 	1) +
		 * 	2) -
		 * 	3) *
		 * 	4) / : 정수(몫), 실수(나누기)
		 * 	5) % : 정수(나머지)
		 * 
		 * 2. 증감 연산자
		 * 	1) a++ : a를 사용하고 1 증가
		 * 	2) ++a : a를 1 증가시키고 사용
		 * 	3) a-- : a를 사용하고 1 감소
		 * 	4) --a : a를 1 감소시키고 사용
		 * 
		 * 3. 대입 연산자
		 * 	1) = : 오른쪽 값을 왼쪽 변수에 대입
		 * 	2) += : 왼쪽 변수가 오른쪽 값 만큼 증가
		 * 	3) -= : 왼쪽 변수가 오른쪽 값 만큼 감소
		 * 	4) *= 
		 *	5) /=
		 *	6) %= 
		 *
		 *	주의
		 *		부호 순서	
		 *
		 */

		int a = 7;
		int b = 2;
		
		// 라인 복사 = Ctrl + Alt + 방향키 아래
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println((double)a + " / " + b + " = " + ((double)a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		
		int c = 10;
		int d = c++;		// c를 d에 저장하고 c를 1 증가
		
		System.out.println(c);
		System.out.println(d);
		
		int e = 10;
		int f = ++e;		// e를 1 증가시키고 e를 f에 저장
		
		System.out.println(e);
		System.out.println(f);
		
		int piggy_bank = 0;
		piggy_bank += 1000;
		piggy_bank -= 500;
		System.out.println(piggy_bank);
		
		// 문제1. 45를 일의 자리와 십의 자리로 분리 출력
		
		int n = 45;
		int tens = n / 10; 		// 십의 자리
		int unit = n % 10;		// 일의 자리
		
		System.out.println("십의 자리는 " + tens +"이고, 일의 자리는 " + unit + "이다.");
		
		// 문제2. 1분 = 60초, 1시간 = 60분 = 3,600초
		// 초가 3690초를 1시간 1분 30초로 변환 출력
		
		int total_Second = 3690;
		int hour = total_Second / 3600;
		int minute = (total_Second % 3600) / 60;
		int second = total_Second % 60;
		
		System.out.println("hour = " + hour + ", minute = " + minute + ", second = " + second);
		
		
		// 문제3. 두 변수 x와 y에 저장된 값을 서로 교환 출력
		
		int x = 10;
		int y = 20;
		int temp;
		
		System.out.println("x = " + x + ", y = " + y);
		
		temp = x;		// x를 temp에 보관
		x = y;
		y = temp;
		
		// 라인 이동 단축키 = Alt + 방향키
		
		System.out.println("x = " + x + ", y = " + y);
	}

}
