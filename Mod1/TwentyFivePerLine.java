/*
 * TwentyFivePerLine.java
 * prints the integers 1000 to 2000, 25 integers per line.
 * 
 */


public class TwentyFivePerLine {
	
	void main () {
		IO.print(1000);
		for(int x= 1001;x<=2000;x++)
		{
			IO.print(", ");
			
			if( (x-1000) % 25 == 0)
				IO.print("\n");
			
			IO.print(x);
		}
	}
}

