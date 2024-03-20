package chapter3.operator;

public class OperationEx1 {
	public static void main(String[] args) {
		//산술 연산자 + - * / %
		
		int mathScore = 90;
		int engScore = 75;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore); // 165
		
		int avgScore = totalScore / 2; // 82.5가 아닌 82
		System.out.println(avgScore);
		// 다 int형이다보니 값도 정수형으로 떨어지는 것임.
		
		double avgScore2 = totalScore / 2.0;
		System.out.println(avgScore2);
		// double형으로 연산하고자 한다면 하나라도 꼭 double형으로 만들어줘야 함.
	}

}
