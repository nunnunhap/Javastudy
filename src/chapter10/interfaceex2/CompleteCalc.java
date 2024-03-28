package chapter10.interfaceex2;

// 구현 클래스 -> 객체생성 가능
public class CompleteCalc extends CalCulator {
	
	// Calc 인터페이스를 구현하는 CalCulator abstract class에서 미구현한 두 가지 메서드를 구현.

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	// default method 재정의
	@Override
	public void description() {
		System.out.println("재정의한 default method");
	}
	
}
