package chapter8.casting;

// 형변환 예제(Casting)
// 참조타입 : 클래스가 상속관계에 따라 형변환
public class ShapeTest {
	public static void main(String[] args) {
		
		// 부모 클래스 변수 = 자식객체;
		// 업 캐스팅 : 자식객체로 부모클래스로 형변환
		// 먼저 스택에 shape1가 만들어지고 heap에 shape class와 circle class가 만들어짐.
		// draw()가 부모, 자식클래스에 같이 존재 시, 부모 클래스 변수는
		// 자식 클래스의 draw()를 호출하도록 설계되어 있다.
		// 그리고 부모클래스 변수는 자신의 구성요소만 호출할 수 있음.
		Shape shape1 = new Circle();
		// 위와 아래는 동일 : Shape shape1 = (Shape) new Circle();
		//(Shape)를 생략해서 썼다고 하여 묵시적 형변환.
		shape1.draw(); // draw Circle
		
		if(shape1 instanceof Circle) {
			// 다운캐스팅, 명시적 형변환
			// 자식클래스 변수 = (자식클래스) 부모객체;
			Circle c1 = (Circle) shape1;
			c1.method1();
			//shape1.method1()은 호출이 안됨.
			//꼭 자식객체로 형변환하여 호출이 되도록 설계
		}
		//Triangle c1 = (Triangle)shape1;해도
		//오류가 안나는데 나중에 문제가 생김. 그러니 실수하지 않도록
		//instanceof(객체타입확인)를 써서 확실히 하는 것임.
	}
}

