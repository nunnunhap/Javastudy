package chapter10.interfaceex;

public class Tiger implements Animal {

	@Override
	public void run() {
		System.out.println("tiger run");
	}
	@Override
	public void cry() {
		System.out.println("kuakakak");	
	}

}
