package chapter15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2 {
	public static void main(String[] args) throws FileNotFoundException {
		// 파일 입출력 기능 제공 class
		FileInputStream fis = null;
		
		// 실행 시 a.txt 파일이 존재하지 않아 예외가 발생.
		// 예외를 처리하지 않고 main()메서드에게 예외전가를 함.
		// main()를 관리하는 JVM에게 넘긴단 뜻임.
		fis = new FileInputStream("a.txt");

		System.out.println("프로그램 종료");
		
		
		
		
	}
}
