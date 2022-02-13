package practice.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BinarySearchComposite {

	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 65536);

		int N = Integer.parseInt(br.readLine().trim());
		String[] array = br.readLine().split(" ");
		int[] A = new int[N];
		
		for(int i=0;i<array.length;i++)
			A[i] = Integer.parseInt(array[i]);
			
		Arrays.sort(A);
		int q = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < q; i++) {
			int num = Integer.parseInt(br.readLine());
			bw.write((binarySearch(0,(A.length-1),A,num) + 1)+"\n");
		}

		bw.close();
		br.close();
    }
    
    
    public static int binarySearch(int startIndex, int endIndex, int[] arr, int pos){
    	if(startIndex > endIndex)
    		return -1;
    		
    	int mid = (startIndex + endIndex)/2;
    	
    	if(arr[mid] == pos)
    		return mid;
    	else if(arr[mid] > pos)
    		return binarySearch(startIndex ,  mid - 1,arr,pos);
    	else
    		return binarySearch(mid + 1, endIndex,arr,pos);
    	
    }
    
}
