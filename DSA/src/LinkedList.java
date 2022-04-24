
public class LinkedList {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public static LinkedList insert(LinkedList list, int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.head == null) // List is empty
		{
			list.head = newNode;
		}
		else { //list is not empty
			Node last = list.head;
			
			while(last.next != null)
			{
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		return list;
	}
	
	public static void printList(LinkedList list)
	{
		Node curNode = list.head;
		
		System.out.println("Linked List");
		while(curNode != null)
		{
			System.out.print(curNode.data+" ");
			curNode = curNode.next;
		}
		
		System.out.println();
	}
	
	public static LinkedList deleteAtPosition(LinkedList list, int index)
	{
		Node curNode = list.head;
		Node prev = null;
		
		//case 1: index 0
		
		if(index == 0 && curNode != null)
		{
			list.head = curNode.next;
			
			System.out.println(index+" position element deleted");
			
			return list;
		}
		
		//case 2: index > 0, index < size of LL
		
		int counter = 0;
		
		while(curNode != null)
		{
			if(counter == index)
			{
				prev.next = curNode.next;
				
				System.out.println(index+" position element deleted");
				
				break;
			}
			else {
				prev = curNode;
				curNode = curNode.next;
				counter++;
			}
		}
		
		//case 3: index > size of LL
		if(curNode == null)
		{
			System.out.println(index+" position element not found");
		}
		
		return list;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list = insert(list, 11);
		list = insert(list, 134);
		list = insert(list, 156);
		list = insert(list, 10);
		list = insert(list, 14);
		list = insert(list, 19);
		
		printList(list);
		
		deleteAtPosition(list, 0);
		
		printList(list);
		
		deleteAtPosition(list, 2);
		
		printList(list);
		
		deleteAtPosition(list, 7);
		
		printList(list);
		
	}
}
