package chapter11.object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		super(); // 컴파일 시 자동 생성
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode()");
//		return super.hashCode(); //이게 실제 주소값
		return studentId; // 손흥민의 등번호를 리턴하자는 것임.
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() 메서드");
		if(obj instanceof Student) {
			Student std = (Student) obj;
			//st1 과 st3의 객체가 가리키는 힙 영역의 데이터를 비교하는 구문.
			if(studentId == std.studentId && studentName.equals(std.studentName)) {
				return true;
			} else {
				return false;
			}
		} return false;
	}
}
	
public class EqualsTest {
	public static void main(String[] args) {
		
		Student st1 = new Student(100, "손흥민");
		Student st2 = st1; // 객체의 주소대입
		
		System.out.println(st1);
		System.out.println(st2);
		
		Student st3 = new Student(100, "손흥민");
		
		System.out.println(st3);
		
		// 주소비교
		if(st1 == st2) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		} else {
			System.out.println("st1과 st2는 주소가 같지 않습니다.");
		}
		
		// 객체가 저장하고 있는 데이터 관점으로 비교 equals() 메서드
		if(st1.equals(st2)) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		} else {
			System.out.println("st1과 st2는 주소가 같지 않습니다.");
		}
		
		// 주소비교
		if(st1 == st3) {
			System.out.println("st1과 st3는 주소가 같습니다.");
		} else {
			System.out.println("st1과 st3는 주소가 같지 않습니다.");
		}
		
		// 객체가 저장하고 있는 데이터 관점으로 비교 equals() 메서드
		if(st1.equals(st3)) {
			System.out.println("st1과 st3는 같습니다.");
		} else {
			System.out.println("st1과 st3는 같지 않습니다.");
		}
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		
		
	}
}













