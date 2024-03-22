package chapter6.thisex;
// 이름이 똑같아서 헷갈리기 시작하면 import가 어떠한 것이 되어 있는지 확인하면 나음.

class Person {
	String name;
	int age;
	
	// 생성자 : 리턴타입 쓰면 안됨.
	Person() {
		this("이름없음", 1); // 같은 생성자끼리 호출할 수 있음.
	}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		Person noName2 = new Person("이름없음", 1);
		System.out.println(noName2.name);
		// 위의 두 센텐스는 동일함.
		
		Person ps1 = new Person("홍길동", 100);
		System.out.println(ps1.name);
		System.out.println(ps1.age);
	}

}
