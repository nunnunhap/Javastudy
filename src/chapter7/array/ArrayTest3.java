package chapter7.array;

public class ArrayTest3 {
	public static void main(String[] args) {
		// boolean배열 데이터타입으로 요소 10개를 생성구문으로 작성
		// 인덱스 0, 3, 6, 9 는 true로 변경
		// for문으로 배열을 출력
		
		boolean[] boolArr = new boolean[10];
		
		boolArr[0] = true;
		boolArr[3] = true;
		boolArr[6] = true;
		boolArr[9] = true;
		
		for(int i=0; i<boolArr.length; i++) {
			System.out.println(i + "번째 인덱스는 " + boolArr[i]);
		}
	}

}
