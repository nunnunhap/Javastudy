package chapter8.inheritance2;

public class Lion extends Animal {

	@Override
	void run() {
		System.out.println("사자가 어슬렁");
	}

	@Override
	void cry() {
		System.out.println("사자가 으르렁");
	}
	
	void play() {
		System.out.println("사자가 운동을 한다");
	}

}
