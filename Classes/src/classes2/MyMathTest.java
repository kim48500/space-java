package classes2;

public class MyMathTest {
//static이있는 메서드는 메모리의 데이터 영역사용
	public static void main(String[] args) {
// 메서드 사용 
		/* MyMath math = new MyMath();
		 
		 System.out.println(Math.abs(-6)); //6*/
		//메서드 사용 -클래스로 직접 접근
		int val1= Math.abs(-6);
		System.out.println(val1);
		int val2= Math.min(10,20);
		System.out.println(val2);

		
	}

}
