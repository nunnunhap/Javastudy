package chapter16.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 보조 스트림 : 메인 스트림에 추가하여 작업하는 특징을 가지고 있음.
// 단독으로 사용 불가
// 보조스트림 객체 = new 생성자(메인 스트림 객체);
public class InputStreamReaderTest {
	public static void main(String[] args) {
		
		// 작업
		
		// 문자 기반의 입력 스트림 객체 생성. 바이트 기반의 객체를 문자 기반의 객체로 변환하는 작업
		// 보조스트림
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
