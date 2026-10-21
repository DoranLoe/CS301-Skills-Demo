/*
 * BinarySearch.java
 * 
 * searches an array via binary search to find an element equal to it's index.
 * findI(int[])
 * 
 */
import java.util.*;

public class BinarySearch {
	
	public static void main (String[] args) {
		int[] arr = new int[args.length];
		try
		{
			int x = Integer.parseInt(args[0]);
			for(int i=0; i<args.length;i++)
			{
				arr[i]= Integer.parseInt(args[i]);
				if (arr[i]< x)
					throw new Exception();
				x = arr[i];
			}
			
		}catch(Exception e){
			IO.println("Program needs integer command line arguments in ascending order to run.");
			return;
		}
		
		IO.println(Arrays.toString(arr));
		IO.println(findI(arr));
		//IO.println(Arrays.binarySearch(arr,2)); //curious. two wasn't in this array. im borrowing that
	}
	
	/**
	 * findI
	 * finds any element of an array sorted in ascending order that is equal to it's index
	 * @param int[] a, an array of integers assumed to be in ascending order.
	 * @return int, the index of this array that contains it's element as an index if it exists. 
	 * 		Otherwise, returns -(insertion point)-1 where the insertion point is the point that an element would need to be inserted in to the array to be the same as the index and maintain ascending order
	 */
	public static int findI(int[] a)
	{
		if (a==null || a.length ==0)
			return 0;
		return findI(a,0,a.length-1,a.length/2);
	}
	
	private static int findI(int[] a, int min,int max,int curr)
	{
		if (a==null || a.length ==0)
			return 0;
		if (a[curr] == curr)
			return curr;
		if (max == min)
			return curr*-1 -1;
		
		
		if (a[curr]<curr)// entires are in ascending order, and can at slowest ascend by 1. if entry is lower than index, look right
			return findI(a, curr+1, max, (curr+1+max)/2);
		return findI(a, min, curr, (curr+min)/2); //if entry is higher than index, look left.
	}
}

