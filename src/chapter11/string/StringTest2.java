package chapter11.string;

// 문자열 데이터끼리 결합하면 새로운 기억장소로  분리되어 관리됨.
public class StringTest2 {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		
//		javaStr = javaStr + androidStr;
//		System.out.println(javaStr);
//		System.out.println("연결된 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		// 힙영역의 java와 android가 합쳐져 새로운 주소값을 가진 메모리가 생성됨.
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		System.out.println(javaStr.toUpperCase());
		
	}

}
