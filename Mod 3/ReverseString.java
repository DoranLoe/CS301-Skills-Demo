/*
 * ReverseString.java
 * 
 * My IDE wouldn't allow me to name a Java file Reverse. Gave me a warning and refused to compile so I changed to to Reverses.
 * Contains a main method which prints the first command line argument reversed or tells you it needs one to run.
 * Also contains a static method strReverse which reverses a string using recursion.
 * 
 */

public class ReverseString { //same as reverses.java but now with a new name as to fit with the updated requirement
	
	public static void main (String[] args) {
		String in;
		if (args.length >0)
			in = args[0];
		else in = "tnemugra enildnammoc a sdeen margorP";
		
		IO.print(strReverse(in));
		
	}
	
	/**
	 * Recursively reverses the order of characters in a String
	 * @param str String to reverse
	 * @return the string reversed.
	 */
	public static String strReverse(String str)
	{
		if (str.length()<=1)
			return str;
		return str.charAt(str.length()-1) + strReverse(str.substring(0,str.length()-1));
	}
}

