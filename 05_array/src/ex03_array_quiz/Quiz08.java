package ex03_array_quiz;

public class Quiz08 {

	public static void main(String[] args) {

		// 문제. 0 ~ 9사이 난수를 100개 생성
		// 각 숫자들의 생성 횟수(빈도수)를 그래프화 하여 출력

		int[] num = new int[100];
		int[] cnt = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10);
			cnt[num[i]]++;
		}

		for (int i = 0; i < cnt.length; i++) {
			String graph = "";
			for(int j = 0; j < cnt[i]; j++) {
				graph += "#";
			}

			System.out.println(i + " : " + graph + " " + cnt[i]);
		}

	}

}
