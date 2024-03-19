package chapter2;

public class IntegerVariable {
	public static void main(String[] args) {
		// 정수형 데이터 타입 : byte(1), short(2), int(4), long(8)
		// 크기를 이용하여 기억장소를 생성한다.
		// 예로 byte는 1바이트로 기억장소를 생성한다.
		// byte는 8bit로 구성되어 있다.
		// bit는 0, 1 의 2진수 값을 저장하도록 설계되어 있다.
		
		byte b1 = -128;
		short sVal = 32767;
		
		System.out.println(b1 + sVal);
		
		//long 데이터를 저장할 경우에는 숫자 데이터 끝 부분에 알파벨 L(l)을 붙인다.
		long Val1 = 12345678900L;
		
	}

}
