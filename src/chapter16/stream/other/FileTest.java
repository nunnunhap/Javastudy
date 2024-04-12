package chapter16.stream.other;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		// File클래스 : 파일과 폴더 관련 작업을 할 때 사용하는 클래스
		File file = new File("C:\\Dev\\Lecture\\JavaWork\\study\\newFile.txt");
		
		try {
			// 경로에 newFile.txt 생성
			file.createNewFile();
			
			// newFile.txt 파일정보
			System.out.println(file.isFile()); // 파일인지 확인
			System.out.println(file.isDirectory()); // 폴더인지 확인
			System.out.println(file.getName()); // 파일명 확인
			System.out.println(file.getAbsolutePath()); // 파일의 절대경로
			System.out.println(file.getPath()); // 파일경로
			System.out.println(file.canRead()); // 파일읽기 상태
			System.out.println(file.canWrite()); // 파일 쓰기 상태
			
			file.delete(); // 파일삭제
			
			File dir = new File("C:\\Dev\\Lecture\\JavaWork\\study\\newFolder");
			
			dir.mkdirs(); // 폴더 생성
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
