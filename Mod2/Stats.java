/*
 * Stats.java
 * 
 * 
 * 
 */
import java.lang.Math;

public class Stats {
	
	public static void main (String[] args) {
		int n;
		try{
			n= Integer.parseInt(args[0]);
			if (n <1)
				throw new Exception("");
		}catch(Exception e)
		{
			IO.println("This program requires a positive integer command line argument");
			return;
		}
		double[] nums =new double[n];
		double avg=0;
		
		for(int i =0; i< nums.length; i++)
		{
			IO.print("Insert a number: ");
			double element = StdIn.readDouble();
			avg += element;
			nums[i]=element;
		}
		avg /= n;
		double sqSums =0;
		
		for(int i =0; i< nums.length; i++)
		{
			double curr = nums[i]-avg;
			curr *= curr;
			sqSums += curr;
		}
		
		
		sqSums=Math.sqrt(sqSums);
		sqSums /=(n-1);
		
		IO.println("Mean: "+avg);
		IO.println("Standard Deviation: "+sqSums);
	}
}
// Had to look up how to import math like a dumb
//https://stackoverflow.com/questions/21972105/should-i-import-a-math-library-and-if-so-how

