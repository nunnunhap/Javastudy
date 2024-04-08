package chapter15.stream;

import java.util.Arrays;

// Stream클래스의 reduce() 메서드 사용하기
// 개발자가 기능을 직접 구현작업

// 배열을 스트림클래스 사용하기 : Arrays.stream(배열)
public class ReduceTest {
	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~", "hello", "Good Morning", "반갑습니다."};
													// reduce()는 비교목적
		System.out.println(Arrays.stream(greetings).reduce("공백", (s1, s2) -> {
			// s1 매개변수에 "공백" 대입되고 s2에 "안녕하게요~~" 대입.
			// s1의 바이트 길이와 s2의 바이트 길이를 if문에서 대소비교하여 큰 길이의 문자열을 s1에 저장하고
			// s2에는 비교하지 않은 2번째 문자열(hello)를 대입한다.
			// 그리고 다시 바이트 길이 대소비교를 반복함.
			
			
			// 람다식 문법
			System.out.println("s1 : " + s1);
			System.out.println("s2 : " + s2);
			
			System.out.println("s1 : " + s1.getBytes().length);
			System.out.println("s2 : " + s2.getBytes().length);
			
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
	}
}
