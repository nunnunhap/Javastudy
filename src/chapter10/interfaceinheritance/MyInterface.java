package chapter10.interfaceinheritance;

// 인터페이스끼리 상속 // 같은 인터페이스끼리는(동일한 것들끼리) extends 사용
public interface MyInterface extends X, Y {
	// x(), y() 2개와 자기자신의 추상메서드 void myMethod(); 1개까지 포함해서
	// 총 3개의 추상메서드를 가지고 있는 의미.
	// 협업중에 X, Y를 각각 다른 사람이 만들면 이렇게 될 수도 있고, 인터페이스라고 해도 용도별로 최소한의 분리를 하는 게 좋음.
	void myMethod();
}
