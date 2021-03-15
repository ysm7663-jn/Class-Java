package ex04_quiz;

class Score {

	private int kor;
	private int eng;
	private int math;

	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public boolean equals(Object obj) {
		// this : score1
		// obj : score2
		if (this == obj) // score1.equals(score1)
			return true;

		if (obj instanceof Score) {
			Score score = (Score) obj;

			if (kor == score.kor && eng == score.eng && math == score.math)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("국어 : ").append(kor).append(", 영어 : ").append(eng).append(", 수학 : ").append(math);

		return sb.toString();
	}

}

public class Quiz04 {

	public static void main(String[] args) {

		Score score1 = new Score(80, 90, 100);
		Score score2 = new Score(80, 90, 100);

		// toSting() 사용
		System.out.println(score1); // 국어 : 80, 영어 : 90, 수학 : 100
		System.out.println(score2);

		if (score1.equals(score2))
			System.out.println("같은 점수이다."); // 출력 : 같은 점수이다.
		else
			System.out.println("같은 점수이다.");
	}

}
