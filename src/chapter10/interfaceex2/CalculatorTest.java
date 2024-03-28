package chapter10.interfaceex2;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		// default method 호출
		calc.description();
		
		// static method 호출
		Calc.myStaticMethod();
		
		// constant 접근
//		System.out.println(Calc.PI); // 에러는 나지 않으나 static 영역의 변수에 접근하는 것이므로 클래스명을 찍어줘야 함.
		System.out.println(CompleteCalc.PI);
		
	}

}
