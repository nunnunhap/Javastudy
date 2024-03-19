package chapter2;

public class TypeInference {
	public static void main(String[] args) {
		// java10부터 지원하는 문법
		// 자료형 추론
		// 그냥 이런게 있구나만 하기
		
		var i = 10; // int i = 10 컴파일됨
		var j = 10.0; // double j = 10.0 컴파일됨
		var str = "hello"; // String str = "hello" 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
	}

}
