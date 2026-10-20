/*
 * CustomDate.java
 * 
 * Quite possibly the worst date datatype you've ever seen!
 * 
 */


public class CustomDate {
	protected byte month;
	protected byte day;
	protected long year;
	
	public CustomDate()
	{
		this(1,1,0);
	}
	public CustomDate(byte m, byte d, long y)
	{
		if (m<1|| m>12)
			throw new IllegalArgumentException(m+" is an invalid month.");
		if (!isValidDay(m,d,y))
			throw new IllegalArgumentException(m+" is an invalid day.");
		if(y<=0)
			throw new IllegalArgumentException(m+" is an invalid year.");
			
		month = m;
		day = d;
		year = y;
	}
	public CustomDate(long m, long d, long y)
	{
		if (m<1|| m>12)
			throw new IllegalArgumentException(m+" is an invalid month.");
		if (!isValidDay((int)m,d,y))
			throw new IllegalArgumentException(m+" is an invalid day.");
		if(y<=0)
			throw new IllegalArgumentException(m+" is an invalid year.");
		
		this((byte)m,(byte)d, y);
	}
	
	public long daysBetween (CustomDate date)
	{
		return daysBetween(this, date);
	}
	public static long daysBetween (CustomDate date1,CustomDate date2)
	{
		if (date1.equals(date2))
			return 0;
		if (!date1.isBefore(date2))
			return daysBetween(date2, date1);
		return daysBetween(date1.tomorrow(), date2)+1;
	}
	
	public String dayOfTheWeek()
	{
		CustomDate base = new CustomDate(10,18,2026);
		long num = daysBetween(base);
		
		if (isBefore(base))
			switch ((int)(num%7))
			{
				case 0: return "Sunday";
				case 1: return "Saturday";
				case 2: return "Friday";
				case 3: return "Thursday";
				case 4: return "Wednesday";
				case 5: return "Tuesaday";
				case 6: return "Monday";
			}
		switch((int)(num%7))
		{
			case 0: return "Sunday";
			case 1: return "Monday";
			case 2: return "Tuesday";
			case 3: return "Wednesday";
			case 4: return "Thursday";
			case 5: return "Friday";
			case 6: return "Saturday";
		}
		return "Error";
	}
	
	
	public boolean isBefore(CustomDate date)
	{
		return year<date.getYear() || //year is before or
			(
				year == date.getYear() && //year is the same but
				(
					month <date.getMonth() || //month is before or
					(
						month== date.getMonth()&& day<date.getDay() // month is the same and day is before
					)
				)
			);
	}
	
	//getter methods
	public byte getMonth()
	{
		return month;
	}
	public byte getDay()
	{
		return day;
	}
	public long getYear()
	{
		return year;
	}
	public CustomDate tomorrow()
	{
		if (isValidDay(month,day+1,year))
			return new CustomDate(month,day+1,year);
		if(month+1>12)
			return new CustomDate(1,1,year+1);
		return new CustomDate(month+1,1,year);
	}
	
	public boolean equals(CustomDate date)
	{
		return (year==date.getYear() && month==date.getMonth() && day==date.getDay());
	}
	
	private static boolean isValidDay(int m,long d, long y)
	{
		if (d>0 && d<=28)
			return true;
		if (d<0 || d>31)
			return false;
		switch(m)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: return true;// months with 31 days
			
			case 4:
			case 6:
			case 9:
			case 11: if (d<31) return true;
					return false;
			
			case 2: if(isLeapYear(y))
					{
						if (d<=29) return true;
					}
					return false;
		}
		return false;		
	}
	
	public static boolean isLeapYear(long y)
	{
		return (y%4==0 && (y%100 !=0 || y%400 == 0));
	}
	public boolean isLeapYear()
	{
		return isLeapYear(year);
	}
	
	public static void main (String[] args) {
		CustomDate today = new CustomDate(10,18,2026);
		IO.println(today.getMonth());
		IO.println(today.getDay());
		IO.println(today.getYear());
		IO.println(today.dayOfTheWeek());
		CustomDate date1 = new CustomDate(10,20,2026);
		IO.println(date1.daysBetween(today));
		IO.println(date1.dayOfTheWeek());
	}
}

