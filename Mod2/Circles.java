/*
 * Circles.java
 * 
 * Draws filled circles of random size at a random position of a 250 250 "unit square"
 * Uses StdDraw class gotten from https://introcs.cs.princeton.edu/java/stdlib/StdDraw.java
 */
import java.util.*;

public class Circles {
	
	public static void main (String[] args) {
		int circleCount;
		double shadedProb;
		double minRad;
		double maxRad;
		
		try
		{
			circleCount = Integer.parseInt(args[0]);
			shadedProb = Double.parseDouble(args[1]);
			minRad = Double.parseDouble(args[2]);
			maxRad = Double.parseDouble(args[3]);
			if (minRad>maxRad)
				throw new Exception("");
		}catch(Exception e){
			IO.println("Incorrectly set up commandline arguments.");
			IO.println("Requires an int and three doubles");
			IO.println("Second double mustr be less than third");
			return;
		}
		StdDraw.setCanvasSize(250,250);// a unit square is a square with side length 1,1 . If I were to use that, the canvas would be one pixel big. So im including a scale
		StdDraw.setXscale(0,1);
		StdDraw.setYscale(0,1);
		
		//okay lets draw the circles then.
		Random rand = new Random();
		for(int i=0; i<circleCount; i++)
		{
			//location of circle
			double x = rand.nextDouble(1);
			double y = rand.nextDouble(1);
			
			//size of circle
			double circleSize;
			if (minRad == maxRad)
				circleSize = maxRad;
			else
				circleSize = rand.nextDouble(maxRad-minRad)+minRad;
			
			//color of circle
			StdDraw.setPenColor(StdDraw.BLACK);
			if (rand.nextDouble(1)>shadedProb)
				StdDraw.setPenColor(StdDraw.WHITE);
			
			//draw circle
			StdDraw.filledCircle(x,y,circleSize);
		}
	}
}

