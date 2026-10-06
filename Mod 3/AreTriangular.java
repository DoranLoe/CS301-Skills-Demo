/*
 * AreTriangular.java
 * 
 * Contains a single static method areTriangular(double, double, double) instead of a main method.
 * I don't know why this program and none of the others needs to be a static method, but we roll with it.
 */


public class AreTriangular {
	
	/**
	 * Checks if three numbers can create a triangle if used as side lengths
	 * 
	 * @param a the value of the first side length
	 * @param b the value of the second side length
	 * @param c the value of the third side length
	 * @return true if no number is larger than the sum of the other two. false otherwise.
	 **/
	public static boolean areTriangular (double a, double b, double c)
	{
		return (a<=b+c)&&(b<=a+c)&&(c<=a+b);
	}
}

