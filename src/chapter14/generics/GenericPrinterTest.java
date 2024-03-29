package chapter14.generics;

public class GenericPrinterTest {
	public static void main(String[] args) {
		// 제네릭 클래스 사용. 객체생성
		// 이렇게 쓰면 이제 T는 전부 Power로 바뀌는 것임.
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
	}
}
