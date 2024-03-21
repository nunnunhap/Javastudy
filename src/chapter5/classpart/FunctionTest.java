package chapter5.classpart;

import java.util.Scanner;

// 메서드 정의하기.
// 메서드 : 기능을 구현하는 코드로 구성된 것.
public class FunctionTest {
	// main() 메서드 : java에서 프로그램을 실행하기 위한 목적으로 만들어 준 것.(JVM에서 main()를 찾겠끔 설계되어 있음)
	// void : 리턴타입, main() : 메서드, (String[] args) : 파라미터(매개변수)
	// 메서드의 기본 구조 : 리턴타입 메서드이름(매개변수 선언) { return 사용유무 };
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// sum, sub, mul, div
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int sum = add(n1, n2);
		System.out.println(sum);
		System.out.println(substract(n1, n2));
		
		int multi = multiply(n1, n2);
		System.out.println(multi);
		
		double div = divide(n1, n2);
		System.out.println(div);
	}
	
	// 정수형 숫자 2개를 매개변수로 제공받아 더한 값을 리턴하는 메서드
	// 메서드를 만드는데 public static을 쓸지말지 선택할 수 있음. 나중에 설명해주신다고 함.
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result; //result 변수의 타입을 메소드명 앞에 넣어준 것.
	}
	
	// 뺄셈
	public static int substract(int num1, int num2) {
		
		if(num1 > num2) {
			int result = num1 - num2;
			return result;
		}else {
			int result = num2 - num1;
			return result;
		}
	}
	
	// 곱셈
	public static int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	// 나눗셈
	public static double divide(int num1, int num2) {
		// 정수 + 정수 = 정수;
		// 정수 + 실수 = 실수;
		double result = (double)(num1 + num2) / 2;
		return result;
	}
}
