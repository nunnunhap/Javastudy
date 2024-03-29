package chapter11.object;

// 객체복사 : 힙 영역에 생성된 메모리가 또 하나의 메모리로 복사 : Object클래스의 clone()메서드 사용
// 객체(인스턴스) : 힙 영역에 생성된 메모리 그 자체
// 객체복사를 하기위한 클래스는 Cloneable인터페이스를 상속받아야 함.
public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		// clone() 메모리복사 메서드
		Circle copyCircle = (Circle) circle.clone();
		
		// toString()메서드가 값을 확인한느 용도로 재정의가 되어 있어서 circle객체 원본메모리 내용과
		// copyCircle객체 사본메모리 내용을 확인
		System.out.println(circle); //circle.toString()
		System.out.println(copyCircle); //copyCircle.toStirng()
	}

}

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", " + "y = " +y; 
	}
	
}

// Circle 클래스를 객체 생성 후 객체 복사로 사용함.
class Circle implements Cloneable { //Circle이 구현클래스. 근데 Cloneable은 추상메서드가 하나도 없는 인터페이스.
	Point point; //point클래스가 circle 안에서 필드수준으로 사용됨.
	// 고양이 동물과 같은 속하는 형태면 상속형태로 하고 아니면 이렇게 필드수준으로 가져다 씀.
	// 여기는 여러 점이 모여서 원이 되는거니까, 재료에 해당하는 것이니 필드수준으로 가져다 씀.
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// point == point.toString()
		return "원점은 " + point + "이고, " + "반지름은" + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
}