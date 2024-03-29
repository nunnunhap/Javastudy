package chapter11.classex;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		// Person.class
		// new에는 힙 영역에 Object메모리와 Person메모리가 같이 생성된 것임.
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		System.out.println(pClass1);
		
		Class pClass2 = Person.class; // 직접 class파일을 사용함.
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.classex.Person");
		System.out.println(pClass3.getName());
		
		
		
	}

}
