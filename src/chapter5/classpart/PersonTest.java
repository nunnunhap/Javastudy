package chapter5.classpart;

public class PersonTest {
	public static void main(String[] args) {
		// Person 클래스 사용
		// 클래스명 객체 = new 클래스();
		// 저 클래스는 ()가 있어서 메소드임. 대신 메소드는 꼭 앞의 클래스명과 동일해야 함.
		// Person클래스를 사용하면 기억장소가 생성되었다는 뜻. 기억장소가 생성되면 여기에 데이터를 넣을 수 있음.
		// 클래스로 만든 변수를 '객체'라고 함.
		Person ps1 = new Person();

		// ps1객체가 가리키는 기억장소표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = false;
	
		ps1.getPersonInfo();

		
	}
}
