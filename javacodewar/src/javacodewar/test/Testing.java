package javacodewar.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javacodewar.*;

public class Testing {

	@Test
	public void Thirteen() {
		assertEquals(Thirteen.thirt(8529), 79);
		assertEquals(Thirteen.thirt(85299258), 31);
		assertEquals(Thirteen.thirt(5634), 57);
		assertEquals(Thirteen.thirt(1111111111), 71);
		assertEquals(Thirteen.thirt(987654321), 30);
	}

	@Test
	public void LongestConsec() {
		assertEquals(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
		assertEquals(LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
		assertEquals(LongestConsec.longestConsec(new String[] {}, 3), "");
		assertEquals(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
		assertEquals(LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
		assertEquals(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
		assertEquals(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
		assertEquals(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
		assertEquals(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
	}


}
