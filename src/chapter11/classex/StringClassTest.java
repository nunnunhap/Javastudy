package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Class class 사용법 //리플렉션개념이 사용됨.
public class StringClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		// String.class의 구성요소를 참조가 가능해진다.
		Class strClass = Class.forName("java.lang.String"); // java.lang.String.class
		
		// String 클래스의 생성자 정보를 확인
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		
		//String 클래스의 필드정보 확인가능
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		
		//String 클래스의 메서드 정보를 확인
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
