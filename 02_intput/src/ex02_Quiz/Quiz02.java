package ex02_Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("a >> ");
		double a = s.nextDouble();
		
		System.out.print("b >> ");
		double b = s.nextDouble();
		
		double temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a + ", b = " + b);
		
		s.close();
	}

}
