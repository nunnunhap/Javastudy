package chapter5.classpart;

public class StudentVariable {
	public static void main(String[] args) {
		// 학생 관련 정보( 학번, 이름, 학년, 주소지)
		
		int studentID;
		String studentName;
		int grade;
		String address;
		
		studentID = 1;
		studentName = "홍길동";
		grade = 4;
		address = "노원구";
		
		System.out.println("학번은? " + studentID);
		System.out.println("이름은? " + studentName);
		System.out.println("학년은? " + grade);
		System.out.println("주소는? " + address);
	}

}
