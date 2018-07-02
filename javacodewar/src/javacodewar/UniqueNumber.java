/*
 * 
 * Name: Eyoel Defare
 * Date: 7/2/2018
 * 
 * Question: 
 * 


There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains more than 3 numbers.

The tests contain some very huge arrays, so think about performance.
 
 
 * 
 * */
package javacodewar;

import java.util.Arrays;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findUniq(new double[] { 1, 1, 1, 2, 1, 1 });
		/*
		 * Formula: Step 1: Sort them 
		 * Step 2: See if the first or last digit is unique 
		 */
	}

	public static double findUniq(double arr[]) {
		Arrays.sort(arr);
		double value = arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
		return value;
	}

}
