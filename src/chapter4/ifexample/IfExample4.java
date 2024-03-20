package chapter4.ifexample;

import java.util.Scanner;
// main() 메서드 안의 변수는 어떻게 되었든 값을 가져야만 
public class IfExample4 {
	public static void main(String[] args) {
		// 다중 if문
		
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt(); // 나이
		int charge = 0; // 입장료
		
		//아래 다중 if문에서 조건식이 성립이 안되어도 charge변수가 값을 갖지 못하는 경우는 에러 발생
		if(age >= 0 && age < 8) {
			charge = 1000;
			System.out.println("미취학아동입니다.");
		}else if(age >= 8 && age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age >= 14 && age < 20) {
			charge = 3000;
			System.out.println("중고등학생입니다.");
		}else if(age >= 20 && age < 70) {
			charge = 5000;
			System.out.println("성인입니다.");
		}else if (age >= 70){
			charge = 2500;
			System.out.println("고령할인 대상자입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
	}

}
