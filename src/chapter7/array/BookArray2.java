package chapter7.array;

public class BookArray2 {
	public static void main(String[] args) {
	
		// 스택영역(주소) -> 힙영역(데이터)
		Book b1 = new Book("인공지능", "홍길동");
		Book b2 = new Book("머신러닝", "손흥민");
		Book b3 = new Book("딥러닝", "김민재");
		
		// 클래스배열(객체배열) : 스택영역(주소) -> 힙영역(주소) -> 힙영역(데이터)
		Book[] bookArray = new Book[3]; // 힙 영역에서 실제 데이터가 생성되는 주소를 참조
		bookArray[0] = new Book("인공지능", "홍길동"); // 실제 데이터가 관리되는 힙 영역의 메모리 생성작업
		bookArray[1] = new Book("머신러닝", "손흥민");
		bookArray[2] = new Book("딥러닝", "김민재");
		
		for(int i=0; i<bookArray.length; i++) {
			System.out.println(bookArray[i].getBookName() + "/" + bookArray[i].getAuthor());
		}
}
}