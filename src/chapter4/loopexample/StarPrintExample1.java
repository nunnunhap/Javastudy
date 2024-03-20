package chapter4.loopexample;

public class StarPrintExample1 {
	public static void main(String[] args) {
		// 2차원 배열 형태 별찍기
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}