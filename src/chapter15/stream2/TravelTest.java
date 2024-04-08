package chapter15.stream2;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		// 객체생성
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 80);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		// polymorphism
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("----- 고객 명단 추가된 순서대로 출력 -----");
		// map() : 일부를 참조할 때 사용.
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("----- 고객 나이가 추가된 순서대로 출력 -----");
		customerList.stream().map(c -> c.getAge()).forEach(s -> System.out.println(s));

		System.out.println("----- 고객 여행비용이 추가된 순서대로 출력 -----");
		customerList.stream().map(c -> c.getPrice()).forEach(s -> System.out.println(s));
		
		// 총 여행비용 // int형이라 mapToInt를 씀.
		int total_Price = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행비용 : " + total_Price + "원");
		
		System.out.println("----- 고객 중 20세 이상만 나이 정렬 후 출력 -----");
		// 조건을 이용할 때 Stream API 작업
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getAge()).sorted().forEach(s -> System.out.println(s));
	}
}
