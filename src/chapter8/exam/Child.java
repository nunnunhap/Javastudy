package chapter8.exam;

public class Child extends Parent {
	//상속
	
	// 필드
	private int c;
	private int d;
	
	// 생성자
	public Child() {
		//부모 클래스의 매개변수가 없는 기본 생성자를 호출하는 것.
		super(); // 이게 생략되어 있는 것임. 컴파일때 알아서 .class파일에 들어가게 됨.
		System.out.println("자식클래스의 생성자 호출 : Child()");
	}
	
	// 매개변수가 있는 생성자
	public Child(int a, int b) {
		super(a, b); // 부모 클래스의 생성자 호출
		
	}
	
	// 메서드 생성
	void methodC() {
		System.out.println("이건 자식클래스의 C메서드");
	}
	void methodD() {
		System.out.println("이건 자식클래스의 D메서드");
	}

	// 메서드 재정의: 오버라이딩
	@Override // Annotation
	public void methodA() {
		super.methodA();
	}

	@Override
	public void methodB() {
		super.methodB();
	}


}
