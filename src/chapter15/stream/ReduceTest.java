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
			// 람다식 문법
			System.out.println("s1 : " + s1);
			System.out.println("s2 : " + s2);
			
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
	}
}
