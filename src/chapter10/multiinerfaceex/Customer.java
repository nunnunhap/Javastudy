package chapter10.multiinerfaceex;

// 클래스는 단일 상속만 허용
public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

//	부모인터페이스 2개 이상일 경우 동일한 default 메서드를 가지고 있는 경우
//	구현 클래스는 1개로 재정의해야함.
	@Override
	public void order() {
		System.out.println("고객판매주문");
//		Buy.super.order(); 지금 이 예제에서는 Buy, Sell에서 디폴트메서드의 이름이 동일하여 어떠한 클래스의 멤버인지 명시해야 함.
	}

}
