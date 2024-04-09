package chapter15.exception;

public class NullException2 {
	public static void main(String[] args) {
		String str = null; // 참조타입 기본값 null 사용
		
		System.out.println(str);
		// jdk 1.8에선 예외 발생 그 이후부턴 null로 출력.
		
		// 예외처리
		try {
			System.out.println(str.toString());
		} catch(NullPointerException ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}

}
