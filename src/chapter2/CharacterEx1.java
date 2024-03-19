package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		// 문자형 데이터 타입 : char(2)
		// char 데이터타입으로 만든 기억장소에는 같은 작은 따옴표로 표현
		// 문자 1개만 코딩해야 한다.
		// 문자로 저장되지만 내부적으론 숫자의 의미를 가지고 있음.
		// 문자로 해석하여 사용된다.
		// 아스키, 유니코드 사용. 0~65535범위만 가능.
		
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력
		System.out.println((int)ch1); // 문자에 해당하는 숫자값 출력
		
		char ch2 = 66; // 숫자로 저장
		System.out.println(ch2);
		
		int ch3 = 45000;
		System.out.println((char)ch3);
	}

}
