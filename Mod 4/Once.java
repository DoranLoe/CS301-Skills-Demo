/*
 * Once.java
 * 
 * 
 * 
 */
import java.util.*;

public class Once {
	
	public static void main (String[] args) {
		if (args.length>0)
			IO.println(get(args[0]));
	}
	
	/**
	 * Gets the first instance of a char that only appears once in a given string 
	 * @param str the given string
	 * @return char the first non-repeated character in the string, minvalue if string is empty or has no non-repeated characters.
	 * @throws IllegalArgumentException if string is null.
	 */
	public static char get(String str)
	{
		//check to make sure strign is valid
		if (str == null)
			throw new IllegalArgumentException("needs a non-null string");
		if (str.equals(""))
			return '\0';//technically not the same as an empty char but i dont care.
			
		HashMap<Character, Integer> map = new HashMap<>();
		//we count the characters by putting them into a map.
		for(int i=0; i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.replace( str.charAt(i) , map.get(str.charAt(i))+1 );
			}else{
				map.put(str.charAt(i),1);
			}
		}
		//now that we have a count of every letter in the string, we find the first with a value of 1 and return that
		for(int i=0; i<str.length();i++)
		{
			if (map.get(str.charAt(i))==1)
				return str.charAt(i);
		}
		//now technically I didn't need 2 for loops outside of eachother for this.
		//I could have had a nested for loop that went through the entire list for each character to count and then return that
		// but that's exponential and this is linear.
		 
		//The only way we get here is if there is NO characters that only appear once.
		//in which case I could technically throw an exception because the input string didn't apply to the method and the method shouldn't have been called on it.
		//but I'll be nice
		return '\0';
	}
}

