package chapter14.collection.arraylist;

import java.util.ArrayList;

// 컬렉션 : List Interface
// 특징 : 데이터가 순서를 유지. 데이터 중복 허용.
public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al.add("손흥민");
		al.add("김민재");
		al.add("이강인");
		al.add("황희찬");
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		
		//데이터 출력
		System.out.println(al.get(0)); // get() : 읽어오기
		System.out.println(al2.get(3));
		
	}

}
