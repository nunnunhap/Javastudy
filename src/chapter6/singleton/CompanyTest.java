package chapter6.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		
		// 싱글톤 패턴 클래스로 객체생성 불가능
//		Company company = new Company();
		
		// com1 객체생성
		Company com1 = Company.getInstance();
		
		// 이름은 다르지만 주소값이 똑같아서 전혀 의미가 없음.
		Company com2 = Company.getInstance();
		Company com3 = Company.getInstance();
		
		System.out.println(com1 == com2); // true
		
	}

}
