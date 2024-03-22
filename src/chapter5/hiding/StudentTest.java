package chapter5.hiding;

public class StudentTest {
	public static void main(String[] args) {
		// 객체 생성 작업
		// s1객체에서는 new Student() 힙 영역의 생성된 기억장소의 주소가 대입된다.
		Student s1 = new Student();
		
		s1.setScore(110);
		
		System.out.println(s1.getScore());
		
	}

}
