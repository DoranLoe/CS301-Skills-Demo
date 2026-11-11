/*
 * DistanceSquared.java
 * Main method only class that takes 2 integer command line arguments
 * and prints the square of their distance to the origin.
 */


public class DistanceSquared {
	
	public static void main (String[] args) {
		if (args.length <2)
		{
			IO.println("DistanceSquared requires 2 integer command line arguments");
			return;
		}
		int x;
		int y;
		try{
			x= Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			IO.println("DistanceSquared requires 2 integer command line arguments");
			IO.println("First integer failed to parse.");
			return;
		}
		try{
			y= Integer.parseInt(args[1]);
		}
		catch(Exception e)
		{
			IO.println("DistanceSquared requires 2 integer command line arguments");
			IO.println("Second integer failed to parse.");
			return;
		}
		x= x*x+y*y; // a squared plus b squared equals c squared where c is the distace from the point to the origin.
		IO.println(x);
	}
}

