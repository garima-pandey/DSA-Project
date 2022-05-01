package Stack;

class Stack {
	final int max = 100;
	int top = -1; // stack is empty
	
	int stack[] = new int[max];
	
	boolean push(int value)
	{
		if(top > (max - 1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			stack[++top] = value;
			System.out.println(value+" pushed into a stack");
			return true;
		}
	}
	
	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int value = stack[top--];	
			return value;
		}
	}
	
	int peek()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int value = stack[top];	
			return value;
		}
	}
}

public class StackwithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		
		stack.push(10); // true
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop() +" Popped value from the stack");
		System.out.println(stack.peek() +" Peek end of the stack");

	}

}
