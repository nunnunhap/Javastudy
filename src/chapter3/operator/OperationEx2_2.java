package chapter3.operator;

public class OperationEx2_2 {
	public static void main(String[] args) {
		// 증감연산자 ++, --
		// 변수 앞 또는 변수 뒤에 사용되느냐에 따라 동작(해석)이 달라진다.
		// 변수에 +1을 한 후에 좌측에 대입
		int gameScore = 150;
		int lastScore1 = ++gameScore;
		
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
	}

}
