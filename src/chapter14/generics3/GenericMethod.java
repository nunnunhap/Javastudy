package chapter14.generics3;

public class GenericMethod {
	// 제네릭 메서드 문법형식
	// <T, V> : 메서드 타입 파라미터
	// 이 메서드를 사용하려면 T와 V를 제공해주어야 함.
	// 제네릭메서드 호출 : GenericMethod.<Integer, Double>makeRectangle(null, null);
	// <T, V> double makeRectangle(Point<Integer, Double> p1, Point<Integer, Double> p2)
	// 앞의 <T, V>는 타입을 받아오는 역할만 함. double은 리턴타입.
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getY()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getX()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		// 제네릭 메서드 호출
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
//		GenericMethod.<Long, Double>makeRectangle(null, null); // 요론식으로 makeRectangle 메서드를 두 개 만든거임.
		
		System.out.println("두 점으로 만들어진 사각형의 넓이 : " + rect );
		
	}

}
