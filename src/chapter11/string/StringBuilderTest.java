package chapter11.string;

// 자바에서의 문자열 데이터를 관리하는 클래스
// 1. String 클래스 2. StringBuilder클래스 3. StringBuffer클래스(사용 잘 안함)
//String 클래스와 StringBuilder클래스의 데이터 관리의 다른 점.
public class StringBuilderTest {

	public static void main(String[] args) {

		// for문이 돌 때마다 힙 영역에 생성된 문자열 "시작"에서 새로운 "i번째 문자열"이란 문자열이 결합된 새로운 메모리가 생성됨.
		// 그럼 여기선 새로운 메모리가 10개나 완성된 것임.
		String str1 = "시작";
		
		for(int i=1; i<10; i++) {
			str1 += i + " 번째 문자열\n";
			System.out.println(System.identityHashCode(str1));
		}
		System.out.println(str1);
		
		
		// for문이 돌 때마다 힙 영역에 생성된 문자열 "시작"에 새로운 "i번째 문자열"이란 문자열이 추가되는 형식임.
		// 그럼 여기선 새로운 메모리는 1번만 완성됨. 성능이 훨 좋지.
		StringBuilder sb  = new StringBuilder("시작");
		
		for(int i=1; i<10; i++) {
			sb.append(i + " 번째 문자열\n");
			System.out.println(System.identityHashCode(sb));
		}
		
		System.out.println(sb);
	}

}
