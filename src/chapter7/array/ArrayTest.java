package chapter7.array;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * 배열(동일한 데이터타입으로 연속된 기억장소를 하나의 대표이름으로 관리하는 기능)
		 * 기본 데이터타입으로 생성하는 배열 : 기본데이터타입 [] 배열이름 = new 기본데이터타입[] {값1, 값2, ...};
		 */
		
		// int형 배열
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		//int형 기억장소를 10개 가지고 있는 느낌...? 하지만 그건 스택영역 저장이고 배열은 heap영역 생성임.
		
		for(int i = 0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		// 인덱스가 5인 배열요소를 60으로 변경해라.
		number[5] = 60;
		
		for(int i = 0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
	}

}
