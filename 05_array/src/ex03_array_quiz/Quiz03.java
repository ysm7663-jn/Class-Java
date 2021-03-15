package ex03_array_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 문제. 친구 3명을 저장할 수 있는 배열 생성
		// 초기화를 통해 배열에 입력 
		//새로 사귄 친구의 수를 입력 받아서
		// 기존 친구들이 저장된 배열에 길이를 늘린다,
		
		Scanner sc = new Scanner(System.in);
		
		String [] friendList = {"짱구", "철수", "맹구"};

		System.out.println("친구 수를 입력하세여 >> ");
		int n = sc.nextInt();
		
		String [] newFriendList = new String[friendList.length + n];
		
		System.arraycopy(friendList, 0, newFriendList, 0, friendList.length);
		
		friendList = newFriendList;
		
		for(int i = 0; i < friendList.length; i++)
			System.out.println(friendList[i]);
		
		sc.close();

	}

}
