package interview.buytake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class MaximalConnection {

	private static Set<Integer> graph = null;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NMX = br.readLine().split(" ");
		int totalCitiesCount = Integer.parseInt(NMX[0]);
		int totalEdgesCount = Integer.parseInt(NMX[2]);
		
		String[] specialCities = br.readLine().split(" ");
		Set<Integer> speicalCitiesInt = convertStringToSet(specialCities);
		boolean[][] adjacencyMatrix = new boolean[totalCitiesCount][totalCitiesCount];
		
		while(totalEdgesCount > 0){
			String[] totalEdgesArray = br.readLine().split(" ");
			int u = Integer.parseInt(totalEdgesArray[0]);
			int v = Integer.parseInt(totalEdgesArray[1]);
			adjacencyMatrix[u-1][v-1] = true;
			adjacencyMatrix[v-1][u-1] = true;
			totalEdgesCount--;
		}
		boolean[] visited = new boolean[totalCitiesCount];
		int computationPower = 0;
		for(int i = 0;i < totalCitiesCount;i++){
			if(!visited[i]){
				Queue<Integer> queue = new LinkedList<Integer>();
				queue.add(i);
				int node = i;
				visited = BFS(adjacencyMatrix,totalCitiesCount,node,queue,visited);
				computationPower += getSpecialCities(speicalCitiesInt);
			}
		}
		
		System.out.println(computationPower);
		
	}
	
	private static Set<Integer> convertStringToSet(String[] arr){
		if(arr == null){
			return null;
		}
		
		Set<Integer> intSet = new HashSet<>();
		for(int i = 0;i <arr.length;i++){
			intSet.add(Integer.parseInt(arr[i]) - 1);
		}
		return intSet;
	}
	
	private static boolean[] BFS(boolean[][] matrix, int N, int node,Queue<Integer> queue, boolean[] visited){
		graph = new HashSet<>();
		while(true){
			for(int x = 0; x< N;x++){
				if(matrix[node][x] && !visited[x]){
					visited[x] = true;
					queue.add(x);
				}
			}
			
			if(queue.isEmpty()){
				break;
			}else{
				node = queue.remove();
				graph.add(node);
			}		
		}
			
		return visited;
	}
	
	private static int getSpecialCities(Set<Integer> speicalCitiesInt){
		if(graph == null || speicalCitiesInt == null){
			return 0;
		}
		
		if(graph.size() == 1){
			Integer city = graph.iterator().next();
			if(speicalCitiesInt.contains(city)){
				return 1;
			}
		}
		
		int specialCities = 0;
		for(Integer city : graph){
			if(speicalCitiesInt.contains(city))
				specialCities++;
		}
		
		return specialCities * graph.size();
	}
}
