package chapter9.abstractex;

public class Lion extends Animal {
	@Override
	void run() {
		System.out.println("Lion is running");
	}
	@Override
	void cry() {
		System.out.println("Lion: Kuaaaa!!!");
	}
}
