package chapter6.cooperation;
	// 학생이 통학운송수단으로 사용한 버스
public class Bus {
	// 실제 개발에선 private으로 씀.
	
	public int busNumber; // 버스 번호
	public int passengerCount; // 승객 수
	public int money; // 버스 수입액
	
	// 매개변수가 있는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 버스에 승객을 태우는 기능
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 버스의 수입액과 승객인원수 확인
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번 승객은" + passengerCount + "명이고, 수입은 "
				+ money + "입니다.");
	}
}
