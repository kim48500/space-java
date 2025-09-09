package classes2.car;
//static이 있는 변수는 그 값을 생성된 인스턴스가 공유함 (유

public class CarTest {

	public static void main(String[] args) {
//car 생성자 호춯
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		System.out.println("차량번호"+car1.getCarnumber());
		System.out.println("차량번호"+car2.getCarnumber());
		System.out.println("차량번호"+car3.getCarnumber());
		//인스턴스 출력-클래스 이름은 패키지이름 클래스 이름
		System.out.println(car1);//classes2.car.Car@3941a79c

		
	}

}
