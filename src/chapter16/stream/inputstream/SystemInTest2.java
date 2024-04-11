package chapter16.stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [enter]를 누르세요.");
		
		int i;
		
		try {
			// 컴퓨터의 enter를 아스키코드로 변환하면 10진수 13임. 문자로 표현하면 \n과 같은 것임.
			while((i = System.in.read()) != '\n') {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
