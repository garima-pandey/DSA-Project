package Graph;

public class AdjacentMatrix {

	boolean adjMatrix[][];
	int numVertices;
	
	public AdjacentMatrix(int numVertices) {
		this.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
	}
	
	//Add edge 
	public void addEdge(int i, int j)
	{
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}
	
	
	public String print()
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < numVertices; i++)
		{
			sb.append(i+"-");
			for(boolean j : adjMatrix[i])
			{
				sb.append((j ? 1 : 0) + " ");
			}
			
			sb.append("\n");
		}
		
		return sb.toString();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjacentMatrix graph = new AdjacentMatrix(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		
		System.out.println(graph.print());
	}

}
