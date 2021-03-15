package ex02_inheritance_quiz;

class Staff {

	String name; // 이름
	String depart; // 부서

	Staff(String name, String depart) {
		this.name = name;
		this.depart = depart;
	}

	int pay() {

		// Staff 클래스는 급여가 없기 때문에, pay() 메소드가 없어야 한다.
		// 하지만 모든 staff의 서브클래스는 pay() 메소드를 사용하므로, pay()메소드가 존재해야 한다.
		return 0; // 억지로 생성, Staff 클래스의 pay()는 절대 호출되어선 안 된다.
	}

}

class SalaryMan extends Staff {

	int salary; // 기본급

	SalaryMan(String name, String depart, int salary) {
		super(name, depart);
		this.salary = salary;
	}

	@Override
	int pay() {
		return salary;
	}

}

class SalesMan extends SalaryMan { // 판매직

	int salesVolume; // 판매량
	double incentive; // 인센티브 (판매량이 100 이상 : 20% , 아니면 5%)

	SalesMan(String name, String depart, int salary) {
		super(name, depart, salary);
	}

	void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		this.incentive = salesVolume >= 100 ? 0.2 : 0.05;
	}

	int salesPay() {
		return (int) (salesVolume * incentive);
	}

	@Override
	int pay() {
		// return salary + (int)(salesVolume * incentive);
		// 1. salary 는 pay() 메소드로 바꾼다			** 반드시 사용하길 권장
		// 2. (int)(salesVolume * incentive) 는 별도의 메소드를 만든다. --> 유지보수에 용이
		
		return super.pay() + salesPay();
	}

}

class Alba extends Staff {

	int times; // 일한 시간
	int payPerHour; // 시급

	Alba(String name, String depart, int payPerHour) {
		super(name, depart);
		this.times = 0;
		this.payPerHour = payPerHour;
	}

	void setTimes(int times) {
		this.times = times;
	}

	@Override
	int pay() {
		return payPerHour * times;
	}

}

public class Quiz05 {

	public static void main(String[] args) {

		SalaryMan s1 = new SalaryMan("짱구", "총무부", 300);
		System.out.println("s1의 급여 : " + s1.pay() + "만원"); // s1의 급여 : 300만원

		SalesMan s2 = new SalesMan("철수", "판매부", 100);
		s2.setSalesVolume(200); // 판매량 설정
		System.out.println("s2의 급여 : " + s2.pay() + "만원"); // s2의 급여 : 140만원

		Alba s3 = new Alba("맹구", "홍보부", 1);
		s3.setTimes(100);
		System.out.println("s3의 급여 : " + s3.pay() + "만원"); // s3의 급여 : 100만원

	}

}
