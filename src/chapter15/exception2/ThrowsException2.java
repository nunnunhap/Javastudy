package chapter15.exception2;

// 예외처리
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외전가(예외처리 미루기)
public class ThrowsException2 {
	// 예외전가 : 메서드 안에서 예외가 발생 시 자체 예외처리를 하지 않고 호출한 쪽으로 다시 예외를 돌림.
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		Class c = null;
		
		FileInputStream fis = new FileInputStream(fileName);
		c = Class.forName(className);
		
		return c;
	}
	
	
	
	public static void main(String[] args) {
		ThrowsException2 test = new ThrowsException2();
		
		// multi catch 사용시 여러 예외가 발생한 경우, 가장 큰 예외클래스가 맨마지막에 사용해야 한다.
		// 이 메서드가 호출하면서 예외전가에 의하여 예외를 받으면 현재 이 코드에서 예외처리르 해줘야 함.
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ex) { //위의 catch로도 처리할 수 없는 예외면 최상위 클래스를 하나 두는 것임.
			// 최상위 예외 클래스는 언제나 마지막에 있어야 함!
			
		}
	}
}
