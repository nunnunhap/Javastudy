package chapter10.multiinerfaceex;

public interface Sell {
	
	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}
