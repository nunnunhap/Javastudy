package chapter15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {
	public static void main(String[] args) {
		// 파일 입출력 기능 제공 class
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("1번째 예외");
			e.printStackTrace();
		} finally {
			// 선택사항
			if(fis != null) { //fis객체가 주소값을 가지고 있다면,
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("2번째 예외");
					e.printStackTrace();
				}
			}
			System.out.println("예외발생과 상관없이 항상 실행됩니다.");
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
	}
}
