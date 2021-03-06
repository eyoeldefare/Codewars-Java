/*
 * Name: Eyoel Defare 
 * Date: June 29 2018
 * 
 * Question: 
 * 
 * Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
 * For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
 * 
 * 
 * your_order("is2 Thi1s T4est 3a")
 * [1] "Thi1s is2 3a T4est"
 * 
 */

package javacodewar;

public class Order {

	public static void main(String[] args) {
		System.out.println(order(""));
	}

	public static String order(String words) {

		String[] strings = words.split(" ");
		String[] addStrings = new String[strings.length];

		for (String string : strings) {
			int index = 0;
			for (int i = 0; i < string.length(); i++) {
				if (Character.isDigit(string.charAt(i))) {
					index = Character.getNumericValue(string.charAt(i)) - 1;
				}
			}

			addStrings[index] = string;
		}

		return String.join(" ", addStrings);	
	}

}
