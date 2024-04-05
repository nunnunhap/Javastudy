package chapter15.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		// 1) 인터페이스를 구현한 클래스 객체 생성(기본)
		StringConCatImp1 concat1 = new StringConCatImp1();
		concat1.makeString(s1, s2);
		
		
		// 2) 함수형 인터페이스이므로 람다식 문법 사용
		Stringconcat concat2 = (String e1, String e2) -> {System.out.println(e1 + ", " + e2); };
		Stringconcat concat3 = (e1, e2) -> System.out.println(e1 + ", " + e2);
		concat2.makeString(s1, s2);
		concat3.makeString(s1, s2);
		
		// 3) 익명 구현객체 사용 : 클래스 이름 없이 문법을 만들어 쓴다고 해서 '익명구현객체'라고 함.(일회성)
		Stringconcat concat4 = new Stringconcat() {
			// 다른 파일에서 아래 내용을 참조할 수 없음.
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concat4.makeString(s1, s2);
		
		
	}

}
