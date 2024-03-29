package chapter11.object;

// HashCode
// 해시코드가 힙 영역의 생성된 주소를 참조하는 값
public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// 객체의 해시코드값 확인하기
		// 해시코드값을 이용하여 힙 영역의 주소를 참조
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
