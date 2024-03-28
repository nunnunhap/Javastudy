package chapter10.interfaceex;

// Dog는 구현클래스
public class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("dog run");
	}
	@Override
	public void cry() {
		System.out.println("bARK");	
	}
	
}
