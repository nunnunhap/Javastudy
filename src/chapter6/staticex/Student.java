package chapter6.staticex;

	// JVM이 운영체제로부터 메모리 할당을 위임받아서, 자바프로그램을 실행할 때 사용되는 메모리의 영역을 학습하는 예제
	// static area(method area) : 정적영역
public class Student {
	// 필드 선언
	// 문법> 접근자 [static 선택] 데이터타입 변수;
	
	// 자바프로그램이 실행될 때, JVM이 클래스의 내용을 보고, static 키워드를 사용하는 필드, 메서드에 대하여 static area 메모리를 생성한다.
	// 정적, static 필드/ class 변수
	private static int serialNum;
	
	// 인스턴스 필드, new했을 시에만 stack, heap 영역의 메모리 사용.
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	private int count;
	
	// getter 메서드 : studentName 필드로 생성된 기억장소의 값을 읽어오기 위한 목적의 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// setter는 다 void임.
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// instance method
	public int getCount() {
		return count;
	}
	
	public void setCound(int count) {
		this.count = count;
	}
	
	// static method
	public static int getSerialNum() {
		serialNum++; // class 영역 안에선 Student를 생략할 수 있음.
		return Student.serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum; // static 필드는 class명.static으로 메모리에 접근.
	}
	
}
