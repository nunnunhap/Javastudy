package chapter3.operator;

public class OperationEx4 {
	public static void main(String[] args) {
		// 조건 연산자(삼항연산자) : if문과 유사
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch; // 숫자로 사용 시 0 ~ 65535의 범위를 가짐.
		
		// true면 앞의 글자, false면 f가 출력됨.
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
	}

}
