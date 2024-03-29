package chapter11.string;

// 문자열 데이터 관리
public class StringTest1 {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);//주소비교로 false 결과
		System.out.println(str1.equals(str2)); // 문자열 비교로 true 결과
		
		// 이 표현법은 힙 영역에 "abc"라는 문자열데이터가 한 번이라도 사용이 되어 있으면, 재사용함.
		// 동일한 문자열이면 "재사용"됨. 일반적인 작업은 이 방식 사용함.
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // 주소비교로 true
		System.out.println(str3.equals(str4)); // true
		
		
		
	}

}
