package chapter6.reference2;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("TV", 500000);
		Product p2 = p1; // p1에 있는 경로를 p2가 그대로 복사해서 본인의 스택메모리에 경로를 저장함.
		// 힙 영역의 기억장소를 공유함.
		
		p2.price = 10;
	
		System.out.println(p1.price);
		
		
	}

}
