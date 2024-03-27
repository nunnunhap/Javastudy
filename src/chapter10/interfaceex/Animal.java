package chapter10.interfaceex;

//인터페이스
//추상메서드 목적으로 존재하는 것. 객체생성 불가능
//상속을 목적으로 함.
public interface Animal {
	
	//필드 사용 불가
	
	//일반 메서드 사용불가
	
	public abstract void run(); // 상속을 목적으로 하다 보니 원래 public이 들어있으나 생략함.
	void cry(); // interface는 어차피 추상메서드를 목적으로 하여, abstract도 생략 가능함.
	
	

}
