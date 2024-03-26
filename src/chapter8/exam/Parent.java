package chapter8.exam;

public class Parent {
	
	// 필드
	int a;
	int b;
	
	// 생성자
	public Parent() {
		System.out.println("부모클래스 생성자 호출 : Parent()");
	}
	
	// 매개변수가 있는 생성자
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 메서드
	public void methodA() {
		System.out.println("이것은 부모클래스 메서드A");
	}
	
	public void methodB() {
		System.out.println("이것은 부모클래스 메서드B");
	}
	
}
