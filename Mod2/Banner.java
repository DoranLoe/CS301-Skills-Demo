/*
 * Banner.java
 * 
 * Takes in two command line arguments.
 * A string and a int.
 * The string will be shown moving across the screen left to right
 * The int will decide it's speed, default 16, optional
 * 
 */


public class Banner {
	
	public static void main (String[] args) {
		String words;
		int speed = 16;
		try
		{
			words= args[0];
			if (args.length>1)
			{
				for (int i =1;i<args.length-1;i++)
					words= words+" "+args[i];
				speed = Integer.parseInt(args[args.length-1]);
			}
		}catch(Exception e){
			IO.println("Incorrectly set up commandline arguments.");
			IO.println("Requires a String");
			return;
		}
		StdDraw.setCanvasSize(500,37);// a unit square is a square with side length 1,1 . If I were to use that, the canvas would be one pixel big. So im including a scale
		StdDraw.setXscale(0,2);
		StdDraw.setYscale(0,0.125);
		double x=0;
		double y=0.075;
		
		while(true)
		{
			StdDraw.clear();
			StdDraw.text(x,y,words);
			StdDraw.show(speed);
			x+=0.01;
			if (x>2)
				x=0;
		}
		
	}
}

