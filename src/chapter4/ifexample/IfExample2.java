package chapter4.ifexample;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		// 다중 if문
		
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt(); // 나이
		int charge; // 입장료
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학아동입니다.");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age < 20) {
			charge = 3000;
			System.out.println("중고등학생입니다.");
		}else {
			charge = 5000;
			System.out.println("성인입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
	}

}
