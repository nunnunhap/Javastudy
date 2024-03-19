package chapter2;

public class Constant {
	public static void main(String[] args) {
		// 상수와 리터럴
		// 상수 선언 키워드 : final
		// 상수 이름은 대문자로 표기. 관례
		final int MAX_NUM = 100; // final 키워드 제외하면 변수라고 부름.
		
//		MAX_NUM = 200; 에러 발생
		
		final int MIN_NUM;
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
