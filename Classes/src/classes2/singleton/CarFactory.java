package classes2.singleton;
/* 코딩패턴 싱글톤 패턴
 * 자돛차 공장에서 자동차를 생산
 * 자동차 공장은 유일한 1개의 인스턴스를 가짐
 * 
 * */

import classes2.car.Car;

public class CarFactory {
  //멤버 벼눗
	private static CarFactory instance;//자동차 공장
	
	//생성자
   private CarFactory() {}
   //인스턴스 반환 메서드
   private static CarFactory getInstance() {
	   if(instance == null)
		   instance = new CarFactory();
	   return instance;
   }
   //자동차 생성 메서드 정의
   public Car createCar( ) {
	   Car car = new Car();
	   return car;
   }
}
