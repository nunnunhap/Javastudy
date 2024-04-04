package chapter15.lambda;

// 방법1> 인터페이스를 이용한 구현클래스
// 지금까진 아래와 같은 형식으로 사용했으나 람다식을 사용하면 이렇게 쓸 필요 없음.
class Test implements MyNumber {
	@Override
	public int getMax(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
}

public class TestMyNumber {
	public static void main(String[] args) {
		// 방법1> 지금까지 인터페이스를 설계하고 상속받아 구현클래스를 만들고 사용했던 기본 방식.
		Test t1 = new Test();
		System.out.println(t1.getMax(10, 20));
		
		// 방법2> 람다식 구현
		// 함수형 인터페이스만 사용 가능.
		MyNumber max1 = (int num1, int num2) -> {return (num1 >= num2) ? num1 : num2;};
		MyNumber max2 = (num1, num2) -> (num1 >= num2) ? num1 : num2;
		System.out.println(max2.getMax(10, 20));
	}
}
