package chapter7.array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50}; // 원본배열
		int[] array2 = {1, 2, 3, 4, 5}; // 사본배열
		
		//배열복사기능
		// array1배열의 [0] 위치에서 array2배열의 [1]위치에 4개를 복사
		System.arraycopy(array1, 0, array2, 1, 4);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
