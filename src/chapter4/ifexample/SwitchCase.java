package chapter4.ifexample;

public class SwitchCase {
	public static void main(String[] args) {
		
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
				break; // break문 사용 잊지 말 것.
			case 2 : medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default : medalColor = 'A'; // 사용할 필요 없으면 안 써도 됨. if문의 else와 같음.
		}
		
		System.out.println(ranking + "등 메달의 색은 " + medalColor + "입니다.");
	}

}
