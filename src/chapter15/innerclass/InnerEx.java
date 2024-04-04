package chapter15.innerclass;

// 내부 클래스 : 클래스 안에 클래스를 정의

class A {
	int a = 100;
	void methodA() {
		System.out.println(a);
	}
	class B {
		int x = 100;
		void methodA() {
			System.out.println(x);
			// A클래스의 멤버 직접접근 가능
			System.out.println(a);
			methodA();
		}
	}
}



public class InnerEx {
	public static void main(String[] args) {
		
	}

}
