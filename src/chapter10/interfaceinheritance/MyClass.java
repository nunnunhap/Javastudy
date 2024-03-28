package chapter10.interfaceinheritance;

// 구현클래스 : 추상메서드를 구현. 즉, 완성시킨 메서드를 가지고 있는 클래스
public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

}
