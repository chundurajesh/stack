package Demo;

public class StackArray {
	private int[] stack;		
	private int top;
	private int capacity;
	StackArray(int capacity){
		this.capacity=capacity;
		stack=new int[capacity];
		top=-1;
	}
	
	void push(int value) {
		if(top == capacity -1) {
			System.out.println("Stack overflow");
			return;
		}
		stack[++top]=value;
	}
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return-1;
		}
		return stack[top --];
	}
	int peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		return stack[top];
	}
	boolean isEmpty() {
		return top ==-1;
	}
	void display() {
		for (int i=top;i<=0;i-- ) {
			System.out.println(stack[i]+"");
		}
		System.out.println();
	}
	public static void main(String[]args) {
		StackArray stack =new StackArray(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		System.out.println("top"+stack.peek());
		System.out.println("top"+stack.pop());
		stack.display();
	}

}
