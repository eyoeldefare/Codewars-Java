/*
 * Name: Eyoel Defare
 * Date: 7/2/2018
 * 
 * Question: 
 * 	
 * 	Simple, given a string of words, return the length of the shortest word(s).

	String will never be empty and you do not need to account for different data types.
 * */

package javacodewar;

import java.util.Arrays;

public class ShortestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
		/*
		 * Formula: 
		 * Step 1: Loop through each words  
		 * 		2: Find the length of words
		 * 		3: Sort their length
		 * 
		 */

	}

	public static int findShort(String s) {

		String[] strings = s.split(" ");
		int[] integers = new int[strings.length];
		for (int i=0; i<strings.length; i++) {
			integers[i] = strings[i].length();;
		}
		Arrays.sort(integers);		
		return integers[0];
	}

}
