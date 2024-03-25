package chapter6.singleton;

// 디자인 패턴 중 싱글톤 패턴으로 구성하는 클래스
public class Company {
	// 클래스 안에서 자기자신을 private static 멤버로 객체 생성
	private static Company instance = new Company(); // new가 들어가긴 하지만 static area 사용.
	
	// 생성자
	private Company() {} // 이 클래스는 객체생성이 한 번 밖에 안됨. 애시당초 생성자가 private임.
	
	// public getter 메서드 정의 : instance가 private이니까
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}