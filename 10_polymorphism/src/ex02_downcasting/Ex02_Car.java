package ex02_downcasting;

class Car {

	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void drive() {
		System.out.println(model + " 타고 드라이브 한다.");
	}

}

class EV extends Car {

	private int battery;

	public EV(String model, int battery) {
		super(model);
		this.battery = battery;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void charge(int battery) {
		this.battery += battery;
		System.out.println(getModel() + "의 베터리 : " + this.battery); // 모델명 확인 : getModel();
	}

}

class Hybrid extends EV {

	private int oil;
	private final int FULL_OIL = 60; // 가득찬 연료통

	public Hybrid(String model, int batter, int oil) {
		super(model, batter);
		this.oil = oil;
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public void addOil(int oil) {
		this.oil += oil;
		if (this.oil >= FULL_OIL)
			this.oil = FULL_OIL;
		System.out.println(getModel() + "의 주유 : " + this.oil);
	}
}

public class Ex02_Car {

	public static void main(String[] args) {

		Car[] motors = new Car[2];

		motors[0] = new EV("코나", 80);
		motors[1] = new Hybrid("그랜져", 40, 60);

		// 가장 아래 후손부터 확인한다.

		for (Car motorsList : motors) {
			motorsList.drive();
			if (motorsList instanceof Hybrid) {
				((Hybrid) motorsList).charge(70);
				((Hybrid) motorsList).addOil(50);
			} else
				((EV) motorsList).charge(70);
		}

	}

}
