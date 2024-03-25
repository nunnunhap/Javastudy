package chapter6.singleton;

// 싱글톤패턴 디자인으로 설계
public class Person {
	// 싱글톤 패턴에선 보통 instance를 사용함.
	private static Person instance = new Person();
	
	// 생성자
	private Person() {}
	
	// getter
	public static Person getInstance() {
		if(instance == null) {
			instance = new Person();
		}
		
		return instance;
	}
}
