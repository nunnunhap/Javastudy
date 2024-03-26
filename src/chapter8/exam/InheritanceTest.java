package chapter8.exam;

public class InheritanceTest {

	public static void main(String[] args) {
		// 상속을 받은 클래스가 객체생성이 된다면?
		// Child를 호출하러 갔다가 바로 Parent()를 호출하고 그 다음 Child 호출.
		// 상속받은 클래스가 객체생성구문이 실행되면 힙 영역에 new Parent(),
		// new Child() 순서로 진행. 힙 영역에 부모클래스의 기억장소가 생성되고 부모생성자 호출
		// 힙 영역에 자식클래스의 기억장소가 생성되고, 자식생성자 호출.
		Child child1 = new Child();
		Child child2 = new Child(10, 20);
		
		Parent parent = new Parent(); // Child 클래스와는 상관이 없음.
	}

}
