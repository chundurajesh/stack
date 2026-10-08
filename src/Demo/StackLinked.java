package Demo;

public class StackLinked {
	static class Node {
		int data;
		Node next;
		Node (int data){
			this.data = data;
		}
	}
	private Node top;
	void push(int value) {
		Node newNode = new Node (value);
		newNode.next = top;
		top = newNode;
	}
	int pop() {
		if(top == null) {
			System.out.println("Stack is underflow");
			return -1;
		}
		int value = top.data;
		top=top.next;
		return value;
	}
	int peek() {
		if (top == null) {
			return -1;
		}
		return top.data;
	}
	boolean isEmpty() {
		return top == null;
	}
	public static void main(String[]args) {
		StackLinked stack =new StackLinked();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("top"+stack.peek());
		System.out.println("top"+stack.pop());
		System.out.println("top"+stack.pop());
	}

}
