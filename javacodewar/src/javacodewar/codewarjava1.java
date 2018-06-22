
package javacodewar;

public class codewarjava1 {

	public static void main(String[] args) {
		// Formula: string[i]*10^string.length()--
		System.out.println(expandedForm(234));
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
