package ex01_oop;

class Gun {
	
	// this는 필드와 같은 이름을 가진 매개변수가 있을 때 구분하기위해 사용, 매개변수가 없을 경우 필드의 변수가 유일하기 때문에 this 사용하지 않아도 됨 
	
	// field
	String model;
	int bullet;			// 0 ~ FULL_BULLET
	final int FULL_BULLET = 6;
	
	// constructor
	
	Gun (String model, int bullet) {
		this.model = model;
		this.bullet = bullet > FULL_BULLET ? FULL_BULLET : bullet;
	}
	
	// method
	void reload(int bullet) {		// 장전
		
		if(this.bullet + bullet <= FULL_BULLET) {
			this.bullet += bullet;
			System.out.println(bullet + "발이 장전되었다. 현재" + this.bullet + "발");
		}
		
		else {
			this.bullet = FULL_BULLET;
			System.out.println((FULL_BULLET - this.bullet) + "발이 장전되었다. 현재" + this.bullet + "발");
		}
		
	}
	
	void shoot () {					// 발사 -1씩
		if(bullet > 0) {
			bullet--;
			System.out.println("빵야! " + bullet + "발 남았다.");
		}
		
		else
			System.out.println("헛빵!");
	}
	
	void info() {
		System.out.println(model + "(" + bullet + ")");
	}
}

class Soldier {
	
	// field
	String name;
	Gun pistol;
	
	// constructor
	
	Soldier(String name, Gun gun) {
		this.name = name;
		this.pistol = gun;
	}
	
	// method
	void reload (int bullet) {
		pistol.reload(bullet);
	}
	
	void shoot () {
		pistol.shoot();
	}
	
	void info() {
		System.out.print(name + " : ");
		pistol.info();
	}
}


public class Ex06_Soldier {

	public static void main(String[] args) {
		
		Gun gun = new Gun("K-2", 2);
		Soldier soldier = new Soldier("짱구", gun);
		
		soldier.shoot();   // 빵야!, 1발 남았다.
		soldier.shoot();   // 빵야!, 0발 남았다.
		soldier.shoot();   // 헛빵!
		
		soldier.reload(1); // 1발이 장전되었다. 현재 5발
		soldier.reload(3); // 3발이 장전되었다. 현재 4발
		soldier.reload(6); // 0발이 장전되었다. 현재 6발
		
		soldier.shoot();   // 빵야!, 5발 남았다
		
		soldier.info();
		

	}

}
