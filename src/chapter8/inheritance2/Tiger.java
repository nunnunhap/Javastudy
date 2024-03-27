package chapter8.inheritance2;

public class Tiger extends Animal {
	// 메서드
	
	@Override
	void run() {
		//super.run(); 부모클래스 내용을 호출
		System.out.println("호랑이가 어슬렁거린다.");
	}
	
	@Override // 컴파일 시 조금 빨라짐.
	void cry() {
		System.out.println("호랑이가 포효하다.");
	}
}




