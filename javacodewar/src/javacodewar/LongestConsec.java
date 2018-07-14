package javacodewar;

import java.util.ArrayList;
import java.util.List;
public class LongestConsec {

	public static void main(String[] args) {
		System.out.println(longestConsec(new String[]  {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
	}

	public static String longestConsec(String[] strarr, int k) {
		StringBuilder sb = new StringBuilder("");
		List<String> list = new ArrayList<String>();

		// store each two first letters in a list
		for (int i = 0; i <= strarr.length - k && strarr.length > 0 && k > 0; i++) {
			for (int j = i; j < i + k; j++) {
				sb.append(strarr[j]);
			}
			list.add(sb.toString());
			sb.setLength(0);
		}

		// Get the biggest letter
		int count = 0;
		int letterLength = list.size() > 0 ? list.get(count).length() : 0;

		while (count < list.size()) {
			if (list.get(count).length() > letterLength) {
				letterLength = list.get(count).length();
				sb.setLength(0);
				sb.append(list.get(count));
			}
			count++;
		}

		return sb.toString().isEmpty() && list.size()>0? list.get(0) : sb.toString();
	}
}
