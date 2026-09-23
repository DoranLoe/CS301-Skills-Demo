/*
 * Ordered.java
 * Main method only class that takes 3 integer command line arguments
 * Prints true if the integers are in accending or decending order.
 */


public class Ordered {
	
	public static void main (String[] args) {
		if (args.length < 3)
		{
			IO.println("Ordered requires 3 intger commandline arguments");
			return;
		}
		
		int x;
		int y;
		int z;
		//boolean b; I don't need this 
		//technically, I don't need z either
		//I could do this with one integer and a boolean
		
		try{
			x= Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			IO.println("Ordered requires 3 integer command line arguments");
			IO.println("First integer failed to parse.");
			return;
		}
		try{
			y= Integer.parseInt(args[1]);
		}
		catch(Exception e)
		{
			IO.println("Ordered requires 3 integer command line arguments");
			IO.println("Second integer failed to parse.");
			return;
		}
		try{
			z= Integer.parseInt(args[2]);
		}
		catch(Exception e)
		{
			IO.println("Ordered requires 3 integer command line arguments");
			IO.println("Third integer failed to parse.");
			return;
		}
		
		//Theoretically I could have printed this in the last try catch, but that would be harder to read.
		IO.println ((x>=y && y>=z) || (x<=y && y<=z));
		
	}
}

