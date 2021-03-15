package ex01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_LinkedList {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		for (int i = 1; i <= 10000; i++) {
			list1.add(i);
			list2.add(i);
		}

		// ArrayList의 순회 시간
		long start1 = System.nanoTime();

		for (int i = 0, size = list1.size(); i < size; i++)
			list1.get(i);

		long end1 = System.nanoTime();

		System.out.println("ArrayList 총 순회 시간 : " + (end1 - start1) + "나노초");

		// LinkedList
		long start2 = System.nanoTime();

		for (int i = 0, size = list2.size(); i < size; i++)
			list2.get(i);

		long end2 = System.nanoTime();

		System.out.println("LinkedList 총 순회 시간 : " + (end2 - start2) + "나노초");

	}

}
