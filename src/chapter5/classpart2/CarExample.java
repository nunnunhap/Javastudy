package chapter5.classpart2;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car(); // 차 제품이 생성되었다!
		
		// 힙 영역에 생성된 기억장소를 가리킬 때 객체.필드
		// new Car(); 실행이 될 때, 힙 영역에 생성된 기억장소의 초기값을 확인
		System.out.println("myCar.speed 값은 : " + myCar.speed); // 0 // int형은 기본값이 0
		System.out.println("myCar.model 값은 : " + myCar.model); // null //클래스로 변수는 초기값 null;
		System.out.println("myCar.color 값은 : " + myCar.color); // null
		System.out.println("myCar.isAircon 값은 : " + myCar.isAircon); // false
		System.out.println("myCar.company 값은 : " + myCar.company); // null
		
		// 실제 개발에선 매개변수 있는 생성자를 거의 안 만듦.
		Car yourCar = new Car("현대자동차");
		System.out.println("yourCar.company 값은 : " + yourCar.company);
		
		Car childCar = new Car("기아자동차", "노랑");
		System.out.println("childCar.company 값은 : " + childCar.company);
		System.out.println("childCar.color 값은 : " + childCar.color);
	}

}
