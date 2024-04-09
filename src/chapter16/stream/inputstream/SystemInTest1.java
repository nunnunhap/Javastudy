package chapter16.stream.inputstream;

import java.io.IOException;

// 표준 입출력 스트림 : 키보드로 입력받고, 화면(모니터)에 출력하는 기능을 지원 목적
public class SystemInTest1 {
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 입력하고 [Enter]를 누르시오.");
		
		int i;
		
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}//키보드로부터 데이터를 입력받아서 자바로 데이터가 들어오게 함.
		
		
	}

}
