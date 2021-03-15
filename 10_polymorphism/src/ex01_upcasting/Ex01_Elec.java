package ex01_upcasting;

// upcasting의 장점
// 관리가 용이하다.
// Staff[] s = new Staff[50];
// s[0] = new SalaryMan();
// s[1] = new Alba();
// 위와 같이 배열 하나 선언으로 여러개의 내용들 전체를 관리할 수 있다.

// superclass
class Elec {

	private int watt;

	public Elec(int watt) {
		this.watt = watt;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}

	public void info() {
		System.out.println("소비전력 : " + watt + "w");
	}
}

// subclass	
class TV extends Elec {

	private int size;

	public TV(int watt, int size) {
		super(watt);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void info() {
		System.out.println("크기 : " + size + "인치");
		super.info(); // Elec의 info 메소드
	}
	
}

public class Ex01_Elec {

	public static void main(String[] args) {

		//TV myTv = new TV(200, 100);
		//myTv.info();
		
		// upcasting
		// 1. 서브클래스 객체는 슈퍼클래스 타입으로 저장이 가능하다.
		// 2. 강제 변환이 아니라 자동으로 변환된다.
		
		Elec elec = new TV(200, 65);
		elec.info();	// 호출할 때 Elec의 info()를 호출하는 것으로 보이지만, 실제로는 new TV로 생성된 객체이기 때문에 TV의 info가 호출된다.
		
	}

}
