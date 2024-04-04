package chapter15.innerclass;

// 지역내부 클래스
class Outer {
	// 전역변수
	int outNum = 100;
	static int sNum = 200;
	
	// 메서드 내부에 클래스를 정의
	Runnable getRunnable(int i) {
		// 지역변수
		int num = 100;
		
		// 지역 내부 클래스, 스레드
		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum =" + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 스태틱 변수)");
			}			
		}
		return new MyRunnable();
	}
	
	void methodA() {
		// 지역내부 클래스
		class A {}
		
		// 객체 생성
		A a = new A();
	}
}


public class LocalInnerTest {
	public static void main(String[] args) {

	}

}
