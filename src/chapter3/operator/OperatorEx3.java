package chapter3.operator;

public class OperatorEx3 {
	public static void main(String[] args) {
		// 관계연산자 : > < == >= <= !=
		// 논리연산자 : && || !
		
		// 코드가 실행되려면 언제나 main() 메서드 안에 실행되도록 해야 함.
		
		// && '논리 and 연산자' : 2개의 입력조건이 true일 때만 결과가 true가 됨.
		// || '논리 or 연산자' : 하나라도 true 일 때 true가 됨.
		int num1 = 10;
		int i = 2;
		
		// 논리곱의 경우, a && b 중 a가 false가 나오면 그 뒤는 읽을 필요가 없어서 읽지도 않고 false를 출력함.
		boolean value = (num1 = num1 + 10) < 10 && (i = i + 2) < 10;
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //4가 아닌 2. 논리 and 연산자의 특징 때문임.
		
		System.out.println("================================================");
		
		// 논리합의 경우, a&& b 중 a가 true가 나오면 그 뒤는 읽을 필요가 없어서 읽지도 않고 true를 출력함.
		boolean value1 = (num1 = num1 + 10) > 10 || (i = i + 2) < 10;
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
