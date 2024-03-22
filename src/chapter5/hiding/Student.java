package chapter5.hiding;

// 정보은닉(캡슐화) : 접근자 문법
public class Student {
	// 필드
	int studentId;
	private String studentName;
	int grade;
	String address;
	// 개발자가 직접 클래스 안의 필드에 값을 넣지 못하도록 하며 메서드를 통해서만 가능함.
	private int score;
	
	// 생성자
	
	// 메서드
	// private 때문에 메서드를 사용하여 접근이 가능하여 메서드 내 조건문을 넣어 정보를 걸러 저장할 수 있음.
	public void setScore(int score) { // 필드에 값을 저장 : setter 메서드
		
		if(score < 0 || score > 100) {
			this.score = 0;
			return; // 값을 안 집어넣었으니 void 사용해도 오케이
		}
		
		this.score = score;
	}
	
	public int getScore() { // 필드의 값을 읽기 : getter 메서드
		return score;
	}
}
