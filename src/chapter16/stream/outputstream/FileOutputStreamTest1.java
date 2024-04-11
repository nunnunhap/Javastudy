package chapter16.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 단위로 작업하는 출력 스트림 예제
public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		
		//true : output.txt이 존재하면 파일의 기존 내용에 추가되며 없으면 새로 생성.
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			// 이렇게 작업하진 않음.
			fos.write(97);
			fos.write(98);
			fos.write(99);

		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력완료");
		
		
		
	}

}
