package chapter15.stream;

import java.util.Arrays;

// 스트림 예제
// 배열 또는 컬렉션의 요소를 특정 기준에 따라 정렬, 요소 중 특정값을 제외하고
// 출력하는 이런 형태의 기능들을 가지고 있는 클래스들을 '스트림'
// 여러 형태의 자료 처리에 대한 기능을 제공하는 클래스
public class IntArrayTest {
	public static void main(String[] args) {
		// 배열은 참조타입. 참조타입은 기억장소를 스택영역과 힙 영역 2가지 영역으로 관리.
		int[] arr = {1, 2, 3, 4, 5};
		
		// 1) for문을 사용한 합계 구하기
		// arr배열의 데이터로 합계
		int sum = 0;
		// arr배열의 첫번째 요소 arr[0]
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총 합계는 : " + sum);
		
		// 2) stream 기능을 이용한 합계 구하기
		int sum2 = Arrays.stream(arr).sum(); // 얘도 결과적으론 for문이 돌긴 함.
		int count = (int)Arrays.stream(arr).count(); // count()가 long타입이어야 해서 강제형변환.
		
		System.out.println(sum2);
		System.out.println(count);
	}
}
