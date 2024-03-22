package chapter5.classpart2;

// 객체 : 자동차
/* 
 * 속성 : 성격, 성질, 특성 => 속도, 모델, 색상 : 변수
 * 기능 및 동작 => 운전하다, 정지하다 : 메서드
 */
public class Car {
	String company;
	int speed;
	String model;
	String color;
	boolean isAircon;
	
	// void는 리턴값이 없음.
	void drive() {
		
	}
	
	void stop() {
		
	}
	
	Car() {}
	
	// 매개변수가 같은 타입을 두 개 이상 만들 수 없다는 규칙 있음.
	Car(String company) {
		this.company = company;
	}
	
	Car(String company, String color) {
		this.company = company;
		this.color = color;
	}
	
	Car(boolean isAircon) {
		this.isAircon = isAircon;
	}
	
	// 생성자메서드 정의, 일반메서드 정의 문법과 다름. 리턴타입이 없음!!!
//	Car(int speed) {}
}
