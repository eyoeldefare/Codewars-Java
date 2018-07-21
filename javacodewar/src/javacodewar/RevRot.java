package javacodewar;

/*
 * 
 * @Name: Eyoel Defare
 * @Date: 7/20/18
 * @Question: 
 *
The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).

If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.

If

sz is <= 0 or if str is empty return ""
sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
Examples:


revrot("123456987654", 6) --> "234561876549"
revrot("123456987653", 6) --> "234561356789"
revrot("66443875", 4) --> "44668753"
revrot("66443875", 8) --> "64438756"
revrot("664438769", 8) --> "67834466"
revrot("123456779", 8) --> "23456771"
revrot("", 8) --> ""
revrot("123456779", 0) --> "" 
revrot("563000655734469485", 4) --> "0365065073456944"


 * */

import java.util.ArrayList;
import java.util.List;

public class RevRot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revRot("563000655734469485", 4));

	}

	private static String reverse(String jk) {
		return new StringBuilder(String.valueOf(jk)).reverse().toString();
	}

	private static String shift(String jk) {
		return jk.substring(1) + jk.substring(0, 1);
	}

	private static List<Integer> cubeIt(String jk) {
		String[] jks = jk.split(" ");
		List<Integer> list = new ArrayList<Integer>();
		int total = 0;
		for (String str : jks) {
			for (int i = 0; i < str.length(); i++) {
				int vv = Character.getNumericValue(str.charAt(i));
				int cube = vv * vv * vv;
				total = total + cube;
			}
			list.add(total);
		}
		return list;
	}

	public static String revRot(String strng, int sz) {
		StringBuilder part = new StringBuilder();
		String jk;
		int end;
		
		List<String> parts = new ArrayList<String>();
		for (int i = 0; i < strng.length() && sz > 0; i = i + sz) {
			end = i + sz;
			if (end > strng.length())
				end = strng.length();
			parts.add(strng.substring(i, end));

		}
		for (int h = 0; h < parts.size(); h++) {
			 jk = parts.get(h);
			if (jk.length() == sz) {
				for (int i = 0; i < cubeIt(jk).size(); i++) {
					int num = cubeIt(jk).get(i);
					if (num % 2 == 0) {
						part = part.append(reverse(jk));
					} else {
						part = part.append(shift(jk));
					}
				}

			}

		}
		return part.toString();
	
	}

}