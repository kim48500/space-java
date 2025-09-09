package classes2.car;

public class Car {
private static int serialNum =1000;
private int carNumber;
 public Car( ) {
	 serialNum++;
	 carNumber = serialNum;
 }
 //차량번호 반환 (가져오기)
 public int getCarnumber() {
	 return carNumber;
	 
 }
}
