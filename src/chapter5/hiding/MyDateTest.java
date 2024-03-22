package chapter5.hiding;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		
		date.day = 1; // public
		date.month = 10; // default
//		date.year = 2024; // private 접근자로 되어 있기 때문에 접근이 안되는 특징이 있음.
	}

}
