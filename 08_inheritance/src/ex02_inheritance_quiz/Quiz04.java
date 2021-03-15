package ex02_inheritance_quiz;

class Song {

	String title;
	String general;
	double playTime;

	Song(String title, String general, double playTime) {
		this.title = title;
		this.general = general;
		this.playTime = playTime;
	}

	void info() {
		System.out.println("제목 : " + title + ", 장르 : " + general + ", 시간 : " + playTime);
	}

}

class Singer extends Song {

	String name;

	Singer(String name, String title, String general, double playTime) {
		super(title, general, playTime);
		this.name = name;
	}

	@Override
	void info() {
		System.out.print("가수이름 : " + name + ", ");
		super.info();
	}

}

public class Quiz04 {

	public static void main(String[] args) {

		Singer singer1 = new Singer("아델", "hello", "balad", 4.5);
		Singer singer2 = new Singer("BTS", "Dynamite", "dance", 3.5);
		Singer singer3 = new Singer("싹쓰리", "다시 여기 바닷가", "dance", 4.0);

		singer1.info();
		singer2.info();
		singer3.info();

	}

}
