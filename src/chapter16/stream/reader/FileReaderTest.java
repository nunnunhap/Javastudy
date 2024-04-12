package chapter16.stream.reader;

import java.io.FileReader;
import java.io.Reader;

// 문자 기반의 스트림 예제
// Reader : 문자 기반의 입력스트림 최상위 추상 클래스
public class FileReaderTest {
	public static void main(String[] args) {
		
		// "reader.txt" 파일에 내용을 읽어오기 위한 문자 기반의 입력 스트림 객체 생성 : fr
		try(Reader fr = new FileReader("reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
