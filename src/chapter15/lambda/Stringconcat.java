package chapter15.lambda;

// 인터페이스는 객체생성 불가능. 상속을 목적을 한 설계도
@FunctionalInterface
public interface Stringconcat {
	
	void makeString(String s1, String s2);
	
	
	
	
}
