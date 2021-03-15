package ex02_object_array;

class Gun {

	String model;
	int bullet;

	Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}

	void shoot() {
		if (bullet > 0) {
			bullet--;
			System.out.println(model + "빵야!(" + bullet + "발 남음)");
		} else
			System.out.println(model + "총알이 없습니다.");
	}

	void info() {
		System.out.println(model + "(" + bullet + "발)");
	}

}

class Soldier {

	String name;
	Gun[] gunList;
	int idx;		// gunList의 인덱스(실제로는 저장된 Gun의 개수)

	Soldier(String name, int gunCount) {
		this.name = name;
		this.gunList = new Gun[gunCount];
	}

	void addGun(Gun gun) {
		gunList[idx++] = gun;
	}
	
	void shoot() {
		// shoot을 호출하는 시점에 Gun은 몇 개가 있는가?
		// 그럼에도 불구하고 답은 있다 : idx개
		for(int i = 0; i < idx; i++) {		// gunList.length를 사용시 무조건 3까지 간다
			gunList[i].shoot();
		}
	}
	
	void shoot(int bullet) {
		gunList[bullet - 1].shoot();
	}
	
	void shoot(String model) {
		for(int i = 0; i < idx; i++) {
			if(gunList[i].model.equals(model)) 
				gunList[i].shoot();
			// for(Gun gun : gunList) {
				//if(model.equals(gun.model)){
				// 	gun.shoot();
		}
	}
	
	void info() {
		System.out.println("이름 : " + name);
		for(int i = 0; i < idx; i++) {
			gunList[i].info();
		}
	}

}

public class Ex03_Soldier {

	public static void main(String[] args) {

		Soldier soldier = new Soldier("람보", 3); // gun을 3개 가지고 있는 람보

		soldier.addGun(new Gun("콜트", 10));
		soldier.addGun(new Gun("베레타", 10));
		soldier.addGun(new Gun("스미스웨슨", 10));

		// 총 쏘는 방법이 3가지
		soldier.shoot(); // 모든 총을 한 발씩 쏨
		soldier.shoot(1); // 1번째 총만 한 발 쏜다. shoot(2), shoot(3)
		soldier.shoot("베레타"); // 베레타만 한 발 쏜다.

		soldier.info();
		// 이름 : 람보
		// 콜트(8발)
		// 베레타(8발)
		// 스미스웨슨(9발)

	}

}
