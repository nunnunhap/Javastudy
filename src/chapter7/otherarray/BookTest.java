package chapter7.otherarray;

import chapter7.array.Book;

public class BookTest {
	public static void main(String[] args) {
		// 생성자의 접근자 이해때문에 작성
		// 동일한 패키지는 default일 경우 접근 가능
		// 다른 패키지일 경우 public일 경우에 접근 가능
		// public은 패키지 상관없이 모두 접근 가능
		Book book = new Book();
		
	}

}
