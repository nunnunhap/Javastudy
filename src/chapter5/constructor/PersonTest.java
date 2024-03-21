package chapter5.constructor;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person("홍길동", 183.0f); //실수 기본값은 double이니까 이건 float이라서 undefined라고 뜨는 것.
		
		// 힙 영역에 생성된 Person클래스의 필드값을 확인
		// new가 Person의 초기값을 만들어 준 것.
		System.out.println(p1.name); //null
		System.out.println(p1.height); //0.0f
		System.out.println(p1.weight); //0.0f
		
	}

}
