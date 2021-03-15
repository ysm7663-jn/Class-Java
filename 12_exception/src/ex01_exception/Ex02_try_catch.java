package ex01_exception;

import java.util.Scanner;

/*
 *  try {
 *  	�ڵ� �ۼ�
 *  } catch (����ó�� �Ű�����) {
 *  	����ó��
 *  }
 *  
 *  ���� Ŭ����
 *  1. ��� Exception�� ó���� �� �ִ� Ŭ����
 *  2. RuntimeException, IOException �� ���� Ŭ������ �ִ�.
 *  3. ��� ���ܴ� 'Exception Ŭ����'��  ����Ѵ�.
 */

public class Ex02_try_catch {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("ù ��° ���� >>> ");
			int a = sc.nextInt();

			System.out.print("�� ��° ���� >>> ");
			int b = sc.nextInt();

			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println(a + " - " + b + " = " + (a - b));
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.println(a + " / " + b + " = " + (a / b));

			sc.close();
			
		} catch (Exception e) {
			System.out.println("������ �߻��Ͽ����ϴ�. �ٽ� �õ��ϼ���.");
		}
	}

}
