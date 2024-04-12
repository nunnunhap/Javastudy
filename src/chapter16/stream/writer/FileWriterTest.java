package chapter16.stream.writer;

import java.io.FileWriter;
import java.io.Writer;

// 문자 기반 스트림
// writer : 문자 기반의 출력 스트림 최상위 추상 클래스
public class FileWriterTest {
	public static void main(String[] args) {
		// 출력 스트림 객체가 생성되면, 파일이 생성된다.
		try(Writer fw = new FileWriter("writer.txt", true)) {
			// 1개 문자를 파일에 쓰는 작업
			fw.write('a');
			
			// 배열로 출력
			char[] buf = {'b', 'c', 'd', 'e', 'g'};
			fw.write(buf);
			
			// 문자열로 출력
			fw.write("동해물과 백두산이 마르고 닳도록");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("출력 완료");
	}

}
