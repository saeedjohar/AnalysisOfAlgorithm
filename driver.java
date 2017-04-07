import java.util.Scanner;
// ----------------------Driver Main Class----------------------------------
public class driver {

	public static void main(String[] args) {

		//--------Declaration----------------------
		int noOfVertex, source, destination;
		Scanner input = new Scanner(System.in);
		DFS dfs = new DFS();
		BFS bfs = new BFS();
		
		
		try
		{
			System.out.print("Enter the number of vertex: ");
			noOfVertex = input.nextInt();
			int[][] adjacencyMatrix = new int[noOfVertex + 1][noOfVertex + 1]; //declaring adjacency matrix for graph
			
			System.out.println("Enter the adjacency matrix");
			//---------forms the adjacency matrix of graph-------------
			for (int i = 1; i <= noOfVertex; i++)
				for (int j = 1; j <= noOfVertex; j++)
					adjacencyMatrix[i][j] = input.nextInt();

			System.out.println("Enter the source of graph");
			source = input.nextInt(); 
			System.out.println("Enter the destination of traversal(for DFS) : ");
			destination = input.nextInt();
			
			dfs.dfs(adjacencyMatrix, source,destination);	// DFS operation is done here
			bfs.bfs(adjacencyMatrix, source); // BFS operation is done here
		}catch(Exception e)
		{
			System.out.println("ERROR: Error in input format");
		}	
		input.close();

	} 
	
}
