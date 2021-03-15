package ex02_api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex03_BigNumber {

	public static void main(String[] args) {

		// int 티입의 최대 값
		System.out.println("Integer 최대값 : " + Integer.MAX_VALUE);

		// long 타입의 최대 값
		System.out.println("Long 최대값 : " + Long.MAX_VALUE);

		// long 보다 큰 숫자는 BigInteger 클래스를 활용한다.
		BigInteger a = new BigInteger("12345678901234567890"); // 문자열 타입의 숫자
		BigInteger b = new BigInteger("98765432109876543210"); // 문자열 타입의 숫자

		// 사칙연산
		System.out.println(a.add(b)); // a + b
		System.out.println(a.subtract(b)); // a - b
		System.out.println(a.multiply(b)); // a * b
		System.out.println(a.divide(b)); // a / b
		System.out.println(a.remainder(b)); // a % b

		// BigInteger 필드값
		System.out.println(BigInteger.ZERO); // 0
		System.out.println(BigInteger.ONE); // 1
		System.out.println(BigInteger.TEN); // 10

		// 실수
		// 정확한 소수 자릿수를 위해서 BigDecimal 클래스를 사용한다.

		double c = 1.1234567890123456789;
		BigDecimal d = new BigDecimal("1.1234567890123456789");

		System.out.println(c);
		System.out.println(d);

	}

}
