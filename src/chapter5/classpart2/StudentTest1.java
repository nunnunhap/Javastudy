package chapter5.classpart2;

public class StudentTest1 {
	public static void main(String[] args) {
		
		// 객체 생성 : new 예약어
		// new : heap영역의 공간에 메모리(기억장소)를 생성하는 연산자
		// 자바에서는 메모리 영역 안에 공간을 파티션쳐서 만들어둠. Stack, Heap, Method(Static) 세 Area.
		// 운영체제로부터 JVM이 메모리 할당을 위임받아 메모리를 여러개의 영역으로 나누어 관리함.
		// 메모리 구조 : https://lucas-owner.tistory.com/38
		Student stu1 = new Student();
		stu1.studentName = "손흥민";
		
		Student stu2 = new Student();
		stu2.studentName = "이강인";
		
		System.out.println(stu1); // chapter5.classpart2.Student@75a1cd57 //패키지명.클래스명@주소
		System.out.println(stu2); // chapter5.classpart2.Student@515f550a //주소값 = 해시코드(hash code)값.

		
		
	}

}
