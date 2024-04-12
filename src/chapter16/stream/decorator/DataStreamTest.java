package chapter16.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 보조 스트림
// DataInputStream, DataOutputStream
// 데이터 타입 크기를 사용하여 읽고 쓰는 작업을 할 때 사용.

public class DataStreamTest {
	public static void main(String[] args) {
		// 출력스트림 작업
		try(
			// 메인 스트림
			FileOutputStream fos = new FileOutputStream("data.txt"); // 0바이트 파일 생성
			// 보조 스트림
			DataOutputStream dos = new DataOutputStream(fos);
		) {
			// 읽어오는 것을 생각해서 저장 순서가 중요하다.
			dos.writeByte(100);
			dos.writeChar('a');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 입력스트림 작업
		try(
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dos = new DataInputStream(fis);
			) {
				// 저장된 순서대로 읽기 작업
				System.out.println(dos.readBoolean());
				System.out.println(dos.readChar());
				System.out.println(dos.readInt());
				System.out.println(dos.readFloat());
				System.out.println(dos.readUTF());
			}catch(Exception e) {
				
			}		
	}
}
