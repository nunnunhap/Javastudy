package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 입출력 스트림을 바이트 단위로 작업하는 예제.
// input.txt 파일의 내용을 읽어오는 작업.
public class FileInputStreamTest1 {
	public static void main(String[] args) {
		
		// 읽기(입력), 바이트단위, 파일
		FileInputStream fis = null;
		
		// 예외처리
		try {
			// input.txt 파일이 존재하지 않으면 예외발생이 되기 때문에 문법적으로 예외작업 규칙 존재
			fis = new FileInputStream("C:\\Dev\\Lecture\\JavaWork\\study\\bin\\chapter16\\stream\\inputstream\\input.txt");
			System.out.println((char)fis.read()); // a
			System.out.println((char)fis.read()); // b
			System.out.println((char)fis.read()); // c
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		
	}

}
