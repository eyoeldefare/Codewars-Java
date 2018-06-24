/*
 * Eyoel Defare
 * June 24 2018
 * 
 * Question: 
In this kata, you must create a digital root function.
A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
 * 
 * 
 * 
 * digital_root(16)
=> 1 + 6
=> 7

digital_root(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6

digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4
=> 6

digital_root(493193)
=> 4 + 9 + 3 + 1 + 9 + 3
=> 29 ...
=> 2 + 9
=> 11 ...
=> 1 + 1
=> 2
 * */


/*
 * Our method for solving the problem:
 * 		1) convert n to string
		2) turn string to character and get each number
		3) turn character to int and add
		4) repeat until u get a single digit
 * */

package javacodewar;

public class DRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digital_root(493193));
	}

	public static int digital_root(int n) {
		int total = 0;
		String str = Integer.toString(n);
		for (int i = 0; i < str.length(); i++) {
			int val = Character.getNumericValue(str.charAt(i));
			total = total + val;
		}
		return Integer.toString(total).length() > 1 ? digital_root(total) : total;
	}

}
