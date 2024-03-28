package chapter10.interfaceex2;

// 추상 클래스 -> 객체생성 불가능/ 상속목적으로만 설계
public abstract class CalCulator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	// 구현되지 않은 abstract method 2개를 상속받은 상태
	// 그래서 CompleteCalc에서 그 나머지 2개를 구현.

}
