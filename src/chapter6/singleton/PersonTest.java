package chapter6.singleton;

public class PersonTest {
	public static void main(String[] args) {
		Person person = Person.getInstance(); // 생성자를 못 쓰기 때문에 싱글톤패턴에선 new를 사용할 수 없음.
		
	}

}
