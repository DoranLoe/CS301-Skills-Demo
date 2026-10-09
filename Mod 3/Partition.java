/*
 * Partition.java
 * 
 * Accepts a positive integer command line argument
 * Prints out all partitions of that number.
 */
import java.util.*;

public class Partition {
	
	public static void main (String[] args) {
		int begin;
		try
		{
			begin =Integer.parseInt(args[0]);
			if (begin <= 0)
				throw new Exception("");
		}catch(Exception e){
			IO.println("Program requires a positive integer comandline argument");
			return;
		}
		partition (begin);
	}
	
	/*public static void partition(int begin)
	{
		int[] arr = new int[begin];
		arr[0]=begin;
		while (arr[0]>1)
		{
			String prt ="";
			for (int i =0; i<arr.length; i++)
			{
				if (arr[i] !=0)
					prt= prt+" "+arr[i];
			}
			IO.println(prt);
			for (int i =arr.length-2; i>=0;i--)
			{
				if (arr[i]>1 && arr[i]>arr[i+1])
				{
					arr[i]--;
					arr[i+1]++;
					break;
				}
			}
		}
	}*/
	
	//Okay it's been a few days. Last I worked on this was monday and I just couldn't get it to work
	//got so fed up with it that I gave up.
	//new day new me! Lets get complicated.
	
	//lets do some memoization
	private static Map<Integer, ArrayList<String>> done = new HashMap<>();
	
	/**
	 * prints all unique partitions of a number
	 * @param begin an integer to print the paritions of
	 */
	public static void partition(int begin)
	{
		if (done.size()==0) //memo map needs to have 1 in it as part of getPart's base case
		{
			ArrayList<String> init = new ArrayList<>();
			init.add("1");
			done.put(1,init);
		}
		if (done.containsKey(begin))//don't think this will ever be true but I can hope
		{
			for(String str : done.get(begin))// wait, no, it'll be true when begin is 1
			{
				IO.println(str);
			}
			return;
		}
		
		ArrayList<String> rtn = getPart(begin);
		for(String str : rtn)
		{
			IO.println(str);
		}
		
	}
	
	private static ArrayList<String> getPart (int num)
	{
		if (done.containsKey(num))//base case
			return done.get(num);
		
		ArrayList<String> rtn = new ArrayList<String>();// list to add to map and to return
		
		rtn.add(""+num);
		for (int i = num-1;i>0;i--)// start at one lower than the number since we have the number in our list already, end at 1
		{
			ArrayList<String> currAdd = getPart(num-i);// recursion to get the partitions of the other part of the partition.
			for(String part : currAdd)
			{
				Scanner scan = new Scanner(part);
				//if (Integer.parseInt(""+part.charAt(0)) > i) bugs out at numbers over 9 lets use a scanner then.
				if (scan.nextInt() >i)//we need to avoid repeated partitions. we do that by ignoring the parts that include larger numbers then i
					continue;
				rtn.add(""+i+" "+part);
			} // by the end of this all strings for i are in the rtn list
			
		}// by the end of this all partitions of num are in the rtn list
		
		done.put(num,rtn);
		return rtn;
	}
}

