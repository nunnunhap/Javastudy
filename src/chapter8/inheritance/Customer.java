package chapter8.inheritance;

// 상위클래스, 부모클래스의 역할(상속을 주는 클래스)
public class Customer {
	
	// 필드(접근자 default)
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio; // 보너스포인트 적립비율
	
	// 생성자
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	// 매개변수가 있는 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
		
		System.out.println("Customer(parameter) 생성자 호출");
	}
	
	// 일반 메서드
	public int calcPrice(int price) {
		System.out.println("Customer.calPrice");
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	// getter/ setter
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
