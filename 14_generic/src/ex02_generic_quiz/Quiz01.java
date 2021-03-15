package ex02_generic_quiz;

class Bunker<M> {

	private M[] bunker;
	private int count; // 최대 배열 길이
	private int idx; // 배열의 인덱스 (bunker에 입장한 실제 마린 수)

	// int [] a = new int [3];

	@SuppressWarnings("unchecked")
	public Bunker(int count) {
		super();
		// bunker = new M[count];
		// 배열의 크기 결정은 컴파일 타임에 진행되어야하는데, generic 타입의 셜정은 실행 타임에 결정되므로
		// 컴파일 타임에 generic 타입의 메모리 크기를 알 수 없다.
		// 해결책 : Object를 사용한다(어쩔 수 없이)
		bunker = (M[]) (new Object[count]); // Object를 사용하여 메모리 크기를 우선 정해 놓은 다음에 후에 M[]로 캐스팅 작업하여 진행
		this.count = count;
		idx = 0; // 생략 가능
	}

	public void add(M item) {
		if(idx == count)	// full
			return ;
		bunker[idx++] = item;
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append("현재 " + idx + "명 입장");

		return sb.toString();
	}

}

class Barret {}

class Marine extends Barret {}
class Firebet extends Barret {}

class Tank {

}

public class Quiz01 {

	public static void main(String[] args) {

		// 스타크래프트
		Bunker<Barret> bunker = new Bunker<>(10);
		
		bunker.add(new Marine());
		bunker.add(new Marine());
		bunker.add(new Marine());
		bunker.add(new Firebet());
		// bunker.add(new Tank()); // 막아야 할 작업
		
		// 객체가 sout 사용시는 toString을 하겠다는 뜻
		System.out.println(bunker); // 현재 4명 입장

	}

}
