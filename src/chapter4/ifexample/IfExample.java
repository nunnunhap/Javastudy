package chapter4.ifexample;

public class IfExample {
	public static void main(String[] args) {
		boolean isMarried = true;
		
		if(isMarried) {
			System.out.println("기혼입니다.");
		}
		
		boolean isEven;
		int num = 10;
		
		isEven = (num % 2 == 0) ? true : false;
		System.out.println(isEven);
		
	}

}
