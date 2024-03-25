package chapter7.array;

// 클래스 배열(객체배열)을 만들기 위한 클래스
public class Book {
	// 필드는 무조건 private
	private String bookName; // 책 제목
	private String author; // 저자
	
	// Book() {} // default가 생략되어 있음.
	
	// 생성자 중복정의 // 생성자는 리턴타입을 사용하지 않음.
	public Book() {}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//getter/ setter 메서드 작성
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 일반 메서드
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
}








