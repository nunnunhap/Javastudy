package chapter15.exception2;

public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		
		try(AutoCloseObj obj2 = obj) {
			throw new Exception();
			// 예외가 발생되었다고 인식시킬 수 있음.
			// 그리고 obj.close()메서드가 자동호출되어 힙영역의 주소를 더 이상 참조하지 않음.
		}catch(Exception ex) {
			
			System.out.println("예외발생");
		}
		
	}

}
