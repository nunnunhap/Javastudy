package chapter7.array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		// 문자열 배열
		String[] strArray = {"인공지능", "머신러닝", "딥러닝"};
		
		// 전통적인 for
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		// 향상된 for
		for(String ai : strArray) { // strArray에서 데이터를 가져와 ai에 저장하고 출력하고의 반복임.
			System.out.println(ai);
		}
		
		
	}

}
