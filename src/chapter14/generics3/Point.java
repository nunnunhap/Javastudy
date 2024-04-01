package chapter14.generics3;

// 멀티타입파라미터
public class Point<T, V> {
	// 필드
	T x;
	V y;
	
	// 생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	// 제네릭 메서드
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	
	// 제네릭클래스 객체생성
	// Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
	// Point<Integer, Double> p2 = new Point<>(10, 10.0); 뒤의 타입파라미터는 생략 가능.
	
	
	
	
}
