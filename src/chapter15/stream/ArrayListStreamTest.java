package chapter15.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// 스트림 예제 : 컬렉션에 스트림기능 사용
public class ArrayListStreamTest {
	public static void main(String[] args) {
		// List컬렉션
		List<String> sList = new ArrayList<String>();
		sList.add("손흥민");
		sList.add("김민재");
		sList.add("이강인");
		
		// 1) 일반 for문
		for(int i=0; i<sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		System.out.println();
		
		// 2) 향상된 for문
		for(String i : sList) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 3) 스트림 사용(컬렉션 객체의 데이터를 순차적으로 출력)
		// forEach(Consumer 함수형 인터페이스)
		// Consumer 함수형 인터페이스는 매개변수를 사용만 하고 리턴은 하지 않음.
		Stream<String> stream = sList.stream(); // 컬렉션객체.stream()
		stream.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		// 4) 스트림을 사용(컬렉션 객체의 데이터 정렬)
		// sorted() 메서드가 지원되지 않으면 for문 안에서 데이터 대소비교 후 정렬코드작업을 해야 함.
		sList.stream().sorted().forEach(s -> System.out.println(s));
		
	}
}
