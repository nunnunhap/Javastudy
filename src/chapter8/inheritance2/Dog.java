package chapter8.inheritance2;

public class Dog extends Animal{
	// 메서드
	
	@Override
	void run() {
		System.out.println("개가 달린다");
	}
	
	@Override
	void cry() {
		System.out.println("개가 짖다");
	}
}
