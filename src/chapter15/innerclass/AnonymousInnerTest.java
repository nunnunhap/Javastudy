package chapter15.innerclass;

// 익명 내부 클래스 : 1회성 특징으로 사용하는 클래스.
class Outer2 {
	// 익명구현 객체 : 클래스명 없이 객체를 생성하며 일회성으로만 사용가능. 
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
		}
	};
}

class AA {}



public class AnonymousInnerTest {
	public static void main(String[] args) {
	}

}