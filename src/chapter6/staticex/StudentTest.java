package chapter6.staticex;

public class StudentTest {
	public static void main(String[] args) {
		// JVM이 main()메서드를 호출하면서 프로그램이 실행될 때 
		// Student클래스의 static필드와 메서드를 이용하여 static area에 단 한번만 메모리를 생성
		
		Student stu1 = new Student();
		stu1.setStudentName("손흥민");
//		안됨 stu1.getSerialNum(); // 호출이 가능하긴 한데 이건 잘못 만들어진 것.
		Student.getSerialNum();// static 메서드는 클래스명.메서드명() 으로 호출해야 함. 객체.메서드명()은 사용하지 말 것.
		System.out.println(Student.getSerialNum());
		
		Student stu2 = new Student();
		stu2.setStudentName("김민재");
		Student.getSerialNum();
		System.out.println(Student.getSerialNum());
	}

}
