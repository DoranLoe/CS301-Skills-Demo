/*
 * RecursiveBinarySearch.java
 * 
 * Contains a method called search which binary searches an int array for an int.
 * 
 */


public class RecursiveBinarySearch {
	
	/*void main()
	{
		int tar = 50;
		int[] arr = new int[11];
		
		for (int i =0; i<arr.length;i++)
		{
			arr[i]= i+4;
		}
		
		IO.print(search(arr,tar));
		
	} for testing purposes*/
	
	/**
	 * Performs a Binarysearch on an array
	 * @param arr, an int[] to search through.
	 * @param target, an int to find or not find in the array.
	 * @return boolean, true if target is in the array, false otherwise.
	 */
	public static boolean search(int[] arr, int target)
	{
		return search(arr,target, 0, arr.length);
	}
	
	private static boolean search(int[] arr, int tar, int start, int end)
	{
		if(arr == null || arr.length ==0|| start>= arr.length)
			return false;
		
		if(end == start+1)
		{
			if (tar == arr[start])
				return true;
			return false;
		}
		int middle = (start+end)/2;
		if(arr[middle]==tar)
			return true;
		
		if(arr[middle]> tar)
			return search(arr, tar, start, middle);
		return search(arr, tar, middle, end);// the plus one did break things actually
	}
}

