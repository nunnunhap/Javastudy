package chapter15.exception;

class Person {
	
}


public class NullException {
	public static void main(String[] args) {
		// 스택영역에 ps가 있고 null이 있다. 아직 주소 참조가 안됨.
		Person ps = null;
		// 주소가 없는 상태에서 . 을 해서 명령을 하면 무조건 에러가 남.
		// .은 참조 연산자
		System.out.println(ps.toString());
	}

}
