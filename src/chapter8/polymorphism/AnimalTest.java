package chapter8.polymorphism;

// 부모클래스 : super
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal {
	//재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	//추가
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	//재정의
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	//추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	//재정의
	@Override
	public void move() {
		System.out.println("독수리가 날아다닙니다.");
	}
	
	//추가
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

class Lion extends Animal {
	@Override
	public void move() {
		System.out.println("사자가 어슬렁걸어다닙니다.");
	}
	
	// 추가
	public void hunt() {
		System.out.println("사자가 사냥을 합니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		// 다형성 작업
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		aTest.moveAnimal(new Lion());
	}
	
	
	// 다형성 기능의 메서드 정의
	// Animal animal 부모 클래스 변수가 여러 자식관계를 갖게되는 의미 또는 성질을 다형성
	public void moveAnimal(Animal animal) {
		animal.move(); //Human, Tiger, Eagle에 오버라이딩된 내용 출력
	}

}
