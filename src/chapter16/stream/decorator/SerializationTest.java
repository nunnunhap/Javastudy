package chapter16.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 직렬화 및 역직렬화

// 직렬화에 사용할 클래스는 반드시 java.io.Serializable인터페이스를 상속받은 객체는 직렬화할 수 있는 기본조건
class Person implements Serializable {
	// 역직렬화 시 클래스 상태가 달라도 아래의 serialVersionUID가 에러를 방지시켜줌.(그냥 해주기)
	// 안 만들면 자동으로 만들어지긴 하는데 이렇게 되면 직렬화할 때랑 역직렬화 사이에 클래스가 변경이 되면 이 값이 변경되어
	// 일치가 되지 않으니까 에러가 떨어짐. 그래서 직렬화/역직렬화할 때 같은 클래스를 사용하기 위하여 이걸 수동으로 작성해주는 것.
	private static final long serialVersionUID = -3453004897960665710L;

	String name;
	transient String job; // 직렬화 대상에서 제외
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) {
		// 직렬화로 사용할 객체생성
		Person personHong = new Person("홍길동", "의적");
		Person personSon = new Person("손흥민", "축구선수");
		
		try(
				FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos); // 직렬화 작업으로 사용할 보조스트림
		) {
			oos.writeObject(personHong); // personHong 객체 상태를 serial.out에 저장
			oos.writeObject(personSon); // transient가 있어서 job필드는 제외
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// Person클래스가 변경 전에 직렬화 작업을 하고 역직렬화 작업 전에 Person클래스가 변경이 되었을 때
		// 역직렬화할 때 에러 발생
		// 역직렬화로 사용할 객체생성
		try(
			FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
		){
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
