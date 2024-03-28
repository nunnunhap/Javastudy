package chapter10.multiinerfaceex;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// 부모 인터페이스 변수
		// 자식객체가 부모 인터페이스에 대입
		Buy buyer = customer;
		buyer.buy(); // 자식, 부모에 똑같은 메서드가 있으면 재정의된 자식메서드를 호출함.
		buyer.order(); // 재정의된 메서드 호출
		
		// 부모 인터페이스2 변수
		Sell seller = customer;
		seller.sell();
//		seller.order();
		
		if(seller instanceof Customer) {
			// 다운캐스팅 : 자식클래스 변수 = (자식클래스)부모클래스 객체
			Customer customer2 = (Customer)seller;
			
			customer2.buy(); // 구현된 메서드 호출
			customer2.sell(); // 인터페이스는 어차피 바디가 없어서 호출이 안됨.
//			customer2.order(); 인터페이스 안의 default method가 자식클래스에서 재정의되지 않은 경우 인터페이스 내의 default메서드 호출가능.
		}
		
		
	}

}
