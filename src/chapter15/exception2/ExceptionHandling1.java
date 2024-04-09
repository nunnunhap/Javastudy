package chapter15.exception2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		// 파일 입출력 기능 제공 class
		FileInputStream fis = null;
		
		try {
			// 문법 자체가 예외처리를 하도록 설계되어 있음.
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
	}
}
