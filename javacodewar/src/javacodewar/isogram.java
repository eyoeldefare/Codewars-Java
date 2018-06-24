/*
 * Eyoel Defare
 * June 23 2018
 * 
 * Question: 
 * 			An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a 			function that determines whether a string that contains only letters is an isogram. Assume the 			empty string is an isogram. Ignore letter case.
 * 
 * 
 * 			isIsogram "Dermatoglyphics" == true
			isIsogram "moose" == false
			isIsogram "aba" == false
 * 
 * */

package javacodewar;

import java.util.Arrays;

public class isogram {
	public static void main(String[] args) {
		System.out.println(isIsogram("moOse"));
	}

	public static boolean isIsogram(String str) {
		char[] letters = str.toLowerCase().toCharArray();
		Arrays.sort(letters);
		for (int i = 0; i < str.length() - 1; i++) {
			if (letters[i] == letters[i + 1]) {
				return false;
			}
			
		}
		return true;
	}

}
