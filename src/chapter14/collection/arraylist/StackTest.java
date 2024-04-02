package chapter14.collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 데이터 꺼내오기
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return(arrayStack.remove(len - 1));
	}
}

// 자료구조 중 ArrayList클래스를 이용하여 스택을 구현한 예제
// 스택 : Last Input First Output(LIFO)
public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();

		// 데이터 추가(저장순서 : A, B, C)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		// 데이터 꺼내오기(출력순서 : C, B, A)
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
