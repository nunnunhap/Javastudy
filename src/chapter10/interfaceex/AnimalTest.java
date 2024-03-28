package chapter10.interfaceex;

public class AnimalTest {
	public static void main(String[] args) {
		// Animal abstract class 객체생성
		// Animal animal = new Animal(); 이건 에러(추상클래스로는 객체생성할 수 없음)
		
		AnimalTest aTest = new AnimalTest();
		aTest.callMethodAnimal(new Cat());
		
		
	}
	
	public void callMethodAnimal(Animal animal) { // 이게 abstract class
		animal.cry();
		animal.run();
	}
}
