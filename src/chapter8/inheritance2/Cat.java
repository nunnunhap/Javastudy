package chapter8.inheritance2;

public class Cat extends Animal {
	// 메서드
	
	@Override
	void run() {
		System.out.println("고양이가 달린다.");
	}
	
	@Override
	void cry() {
		System.out.println("고양이가 야옹한다");
	}
	
	void parentMethod() {
		super.cry();
	}
	
}
