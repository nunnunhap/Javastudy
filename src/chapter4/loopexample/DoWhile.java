package chapter4.loopexample;

public class DoWhile {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		// 코드가 최소 1번 실행된다.
		do {
			sum += i;
			i++;
		}while (i<=100);
		
		System.out.println("1~" + (i-1) + "까지의 합은? " + sum);
	}

}
