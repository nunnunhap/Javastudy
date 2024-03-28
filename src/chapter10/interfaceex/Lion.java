package chapter10.interfaceex;

public class Lion implements Animal {

	@Override
	public void run() {
		System.out.println("lion run");
	}

	@Override
	public void cry() {
		System.out.println("kuoooooooool");
	}

}
