package chapter3.operator;

public class OperationEx5 {
	public static void main(String[] args) {
		//비트 이동 연산자 : << >> >>>
		
		int num = 0B10000101; //0B붙이고 들어가는 숫자는 이진수값임.
		System.out.println(num);
		System.out.println(num << 2);
		System.out.println(num >> 2);
		
		System.out.println(num >>> 2);
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
