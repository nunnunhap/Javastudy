package chapter9.abstractex;

public abstract class Animal {

	// field
	String eyeColor;
	String speed;
	
	// abstract method, body가 없는 메서드
	abstract void run();
	
	abstract void cry();
	
	void runrun() {
		System.out.println("런런 발동");
	};
	
	
}
