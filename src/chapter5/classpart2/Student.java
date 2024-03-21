package chapter5.classpart2;

// Student 클래스에 main() 메서드 사용하기.
public class Student {
	// 학생정보 // 필드
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 메서드
	public String getStudentName() {
		return studentName;
		
	}
	
	
	
	
	// main()는 Student 클래스의 멤버가 아니다!!! 특수한 메서드로 독립적으로 작동되며 보통은 그냥 따로 빼서 사용함.
	public static void main(String[] args) {
		Student stu1 = new Student();
		
		stu1.studentName = "홍길동";
		
		System.out.println(stu1.studentName); // 필드 사용 // 실무에선 이렇게 접근하지 않음.
		System.out.println(stu1.getStudentName()); // 메서드 사용 // 접근자 때문에 이 방식 사용.
	}

}
