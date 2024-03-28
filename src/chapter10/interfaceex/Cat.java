package chapter10.interfaceex;

public class Cat implements Animal {
	
	// 부모 인터페이스의 추상메서드를 구현함. 구현메서드. 재정의메서드라고 부를 수 있음.
	@Override
	public void run() {
		System.out.println("cat run");
	}
	@Override
	public void cry() {
		System.out.println("meaooo");	
	}
	
}