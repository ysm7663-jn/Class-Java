package ex01_basic;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] arr = str.split(":");
		
		System.out.printf("%s:%s", arr[0], arr[1]);
		
		
	}
}

