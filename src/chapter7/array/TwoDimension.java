package chapter7.array;

// 다차원 배열
public class TwoDimension {
	public static void main(String[] args) {
		// 2*3 : 2행 3열
		int[][] arr = {
				{1, 2, 3}, // 첫번째 행
				{4, 5, 6} // 두번째 행
		};
		
		arr[0][2] = 30;
		
		System.out.println("두번째 행, 두번째 열은? : " + arr[1][1]);
		System.out.println("첫번째 행, 세번째 열은? : " + arr[0][2]);
		
		//행/열의 크기
		System.out.println("arr 배열의 몇 행?" + arr.length); //2
		System.out.println("첫번째 행의 열의 갯수?" + arr[0].length);
		System.out.println("두번째 행의 열의 갯수?" + arr[1].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
