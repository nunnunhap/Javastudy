package chapter5.hiding2;

import chapter5.hiding.MyDate;

public class MyDataTest {
	private int i;
	
	public static void main(String[] args) {
		
		// 같은 패키지에선 MyDate라고만 썼지만 다른 패키지에선 이렇게 경로를 써줘야 함.
		chapter5.hiding.MyDate date1 = new chapter5.hiding.MyDate();
		
		// 하지만 위에 import를 해준다면 패키지 경로를 생략할 수 있음.
		MyDate date2 = new MyDate();
		
		MyDataTest mdata = new MyDataTest();
		mdata.i = 50;
		
	}
}
