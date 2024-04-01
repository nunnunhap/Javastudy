package chapter14.generics2;

// 제네릭 기능이 있는 클래스 // 아무거나 상관없지만 보통 데이터타입의 T를 많이 씀.
// <T> : 타입파라미터 : 타입파라미터에는 참조타입만 가능함.
// 클래스를 사용하는 쪽(객체를 생성할 때)에서 쓸 때 전달해줄 수 있음.
// 타입 파라미터에 사용할 수 있는 자료형을 제한.
public class GenericPrinter<T extends Material> {
	private T material;
	
	// getter, setter 메서드 작업
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
}
