package chapter6.thisex;

// this 키워드
class BirthDay { // 실제 개발할 땐 이런 class 파일은 별도로 빼서 만듦.
	private int getDay() {
		return day;
	}
	private void setDay(int day) {
		this.day = day;
	}
	private int getMonth() {
		return month;
	}
	private void setMonth(int month) {
		this.month = month;
	}
	private int getYear() {
		return year;
	}
	// default 접근제어자 : 동일한 패키지 안에서는 public 반응을 일으킴.
	int day;
	int month;
	int year;
	
	// year 필드에 대한 setter 메서드, setter메서드는 무조건 public으로 설정
	public void setYear(int year) {
		this.year = year; // this : 힙 영역에 생성된 BirthDay클래스 객체
	}
	public void printThis() {
		System.out.println(this);
	}	
}

public class BirthDayTest {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2024);
		System.out.println(bDay); //chapter6.thisex.BirthDay@75a1cd57
		
		bDay.printThis(); //chapter6.thisex.BirthDay@75a1cd57
	}
}
