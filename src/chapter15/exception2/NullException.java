package chapter15.exception2;

class Person {
	
}


public class NullException {
	public static void main(String[] args) {
		// 스택영역에 ps가 있고 null이 있다. 아직 주소 참조가 안됨.
		Person ps = null;
		// 주소가 없는 상태에서 . 을 해서 명령을 하면 무조건 에러가 남.
		// .은 참조 연산자
		try {
			System.out.println(ps.toString());
		
		} catch(NullPointerException ex) { // Exception : 예외 관련 클래스 중 최상위 클래스
			System.out.println(ex);
			System.out.println("예외발생");
		}
		System.out.println("프로그램 종료");
	}
}

