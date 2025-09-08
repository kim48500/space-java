package classes;

public class StudentTest {

	public static void main(String[] args) {
		//클랴수 인스턴스 셍성자
		Student st1 = new Student();
		Student st2 = new Student(1002,"김성진",3);
		//값 입력
		st1.studentId=1001;
		st1.name= "김기용";
		st1.grade=3;
		//출력
	st1.displayInfo();
	st2.displayInfo();
		
		
	}

}
