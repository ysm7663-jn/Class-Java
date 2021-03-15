package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		// 나이가 20살 이상이면 "성인", 아니면 미성년자 출력

		int age = 19;

		String result = "성인";

		switch (age / 10) {
		
		case 0:
		case 1:
			result = "미성년자";
			break;

		}

		System.out.println(result);

	}

}
