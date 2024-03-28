package chapter11.object;

// 스프링에서 엄청 많이 사용할 작업
class Book {
	// 필드
	int bookNumber;
	String bookTitle;
	
	// 매개변수가 있는 생성자
	public Book(int bookNumber, String bookTitle) {
		super(); // 부모클래스의 기본생성자 호출 // Object의 생성자를 호출함.
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// 재정의 // 필드의 정보를 확인하는 목적
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1); // book1이 아닌 book1.toString이 생략된 것.
		// toString()메서드를 재정의 안하면, Object클래스의 toString()메서드는 다음과 같이 출력
		// chapter11.object.Book@75a1cd57 (주소값)
		// 재정의 시 toString의 리턴값이 출력.

	}
}
