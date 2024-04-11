package chapter16.stream.other;

import java.util.Scanner;

// System.in이란 표준 입력 스트림을 직접 쓰는 것보다 System.in을 가지고 있는 Scanner클래스를 쓰는게 더 좋음.
// 키보드를 통해 입력받는 데이터를 더 쉽고 편하게 만든 특징.
public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.nextLine(); // 입력한 값을 String으로 반환
		System.out.println("직업 : ");
		String job = scanner.nextLine();
		System.out.println("사번 : ");
		int num = scanner.nextInt(); // 정수 반환
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		
	}
}
