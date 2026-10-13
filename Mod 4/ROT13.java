/*
 * ROT13.java
 * 
 * 
 * 
 */


public class ROT13 {
	
	public static void main (String[] args) {
		if (args.length >0)
			IO.println(encode(args[0]));
		/*else{ //temporarily used to find the char's int forms
			int a = 'a';
			int b= 'A';
			IO.println(a);
			IO.print(b);
		}*/
	}
	
	/**
	 * Encodes a String using ROT13, turning each letter into the letter 13 after it in the alphabet.
	 * @param str the String to encode
	 * @return rtn the encoded string
	 * @throws IllegalArgumentException if str is null.
	 */
	public static String encode (String str)
	{
		if (str==null)
			throw new IllegalArgumentException("Bruh I need a string, this aint nothing");
		if (str.length()==0)
			return"";
			
		String rtn ="";
		
		for(int i=0; i<str.length();i++)
		{
			rtn = rtn+ flip(str.charAt(i));
		}
		
		return rtn;
	}
	
	// this will be to actually change the character
	private static char flip(char c)
	{
		int charInt = c; 
		if (charInt >=97 && charInt <=122)//lowercase chars are 97 to 122
		{
			charInt = charInt-97+13; // bring the range down to 0-25 and add 13 to rotate them
			charInt = charInt%26; // mod 26 for the characters that go over
			charInt = charInt+97; // bring them back up to lowercase char range.
		}else if (charInt >= 65 && charInt <=90)// Uppercase Range
		{
			charInt = charInt-65+13; //same idea but for upperCase
			charInt = charInt%26; 
			charInt = charInt+65; 
		}//any other characters are not letters, we don't change them.
		return (char)charInt;
	}
	
}

