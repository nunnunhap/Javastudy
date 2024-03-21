package chapter5.constructor;
//생성자 예제 Constructor : 생성자
public class Person {
	
	// 필드
	String name;
	float height;
	float weight;
	
	// 생성자
	// 컴파일 과정에서 Person.class 파일에 생성자가 자동생성됨.
	// 생성자 메서드 이름을 만들 땐 클래스명을 사용해야 한다는 규칙이 있음.
	// 생성자를 수동으로 정의하면 컴파일과정에서 Person.class 파일에 기본 생성자가 자동생성이 안됨.

	public Person() {
		// 코드작성
	}
	
	public Person(String name, float height) {
		// 기억장소에 원하는 이름을 먼저 주고 시작하고 싶을 때 생성자를 활용.
		// 매개변수가 있는 생성자를 정의하면, 컴파일 과정에서 기본 생성자가 자동생성이 안됨.
		// 힙영역에 생성된 기억장소에 값을 주고자 할 때 사용.
		this.name = name;
		this.height = height;
	}
}
