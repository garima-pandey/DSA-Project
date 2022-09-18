package Tree;

public class MaxHeapTree {

	int heap[];
	int size;
	int maxSize;
	
	
	public MaxHeapTree(int maxSize)
	{
		this.maxSize = maxSize;
		this.size = 0;
		heap = new int[this.maxSize+1];
		heap[0] = Integer.MAX_VALUE;
	}
	
	int parent(int i)
	{
		return i/2;
	}
	
	void swap(int i, int j)
	{
		int temp;
		temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	void insert(int value)
	{
		heap[++size] = value;
		int current = size;
		
		while(heap[current] > heap[parent(current)])
		{
			swap(current, parent(current));
			current = parent(current);
		}
	}
	
	void print()
	{
		for(int i = 1; i <= size/2; i++)
		{
			System.out.println("\n Parent: "+heap[i]+" Left Child: "+heap[2 * i] + " Right Child: "+heap[2 * i + 1]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxHeapTree tree = new MaxHeapTree(5);
		
		tree.insert(5);
		tree.insert(3);
		tree.insert(17);
		tree.insert(10);
		tree.insert(84);
		
		tree.print();
		
	}

}
