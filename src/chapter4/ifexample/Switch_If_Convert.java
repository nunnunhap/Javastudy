package chapter4.ifexample;

import java.util.Scanner;

public class Switch_If_Convert {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int ranking = scan.nextInt();
		char medalColor = 0;
		
		if(ranking == 1) {
			medalColor = 'G';
		}else if(ranking == 2) {
			medalColor = 'S';
		}else if(ranking == 3) {
			medalColor = 'B';
		}else {
			medalColor = 'A';
		}
		
		System.out.println(ranking + "등의 메달 색은 " + medalColor + "입니다.");
	}

}
