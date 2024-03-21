package chapter5.classpart;

// 일반 개인정보를 저장하기 위한 데이터타입을 설계
// 개인정보 : 이름, 신장, 몸무게, 성별, 결혼유무
public class Person {
	// 변수 => 이제는 '필드'라고 부름. class 안에 만든 변수. class와 상관 없이 만든 것이 변수
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	// 메서드 : 필드가 만든 기억장소에 접근해서 데이터를 이용한 기능 목적
	// 이제 필드와 메서드를 활용하여 class를 만들어간다.
	public void getPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("무게 : " + weight);
		System.out.println("성별 : " + gender);
		System.out.println("결혼 : " + married);
	}
}
