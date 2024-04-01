package chapter14.generics2;

public class GenericPrinterTest {
	public static void main(String[] args) {
		// 제네릭 클래스 사용. 객체생성
		// 이렇게 쓰면 이제 T는 전부 Power로 바뀌는 것임.
		
		// Power클래스 사용가능
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		// Plastic클래스 사용가능
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		
		//Material클래스 사용 가능
		GenericPrinter<Material> materialPrinter = new GenericPrinter<Material>();
		//Person클래스는 Material클래스를 사용받았을 때
		GenericPrinter<Person> personPrinter = new GenericPrinter<Person>();
	}
}
