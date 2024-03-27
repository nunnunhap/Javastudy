package chapter8.inheritance2;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal 클래스를 이용하여 객체를 생성
		// 자식 클래스와는 전혀 상관없음.
		Animal ani = new Animal();
		ani.cry();
		ani.run();
		
		// 자식클래스 Cat으로 객체를 생성 시, new메모리연산자가
		// 부모클래스 Animal을 이용하여 힙 영역에 메모리 생성
		// 돌아와서 자식클래스 Cat을 이용하여, 힙 영역에 메모리 생성
		// 이 와중에 생성자는 부모생성자 호출 -> 자식생성자 호출로 이루어짐(설계가 이렇게 됨)
		Cat cat = new Cat();
		// 재정의된 cry(), run() 메서드는 자신의 것으로 호출.
		cat.parentTest();
		cat.cry();
		
		cat.parentMethod();
		
		Animal animal = new Cat();
		animal.cry();
	
		Animal aniLion = new Lion();
		aniLion.cry();
		aniLion.run();
		
		Lion lionCasting = (Lion)aniLion;
		lionCasting.play();
		
		
		
	}

}
