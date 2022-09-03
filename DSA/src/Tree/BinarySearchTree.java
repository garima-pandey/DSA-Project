package Tree;

public class BinarySearchTree {
	
	class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	Node root;
	
	BinarySearchTree() {
		root = null;
	}
	
	void insert(int data)
	{
		//create a new node
		Node newNode = new Node(data);
		
		//tree is empty
		if(root == null)
		{
			root = newNode;
			return;
		}
		else { //tree is not empty
			Node current = root, parent = null;
			
			while(true)
			{
				parent = current;
				
				if(data < current.data)
				{
					current = current.left;
					
					if(current == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else {
					current = current.right;
					
					if(current == null)
					{
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	void inOrder(Node node)
	{
		if(root == null)
		{
			System.out.println("Tree is Empty");
			return;
		}
		else {
			if(node.left != null)
			{
				inOrder(node.left);
			}
			
			System.out.print(node.data+" ");
			
			if(node.right != null)
			{
				inOrder(node.right);
			}
		}
	}
	
	Node minNode(Node root)
	{
		if(root.left != null)
		{
			return minNode(root.left);
		}
		else {
			return root;
		}
	}
	
	Node delete(Node node, int value)
	{
		if(node == null)
		{
			return null;
		}
		
		else {
			if(value < node.data)
			{
				node.left = delete(node.left, value);
			}
			else if(value > node.data)
			{
				node.right = delete(node.right, value);
			}
			else { // node found
				// if node has no child
				if(node.left == null && node.right == null)
				{
					node = null;
				}
				//if node has only one right child
				else if(node.left == null)
				{
					node = node.right;
				}
				//if node has only one left child
				else if(node.right == null)
				{
					node = node.left;
				}
				//if node has two children node
				else {
					Node temp = minNode(node.right);
					
					node.data = temp.data;
					
					node.right = delete(node.right, temp.data);
				}
			}
		}
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(10);
		tree.insert(5);
		tree.insert(20);
		tree.insert(1);
		tree.insert(3);
		tree.insert(30);
		
		tree.inOrder(tree.root);
		tree.delete(tree.root, 5);
		System.out.println();
		tree.inOrder(tree.root);

	}

}
