package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

// 파일의 내용을 배열을 사용하여 10바이트씩 읽어오기
// 바이트 단위로 작업.
// 실제 txt파일은 일반적으로 바이트 단위 작업보다 문자 단위 작업을 함.
public class FileInputStreamTest3 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			// 10바이트씩 읽어오는 정보를 저장하는 임시기억장소
			byte[] bs = new byte[12];
			int i;
			
			// fis.read(bs) : 10바이트씩 읽어와서 bs에 저장
			while((i = fis.read(bs)) != -1) {
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + "바이트 읽음");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
