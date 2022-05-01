package Stack;

public class StackwithLL {

	Node top;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		
		if(top == null)
		{
			top = newNode;
		}
		else {
			Node temp = top;
			top = newNode;
			newNode.next = temp;
		}
		
		System.out.println(data+" Pushed into a stack");
	}
	
	public int pop()
	{
		int popped = Integer.MIN_VALUE;
		
		if(top == null)
		{
			System.out.println("Stack Underflow");
		}
		else {
			popped = top.data;
			top = top.next;
		}
		
		return popped;
	}
	
	public int peek()
	{
		if(top == null)
		{
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		else {
			return top.data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StackwithLL stack = new StackwithLL();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop()+" Popped");
		System.out.println(stack.peek()+ " Peek");
	}

}
