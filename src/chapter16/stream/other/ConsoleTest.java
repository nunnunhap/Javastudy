package chapter16.stream.other;

import java.io.Console;

// Console 클래스 : 내부적으로 System.in을 사용하지 않고, 콘솔내용을 읽을 수 있는 기능 제공
public class ConsoleTest {
	public static void main(String[] args) {
		// 이건 버젼이 낮을 때는 동작이 정상적으로 되는데
		// 우리는 이것보다 높은 버젼이라서 지원되지 않음.
		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		System.out.println("직업 : ");
		String job = console.readLine();
		System.out.println("비밀번호 : ");
		char[] pw = console.readPassword();
		String strPass = new String(pw);
		
		System.out.println(name + job + strPass);
		
	}

}
