package chapter7.array;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 4},
				{2, 5},
				{3, 6}
		};
		
		// 배열의 행 크기
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		// 2행 2열 데이터를 7로 변경하라.
		arr[1][1] = 7;
		arr[2][1] = 8;
	
		// 중첩 for문을 통하여 arr 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println((i+1) +"행 " + (j+1) + "열의 값은 : " + arr[i][j]);
			}
		}
		
	}

}
