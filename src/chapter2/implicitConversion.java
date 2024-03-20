package chapter2;

public class implicitConversion {
	public static void main(String[] args) {
		// 정수데이터타입 크기 순서 byte > short > int > long
		// Casting : 데이터타입 변환
		// 묵시적 형변환
		byte bNum = 10;
		// 1바이트 10이 4바이트 10으로 형변환되어 좌측의 타입과 일치된 후 변수에 대입된다.
		int iNum = bNum; // int iNUm = (int)bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		// 정수 데이터타입보다는 실수 데이터타입이 크다(설계)
		int iNum2 = 20;
		float fNum = iNum2; // float fNum = (float)iNum2;

		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // dNum = (float) + (float)
		
		// 우측의 연산코드도 큰 데이터타입으로 변환되어 인식된다.
		System.out.println(dNum);
		
	}

}
