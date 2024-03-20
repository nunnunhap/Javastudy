package chapter4.ifexample;

public class SwitchCase2 {
	public static void main(String[] args) {
		// String 클래스 : 문자열 데이터를 관리할 때 사용.
		// char 데이터타입과는 다르다.
		
		String medal = "Gold";
		
		// switch문에 정수 변수만이 아니라 문자열 변수를 사용할 수 있다.
		// java 1.7버전부터 지원하며 시중에는 java 1.8버전부터 있는 편임.
		
		switch (medal) {
			case "Gold" :
				System.out.println("금메달입니다.");
				break;
			case "Silver" :
				System.out.println("은메달입니다.");
				break;
			case "Bronze" :
				System.out.println("금메달입니다.");
			default :
				System.out.println("메달이 없습니다.");
				break;
		}
	}

}
