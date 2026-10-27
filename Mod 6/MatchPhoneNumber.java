/*
 * MatchPhoneNumber.java
 * 
 * 
 * 
 */
import java.util.regex.*;// will be referencing the documentation for Pattern and Matcher a lot for this. 
//https://www.w3schools.com/java/java_regex.asp was another useful resource.

public class MatchPhoneNumber {
	
	public static void main (String[] args) {
		if (args.length >0)
		{
			//IO.println(args[0]);
			//IO.println(isPhoneNumber(args[0]));
			//IO.println(isPhoneNumber(Integer.parseInt(args[0])));
		}
	}
	
	public static boolean isPhoneNumber(String phoneNumber)
	{
		return (mWAC(phoneNumber) || mWOAC(phoneNumber));
	}
	public static boolean isPhoneNumber (long phoneNumber)
	{
		String str = phoneNumber/10000 +"-"+phoneNumber%10000;
		if (str.length()>8)// need for format for area codes
			str = "("+phoneNumber/10000000+") "+ (phoneNumber%10000000)/10000+"-"+phoneNumber%10000;
		IO.println(str);
		return isPhoneNumber(str);
	}
	
	//private static final String RN ="(1|2|3|4|5|6|7|8|9|0)"; // rn means regex number here.
	// this is \d I can use that instead.
	
	private static boolean mWAC(String pNum)//match with areacode
	{
		if (pNum.length() != 14)
			return false;
		Pattern areaCodePattern = Pattern.compile("\\(\\d{3}\\)\\x20?\\d{3}-\\d{4}");
		// becasue Java, you need 2 backslashes to use a backslash.
		// \d is any number digit
		// \( and \) allow for parenthesis in the pattern
		// \x20 is a space character, the ? means one or zero of them
		Matcher match = areaCodePattern.matcher(pNum);
		//IO.println("WAC: "+ match.find());
		return match.find();
	}
	private static boolean mWOAC(String pNum)//match without areacode
	{
		if (pNum.length() != 8)
			return false;// for some reason the area code ones would return true here despite the area code not being in the pattern, so I'm checking size. 
		Pattern codelessPattern = Pattern.compile("\\d{3}-\\d{4}");
		Matcher match = codelessPattern.matcher(pNum);
		//IO.println("WOAC: "+ match.find());
		//IO.println("WOAC: "+ match.find());
		return match.find();
	}
	
	/*
	 * Never used RegEx before I don't think. or atleast not the one in util.
	 * I would have used scanner for this I think.
	 * If I were to write this code again Id probably do something like.
	 * private String areaCodePatt = "\\(\\d{3}\\)\\x20?";
	 * private String pNumPatt = "\\d{3}-\\d{4}"
	 * and then have the pattern be: "\\("+areaCodePatt+"\\)?"+pNumPatt
	 * Jsut to make it more readable and make it two methods and not four. 
	 */
}

