package ex02_api;

import java.util.Arrays;

public class Ex01_System {

	public static void main(String[] args) {

		// 1. 시스템 현재 시간 밀리초 단위로 반환
		// 1970년 1월 1일 이후로 측정된 시간, 1초 지날때마다 1000씩 증가

		System.out.println("현재 시간 : " + System.currentTimeMillis() + "밀리초(1/1000초)");

		// 2. 시스템 현재 시간 나노초 단위로 반환
		// 자바가 결정한 어느 시점 이후로 측정
		// 용도 : 시간 측정

		System.out.println("현재 시간 : " + System.nanoTime() + "나노초(1/10억)");

		// 3. 배열 복사
		int[] src = { 1, 2, 3, 4, 5 };
		int[] dest = new int[10];

		for (int i = 0; i < src.length; i++) {
			dest[i + 2] = src[i];
		}

		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i] + " ");
		}

		// src[0]를 dest[2]으로 복사 시작, 복사하는 요소는 src.length만큼이다.
		System.arraycopy(src, 0, dest, 2, src.length);
		System.out.println();
		System.out.println(Arrays.toString(dest));

		// 4. 시스템 종료
		// System.exit(0);

		// 문제. i++를 20 억번 실행하는데 걸리는 시간을 초단위로 출력

		long startTime = System.nanoTime();

		for (int i = 0; i < 2000000000; i++);

		long endTime = System.nanoTime();

		System.out.println("총 소요 시간 : " + (endTime - startTime) / 1000000000.0 + "초");
	}

}
