/*
 *  FindKthLargest.java
 * 
 * 
 * 
 */
import java.util.*;

public class  FindKthLargest {
	
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		IO.println(Arrays.toString(arr));
		IO.println(find(arr, 8));
	}
	
	public static int find (int[] arr, int k)
	{
		if (k> arr.length || k<=0)
			throw new IllegalArgumentException("array does not have a kth element");
			
		int rtn;
		if (k < arr.length/2)
		{
			rtn = findSmallest(arr, arr.length+1-k);
		}else
			rtn = findLargest(arr, k);
		
		return rtn;
	} 
	
	
	private static int findLargest (int[] arr, int k)
	{
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (int element : arr)
		{
			queue.add(element);
			
			if (queue.size() > k)
				queue.poll();
		}
		
		return queue.poll();
	}
	
	private static int findSmallest (int[] arr, int k)
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int element : arr)
		{
			queue.add(element);
			
			if (queue.size() > k)
				queue.poll();
		}
		
		return queue.poll();
	}
}

