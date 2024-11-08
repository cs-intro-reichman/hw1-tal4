// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int fullNum = Integer.parseInt(args[0]);
		int ones = fullNum % 10;
		int tens = (fullNum % 100) / 10;
		int hundreds = fullNum / 100;
		System.out.println(hundreds + " hundreds, " +  tens + " tens, and " + ones + " ones.");		
	}
}
