package chapter2;

public class ExplicitConversion {
	public static void main(String[] args) {
		// 형변환 casting : 데이터타입 변환
		// 명시적 형변환
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		// 실수값이 정수값으로 변환 시 소수부분은 버려진다. (반올림 같은거 없다) 그냥 소수점 부분 폐기
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
	}

}
