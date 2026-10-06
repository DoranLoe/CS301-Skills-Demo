/*
 * SAT.java
 * 
 * A program meant to fullfill the following hypothetical:
 * A prominent northeastern university receives 20,000 student applications. 
 * Assume that the SAT scores of these individuals is normally distributed with mean 1200 and standard deviation 100. 
 * Suppose the university decides to admit the 5,000 students with the best SAT scores. 
 * Write a Java program named SAT.java to estimate the lowest score that will still be admitted.
 * 
 */


public class SAT {
	
	public static void main (String[] args) {
		/*Alright, this requires some reasearch on normal distribution and calculating quartiles with it.
		 * Since we are looking for the best 5000 of 20000, which is the top 25%
		 * 
		 * Looking at the wikipedia page for normal distribution https://en.wikipedia.org/wiki/Normal_distribution
		 * It would appear that the mean + some number times the stddev would be my answer, but what is that number?
		 * It deals a lot with the area under the curve which would mean doing integrals and calculous to figure that out.
		 * 
		 * Looking at the page for Standard score https://en.wikipedia.org/wiki/Standard_score
		 * and the page for the 68-95-99.7 rule https://en.wikipedia.org/wiki/68%E2%80%9395%E2%80%9399.7_rule
		 * Gives me some useful numbers but none of them are exactly the number that will give me my quartile.
		 * 
		 * There we go!
		 * Finding on stack exchange: https://stats.stackexchange.com/questions/17028/how-to-calculate-quartiles-with-only-standard-deviation-and-mean-assuming-normal
		 * and this other random website: https://www.cs.uni.edu/~campbell/stat/normfact.html
		 * We find that the number I'm looking for is 0.67
		 */
		 
		 int mean = 1200;
		 int stddev = 100;
		 int quartile3 = mean + (int)(0.67 *(stddev));
		 
		 IO.println("In a school with 20000 applications that is going to only going to accept the students with the top 5000 SAT scores,");
		 IO.println("assuming the scores are normally distributed with a mean average of "+mean+" and a standard deviation of "+stddev);
		 IO.println("then you should expect the lowest SAT score accepted to be: "+quartile3);
	}
}

