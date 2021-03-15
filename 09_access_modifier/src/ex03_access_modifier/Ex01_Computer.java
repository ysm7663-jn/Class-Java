package ex03_access_modifier;

class Computer {

	// field
	// field는 항상 private
	private String model;
	private String manufacurer;
	private int price;

	// method
	// setters 작업을 통해 field의 변수들을 사용할것
	// setter를 사용하는 이유 : 잘못된 데이터 입력을 차단할 능력이 생긴다.
	// ex) price = -180과 같이 음수의 값이 입력이 될 경우 setter를 통해 차단이 가능해진다.
	// 하지만 그렇지 않은 경우 차단이 불가능
	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacurer(String manufacurer) {
		this.manufacurer = manufacurer;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// getters
	public String getModel() {
		return model;
	}

	public String getManufacurer() {
		return manufacurer;
	}

	public int getPrice() {
		return price;
	}

}

public class Ex01_Computer {

	public static void main(String[] args) {

		Computer myCom = new Computer();

		// myCom.model = "Gram"; // 안 되는 이유 : Computer 클래스 외부에서는 private에 접근이 안 된다.
		// myCom.price = -180 // 잘못된 데이터 입력
		// 위 작업은 Field 수정 작업이므로 setter를 통해서 해결한다.

		myCom.setModel("GRAM");
		myCom.setManufacurer("LG");
		myCom.setPrice(180);

		// Field를 읽는 것도 안 된다.
		// 읽기 위해서는 getter를 통해서 읽어와야한다.
		System.out.println(myCom.getModel());
		System.out.println(myCom.getManufacurer());
		System.out.println(myCom.getPrice());
	}

}
