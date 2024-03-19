package chapter2;

public class DoubleEx2 {
	public static void main(String[] args) {
		// 실수 데이터타입이 부동소수점 방식으로 표현하여, 오차를 일으키는 예제
		
		double dnum = 1; // 1d 형식으로 인식되는 것임.
		
		//0.1을 10000번 누적되면 합은? 예상 1000
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		
		System.out.println(dnum);
		//실제값은 1001.000000000159
	}
}
