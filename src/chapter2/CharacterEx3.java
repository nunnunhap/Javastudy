package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {
		// char 데이터타입은 unicode 문자. 즉 0~65535범위를 벗어난 값을
		// 사용 시 문제가 됨.
		
		int a = 65;
		int b = -65;
		
		char a2 = 65; // char은 숫자로 저장되어도 문자로 사용됨.
		// char a3 = -65; 에러 발생
		
		// a변수의 값을 char로 변환하라.
		System.out.println((char)a);
		// b 변수의 값이 -65라는 음수이므로 변환에 해당하는 문자가 없음.
		System.out.println((char)b);
		System.out.println(a2);
		
	}

}
