package chapter4.loopexample;

public class BreakExample {
	public static void main(String[] args) {
		
		// break문. 중지
		
		int i = 0;
		
		for(; i<=10; i++) {
			System.out.print(i);
			// 아래 구문이 true가 되어 break문이 실행이 되면 for문이 종료된다.
			if(i == 5) {
				break;
			}
		}
		System.out.println();
		System.out.println("=================================");
		
		// 아래 구문이 true가 되면, continue가 동작하여 for문의 i++로 제어가 넘어간다.
		i = 0;
		for(; i<=10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i);
		}
	}

}
