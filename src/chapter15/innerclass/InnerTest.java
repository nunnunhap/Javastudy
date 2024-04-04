package chapter15.innerclass;

// 외부 클래스
class OutClass {
	// 인스턴스 필드
	private int num = 10; // 인스턴스 멤버
	// 스태틱 필드
	private static int sNum = 20; // 스태틱 멤버
	
	// 내부 클래스를 필드선언해서 사용가능
	private InClass inClass;
	
	// 생성자
	public OutClass() {
		inClass = new InClass(); // 내부 클래스 객체 생성
	}
	
	// 인스턴스 내부 클래스 : 외부 클래스 멤버들에 static 여부와 상관없이 접근 가능.
	class InClass {
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부클래스 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
		}
	}
	
	// 메서드
	public void usingClass() {
		inClass.inTest();
	}
	
	// 스태틱 내부 클래스2
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// num += 10; 스태틱이 붙은 클래스면 똑같은 내부 클래스라고 해도 외부 클래스의 인스턴스 변수는 사용불가.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticCalss sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}
		
		static void sTest() {
			// 외부 클래스의 인스턴스 멤버는 사용 불가능
			// num += 10;
			// 내부 클래스의 인스턴스 멤버는 사용 불가능
			// inNum += 10;
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		// 인스턴스 내부 클래스 객체생성하는 다양한 방법.
		
		// 방법1> 외부 클래스 객체생성하면서 OutClass() 생성자가 호출되어 그 안에서 객체가 생성됨.
		OutClass outClass = new OutClass(); // OutClass()생성자가 호출되어 그 안에서 내부클래스 객체가 생성
		System.out.println("외부 클래스 이용하여 내부클래스 기능 호출");
		outClass.usingClass();
		System.out.println();
		
		// 방법2> 외부 클래스를 이용하여 내부 클래스 객체생성
		// 외부 클래스 작성 후 . 을 찍으면 내부 클래스가 나옴.
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 활용하여 내부 클래스 생성");
		inClass.inTest();
		
		// 스태틱 내부클래스 사용 방법
		// 외부 클래스 생성하지 않고 바로 정적내부 클래스 생성하여 사용할 수 있음.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		// 스태틱 접근할 때 : 클래스명.스태틱멤버 접근
		System.out.println("정적 내부 클래스의 스태틱 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}