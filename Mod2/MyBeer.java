/*
 * MyBeer.java
 * 
 * Requires an integer commandline argument.
 * Calculates the chance of a student grabbing their own beer in the dark during a convoluted set of circumstances.
 */
import java.util.*;

public class MyBeer {
	
	public static void main (String[] args) {
		int n;//student number
		
		try
		{
			n = Integer.parseInt(args[0]);
		}catch(Exception e){
			IO.println("Incorrectly set up commandline arguments.");
			IO.println("Requires an int");
			return;
		}
		
		//lets run 1000 simulations!
		int successes=0;
		for (int s=0;s<1000;s++) // I'm assuming that a student who grabs a beer that isn't theirs will simply put it back down and not take it with them.
		{
			//boolean[] beerTaken = new boolean[n];// for the opposite assumption. defaults to filled with false
			Random rand = new Random();
			for(int student=0; student<n;student++)
			{
				if (rand.nextInt(n) == student)
				{
					successes++;
					break;
				}
				
				/* //assuming the opposite
				int selectedBeer =rand.nextInt(n);
				while(beerTaken[selectedBeer]) // cant take a beer that's not there
					selectedBeer =rand.nextInt(n);
				beerTaken[selectedBeer]= true;
				if(selectedBeer ==student)
				{
					successes++;
					break;
				}
				*/
			}
		}
		IO.println("1000 simulations suggest there is about a "+successes+"/1000 chance that at least one student of "+n+" will get their beer.");
	}
}

