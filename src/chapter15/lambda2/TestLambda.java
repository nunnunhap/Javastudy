package chapter15.lambda2;

// 원본 자바파일에는 인터페이스, 클래스 함께 코드가 작성되어 있지만,
// 컴파일되면 인터페이스 내용은  PrintString.class 파일로 생성됨.
// TestLambda 클래스는 TestLambda.class 파일로 생성됨.

// PrintString.class
interface PrintString {
	// 추상메서드
	public abstract void showString(String str);
}


public class TestLambda {
	public static void main(String[] args) {

		// 1) 인터페이스명 변수 = 추상메서드를 구현한 람다식 문법
		// 매개변수가 하나일 경우 괄호 생략 가능. 변수명이 꼭 메서드의 매개변수명과 일치할 필요 없음.
		PrintString lambdaStr = str -> System.out.println(str);
		// showString() 호출 시 위의 람다식 실행
		lambdaStr.showString("hello lambda 1");
		
		// 2)
		showMyString(lambdaStr);
		
		// 3)
		PrintString reStr = returnString(); //str -> System.out.println(str + "world");
		reStr.showString("hello ");
	}
	
	// 2) 함수형 인터페이스를 메서드의 매개변수로 사용하기
	public static void showMyString(PrintString p) {
		p.showString("hello lambda 2"); // str -> System.out.println(str);
	}
	
	// 3) 함수형 인터페이스를 메서드의 리턴타입으로 사용하기.
	public static PrintString returnString() {
		// 리턴타입이 함수형 인터페이스이므로 리턴에 람다식 문법 적기.
		// void showString(String str); 메서드에 대한 람다식 문법
		return str -> System.out.println(str + "world");
	}
}
