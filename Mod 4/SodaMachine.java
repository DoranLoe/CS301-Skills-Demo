/*
 * SodaMachine.java
 * 
 * 
 * 
 */


public class SodaMachine {
	
	public static void main (String[] args) {
		IO.println("SodaMachine test");
		SodaMachine tester = new SodaMachine();
		IO.println("Machine currently empty");
		IO.println(tester.getChange());
		IO.println("See? Empty. Lets add a quarter");
		tester.insertCoin();
		IO.println("and...There! Should have a quarter in it now, lets see...");
		IO.println(tester.getChange());
		IO.println("Yup! Now lets add 3 more!");
		tester.insertCoin();
		tester.insertCoin();
		tester.insertCoin();
		IO.println("... There! now it should have a dollar.");
		IO.println(tester.getChange());
		IO.println("100 cents is indeed 1$ so we're good!");
		IO.println("Lets add 2 more just for the heck of it");
		tester.insertCoin();
		tester.insertCoin();
		IO.println(tester.getChange());
		IO.println("There. now lets by a soda. It only costs 1$ so it should give me back 50 cents!");
		IO.println(tester.buy());
		IO.println("There! See? 50 cents. Now the machine should be empty.");
		IO.println(tester.getChange());
		IO.println("Yup! that's empty!");
	}
	private int change =0;//in pennies
	
	/**
	 * Simulates putting a quarter in the soda machine
	 */
	public void insertCoin()
	{
		change+=25;
	}
	
	/**
	 * Shows you how much money is currently in the vending machine
	 * @return change, the amount of money in the SodaMachine, in pennies
	 */
	public int getChange()
	{
		return change;
	}
	
	//lets assume everything you can buy here costs one dollar. Cheap.
	//The machine gives you back any extra money not used on a purchase.
	/**
	 * Siumulates buying a cheap 1$ soda from the Soda Machine, if you have the money to. Does nothing otherwise.
	 * @return changeToDispense, left over change unused in the purchase given back to the user, counted in pennies.
	 */
	public int buy()
	{
		int changeToDispense=0;
		if (change>=100)
		{
			changeToDispense = change-100;
			change = 0;
		}
		return changeToDispense;
	}
}

