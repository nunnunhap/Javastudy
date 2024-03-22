package chapter5.exam;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("TV", 500000);
		
		String p1Info = "p1 제품의 정보를 알려드립니다.\n" + "제품이름 : " + p1.productName
				+ "\n제품가격 : " + p1.price + "원";
		String p2Info = "p2 제품의 정보를 알려드립니다.\n" + "제품이름 : " + p2.productName
				+ "\n제품가격 : " + p2.price + "원";
		
		System.out.println(p1Info);
		System.out.println();
		System.out.println(p2Info);
		
		
	}

}
