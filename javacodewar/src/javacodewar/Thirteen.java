/*
 * Name: EYoel Defare
 * Date: July 1, 2018
 * 
 * Question: 
 * 				

When you divide the successive powers of 10 by 13 you get the following remainders of the integer divisions:

1, 10, 9, 12, 3, 4.

Then the whole pattern repeats.

Hence the following method: Multiply the right most digit of the number with the left most number in the sequence shown above, the second right most digit to the second left most digit of the number in the sequence. The cycle goes on and you sum all these products. Repeat this process until the sequence of sums is stationary.

...........................................................................

Example: What is the remainder when 1234567 is divided by 13?

7×1 + 6×10 + 5×9 + 4×12 + 3×3 + 2×4 + 1×1 = 178

We repeat the process with 178:

8x1 + 7x10 + 1x9 = 87

and again with 87:

7x1 + 8x10 = 87

...........................................................................

From now on the sequence is stationary and the remainder of 1234567 by 13 is the same as the remainder of 87 by 13: 9

Call thirt the function which processes this sequence of operations on an integer n (>=0). thirt will return the stationary number.

thirt(1234567) calculates 178, then 87, then 87 and returns 87.

thirt(321) calculates 48, 48 and returns 48

 */

package javacodewar;

public class Thirteen {

	public static void main(String[] args) {
		System.out.println(thirt(1234567));

		/*
		 * Formula: 
		 * 
		 * 1,10,9,12,3,4...repeats itself 
		 * 
		 * if n=321; 1+2*10+3*9 =27+20+1 = 48 = 8*1+4*10 = 48
		 * 
		 * 
		 * Step 1 - loop n and get each number as long |COMPLETE| 
		 * Step 2 - get each remainders and calc
		 * Step 3 - repeat until done with while
		 * 
		 */
	}

	private static long calc(long n) {
		String nums = new StringBuilder(Long.toString(n)).reverse().toString();
		long total = 0;
		for (int i = 0; i < nums.length(); i++) {
			long number = Character.getNumericValue(nums.charAt(i));
			long cal = (long) Math.pow(10, i) % 13;
			total = cal * number + total;
		}
		return total;
	}

	public static long thirt(long n) {
		long prev = calc(n);
		while (prev != calc(prev)) {
			calc(calc(prev));
			prev = calc(calc(prev));
		}
		return calc(prev);
	}

}
