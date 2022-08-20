package Tree;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
	int data;
	ArrayList<Node> children;
	
	Node(int data)
	{
		this.data = data;
		children = new ArrayList<>();
	}
}

public class GenericTree {
	
	Scanner scanner = new Scanner(System.in);
	
	public Node addSubTree()
	{
		System.out.println("Enter the data of a node: ");
		int data = scanner.nextInt();
		
		Node parentNode = new Node(data);
		
		System.out.println("Enter the number of children of "+data);
		int children = scanner.nextInt();
		
		for(int i = 1; i <= children; i++)
		{
			Node child = addSubTree();
			parentNode.children.add(child);
		}
		
		return parentNode;
	}
	
	public void print(Node root)
	{
		System.out.println(root.data +"=>");
		System.out.println();
		
		for(Node child : root.children)
		{
			print(child);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericTree obj = new GenericTree();
		Node root = obj.addSubTree();
		obj.print(root);
		
	}

}
