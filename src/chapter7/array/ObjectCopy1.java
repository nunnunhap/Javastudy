package chapter7.array;

// 배열복사 : bookArray1 배열의 데이터를 bookArray2배열에 복사
public class ObjectCopy1 {

	public static void main(String[] args) {
		// Book클래스를 이용하여 클래스배열(객체배열)
		
		// 실제데이터를 저장하는 힙 영역에 기억장소는 생성이 안되어 있음.
		Book[] bookArray1 = new Book[3]; // 메모리 구조표현 // 메모리 구조표현
		Book[] bookArray2 = new Book[3]; // []는 첨자 라고 함.
		
		// 실제 데이터를 저장하는 힙 영역에 기억장소가 생성된 것을 의미
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		// 실제 데이터를 저장하는 힙 영역에 기억장소가 생성된 것을 의미
		bookArray2[0] = new Book(); // bookName 필드에는 null, author필드에는 null
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// bookArray1 배열의 데이터를 bookArray2배열로 복사
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());			
		}
		
		// bookArray2배열의 복사된 데이터를 출력확인
		System.out.println("[배열2 출력]");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// bookArray1배열의 값을 변경
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		//bookArray1배열 데이터 출력
		System.out.println("[bookArray1[0] 데이터 변경]");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// bookArray2배열 데이터 출력
		System.out.println("[bookArray1[0] 값을 변경했을 때 bookArray2 배열이 영향을 받았는지 확인]");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
