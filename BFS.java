import java.util.LinkedList;
import java.util.Queue;
//-----------------BFS is done with Queue----------------
public class BFS {
	
	private Queue<Integer> queue;
	
	//-----constructor------
	public BFS(){
		queue = new LinkedList<Integer>();
	}
	
	public void bfs(int[][] adjacencyMatrix, int source)
    {
        int noOfVertex = adjacencyMatrix[source].length - 1;
 
        int[] visited = new int[noOfVertex + 1]; // to hold the visited vertex
        int i, element;
 
        visited[source] = 1;
        queue.add(source); // Add vertices to the queue
        
        System.out.println("\nBFS Traversal of the graph");
        
     // prints the visited vertex and removes from the queue  
        while (!queue.isEmpty())
        {
            element = queue.remove();
            i = element;
            System.out.print(i + "  ");
            while (i <= noOfVertex)
            {
                if (adjacencyMatrix[element][i] == 1 && visited[i] == 0)
                {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
	
}
}
