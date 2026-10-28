/*
 * Parentheses.java
 * 
 * 
 * 
 */
import java.util.*;

public class Parentheses {
	
	public static void main (String[] args) {
		/*
		IO.println((int)'(');
		IO.println((int)'{');
		IO.println((int)'[');
		IO.println((int)')');
		IO.println((int)'}');
		IO.println((int)']');// why couldn't they all be the same distance apart?*/
		
		String str ="[(])";
		IO.println (str);
		IO.println(balenced(str));
	}
	private static Stack<Character> prevChars = new Stack<>();
	
	public static boolean balenced (String str)
	{
		for (int i=0; i<str.length();i++)
		{
			char c =str.charAt(i);
			if ("{[(".indexOf(c) != -1)
				prevChars.push(c);
			else if (")}]".indexOf(c) != -1)
			{
				if (prevChars.isEmpty())
					return false;
				char prev = prevChars.pop();
				if ( !(	(c == ')' && prev == '(')||
						(c == '}' && prev == '{')||
						(c == ']' && prev == '[') )	)
				{
					IO.println(c+" vs "+prev);
					return false;
				}
			}else
				throw new IllegalArgumentException("Given String must only contain characters of (,{,{,},], or ).\n found: "+c);
			
		}
		
		if (prevChars.empty())
			return true;
		return false;
	} 
	
	
}

