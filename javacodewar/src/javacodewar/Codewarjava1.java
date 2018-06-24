/*
 * Eyoel Defare
 * June 22 2018
 * 
 * Question: Create a method to output the below results.
 * 
 * 			expandedForm(223) ---->   "200 + 20+3"
 * 			expandedForm(90399) ----> "90000 + 300+90+9"
 * 			expandedForm(10) ---->    "10"
 * 
 * */

package javacodewar;

public class Codewarjava1 {

	public static void main(String[] args) {
		// Formula: string[i]*10^string.length()--
		System.out.println(expandedForm(10));
	}

	private static String expandedForm(int num) {
		String str = Integer.toString(num);
		String display = "";

		int count = 0;
		int decount = str.length() - 1;

		while (count < str.length()) {
			int chr = Character.getNumericValue(str.charAt(count));
			if (chr * (int) Math.pow(10, decount) != 0) {
				display = display + chr * (int) Math.pow(10, decount) + " + ";
			}

			decount--;
			count++;
		}

		return display.substring(0, display.length() - 3);
	}

}
