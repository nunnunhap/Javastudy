package chapter5.shopmall;

// 회원 클래스
public class Member {
	
	// 필드, 멤버변수, 전역변수
	String name;
	String id;
	String pw;
	int age;
	char gender;
	String zipCode;
	String addr;
	String hobby;
	
	// 메서드, 멤버함수
	// 회원가입
	void register(String name, String id, String pw, int age, char gender, String zipCode,
			 String addr, String hobby) {
		// 데이터베이스에 회원정보를 삽입하는 구문
	}
	void edit(String name, String id, String pw, int age, char gender, String zipCode,
			 String addr, String hobby) {
		// 데이터베이스에 회원정보를 수정하는 구문
	}
	void delete(String id, String pw) {
		// 데이터베이스에 회원정보를 삭제하는 구문
	}
	boolean login(String id, String pw) {
		// 데이터베이스에 아이디, 비밀번호 일치여부 체크, yes or no 기 때문에 boolean으로.
		return true;
	}
	// 아이디 중복체크
	boolean idCheck(String id) {
		// 데이터베이스에 아이디가 존재하지 않으면 사용가능, 존재하면 사용 불가
		return true;
	}
}
