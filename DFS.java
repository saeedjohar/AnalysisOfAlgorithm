import java.util.Stack;
//-----------------DFS is done with Stack----------------
public class DFS {

	private Stack<Integer> stack; //Stack declared for traversal of graph
	
	//Constructor 
	public DFS(){
		stack = new Stack<Integer>();
	}

	public void dfs(int[][] adjacencyMatrix, int source, int destination)
	{
		int noOfVertex = adjacencyMatrix[source].length -1 ;
		int[] visited = new int[noOfVertex + 1];	// to hold the visited vertex	
		int element = source;		
		int i = source;	
		int count=0; // for counting the index
		int[] traversal = new int[noOfVertex + 1] ; // to hold the visited vertex for finding shortest path
		
		
		
		traversal[count] = element; // holds visited vertices initial value in array
		count++; // saves index
		System.out.println("DFS Traversal of the graph");
		System.out.print(element + "  ");  //prints first element		
		visited[source] = 1;		
		stack.push(source);	//Pushes the vertices to the stack
		
		
			
		// prints the peek vertex and pops the vertex  
		while (!stack.isEmpty())
		{
			element = stack.peek(); 
			i = element;	
			while (i <= noOfVertex)
			{
				if (adjacencyMatrix[element][i] == 1 && visited[i] == 0)
				{
					
					stack.push(i);
					visited[i] = 1;
					element = i;
					i = 1;
					System.out.print(element + "  "); // prints visited elements
					traversal[count] = element; // holds visited vertices in array
					count++; // saves index
					//continue;
				}
				i++;
			}

			stack.pop();	
		}
		System.out.println("\nThe path is ");
		for(int j=0; j<count;j++ )
		{		
			System.out.print(traversal[j] + " ");
			if (traversal[j] == destination) {
				break;
			}	
		}
		
	}


}