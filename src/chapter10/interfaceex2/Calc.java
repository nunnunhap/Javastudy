package chapter10.interfaceex2;

// 최상위 부모 인터페이스 -> 객체생성 불가능/ 상속목적으로만 설계
public interface Calc {
	// 구성요소
	// 상수, 추상메서드, default메서드, static메서드, - jdk1.8
	// private메서드 jdk1.9
	
	// 상수 final // compile시 public final static이 자동으로 붙음.
	public final static double PI = 3.14; // 상수는 어떤 특정값을 부르기 위한 이름.
	int ERROR = -9999999;
	
	// 추상메서드 // compile 시 public abstract이 자동으로 붙음.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 일반메서드 사용불가
//	public void methodA() {}
	
	//default, static 메서드 추가(jdk1.8)
	default void description() { //일반메서드인데 default만 붙여준 것임.
		System.out.println("default method");
	}
	
	static void myStaticMethod() {
		System.out.println("static method");
	}
	
	//private메서드 지원(jdk1.9)
	//private 메서드는 접근 불가
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	
}
