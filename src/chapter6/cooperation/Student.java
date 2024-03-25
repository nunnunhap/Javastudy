package chapter6.cooperation;

// Bus, Subway 클래스를 먼저 작업하고 Student클래스 이후에 작업해야 함.
public class Student {

	public String studentName;
	public int grade;
	public int money;
	
	// 매개변수가 있는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 이용하는 교통수단
	// Bus 클래스가 참조되는 상황이므로 먼저 Bus를 쓰고 Student 클래스를 작성하는 것!
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}

}
