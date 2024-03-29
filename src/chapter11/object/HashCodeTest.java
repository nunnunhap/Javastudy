package chapter11.object;

// 문자열 비교
public class HashCodeTest {
	public static void main(String[] args) {
		
		// 기본 데이터타입 형식
//		String name = "홍길동";
		
		// String 클래스이므로 참조타입 사용.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// 비교연선자는 주소값 비교기능
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true
		
		// 숫자 데이터는 이것
		int a = 100;
		int b = 100;
		if(a == b) {
			System.out.println("a and b is ==");
		} else {
			System.out.println("a and b is !==");
		}
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		// 이건 스트링클래스라서 주소값 비교가 진행됨.
		if(name1 == name2) {
			System.out.println("name1 and name2 ==");
		} else {
			System.out.println("name1 and name2 !==");
		}
		
		// 재정의되어, 문자열 데이터 사용 시 equal 사용
		if(name1.equals(name2)) {
			System.out.println("name1 and name2 equal");
		} else {
			System.out.println("name1 and name2 not equal");
		}
	}

}
