package chapter11.wrapper;

// Wrapper클래스
// 기본 데이터타입을 객체관점으로 사용할 때 기능을 제공

public class Wrapper {
	public static void main(String[] args) {
		// 참조타입클래스 변수 = 기본데이터 타입값;
		Integer num = 100; // 힙 영역에 메모리를 생성해서 데이터를 넣는 것이 boxing 형변환. 기본데이터가 참조타입으로 변환됨.
		int iNum = num.intValue(); //Integer클래스에서 정수값만 가져옴. num은 객체고 객체에서 값을 가져오는 것 unBoxing.
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
		// Boxing : 기본형을 객체형으로 변환하여 저장하는 것.
		// unBoxing : 객체형에서 기본형으로 꺼내오는 것.
	}

}
