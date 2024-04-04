package chapter15.lambda;

// 함수형 인터페이스 : 추상메서드를 하나만 가지고 있는 인터페이스
@FunctionalInterface
public interface MyNumber {
	// 추상메서드
	int getMax(int num1, int num2);
}
