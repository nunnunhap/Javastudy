package chapter10.interfaceinheritance;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// 할아버지 인터페이스와 나(손자) 자신의 클래스 객체
		X xClass = mClass; // 형변환.
		xClass.x(); // 구현된 메서드 호출
		
		mClass.x(); // 이거 안 써야 하는 이유 다형성에서 배웠잖아. xClass에 들어갈 것을 다양하게 바꿔낄 수 있는데 mClass는 그럴 수 없음.
		// 인터페이스 성격 자체가 다형성을 기반으로 나옴.
		// public void moveAnimal(Animal animal) {}로 메서드를 구성하면 매개변수에 자식클래스인 Eagle, Lion 등이 들어갈 수 있는 것.	

		// 부모인터페이스와 나(아들) 자신의 클래스 객체
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
		
		
	}

}
