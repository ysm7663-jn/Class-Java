package ex01_exception;

import java.util.Scanner;

/*
 * ���� ����ó�� ����� ����
 * 
 * 1. �������� ������ ���� ó���� �ٸ���.
 * 	�����ڰ� �̹� �������� �����ϰ� �־�� �Ѵ�.
 * 
 * 2. ���� ���� �������� ���å�� ���� ����.
 */


public class Ex01_legacy_exception {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� >>> ");
		int a = sc.nextInt();

		System.out.print("�� ��° ���� >>> ");
		int b = sc.nextInt();

		if (b == 0)
			System.out.println("0���� ���� �� �����ϴ�.");
		else {

			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println(a + " - " + b + " = " + (a - b));
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.println(a + " / " + b + " = " + (a / b));
		}
		
		sc.close();

	}

}
