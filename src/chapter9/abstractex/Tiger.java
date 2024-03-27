package chapter9.abstractex;

public class Tiger extends Animal {
	@Override
	void run() {
		System.out.println("Tiger is running");
	}
	@Override
	void cry() {
		System.out.println("Tiger : Kuaaaaa Keooooo");
	}
}
