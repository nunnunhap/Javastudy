package chapter16.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 버퍼 기능을 제공하는 보조스트림을 사용할 경우 속도체크
// a.zip 파일을 읽어서 copy.zip 파일을 생성하여 쓰는 작업(파일 복사)
public class NonBufferedStreamTest {
	public static void main(String[] args) {
		long milisecond = 0;
		try(
				FileInputStream fis = new FileInputStream("a.zip"); // 파일이 준비
				// 출력스트림 객체만 생성되면 이건 빈 파일임.
				FileOutputStream fos = new FileOutputStream("copy.zip"); // 객체생성이 되면 자동으로 생성
			
				// 버퍼 보조스트림 객체 생성/ 데코레이터 패턴
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
			) {
			// 파일 복사 작업이 시작하기 전 유닉스시간에서 현재까지 흐른 시간을 밀리세컨드로 반환.
			milisecond = System.currentTimeMillis();
			
			// 파일복사. 입력스트림으로 a.zip파일의 내용을 읽어와서 출력스트림으로 카피.zip파일에 내용을 쓰는 작업.
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			milisecond = System.currentTimeMillis() - milisecond;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 시간 : " + milisecond + " ms 소요");
		
		
		
		
		
	}

}
