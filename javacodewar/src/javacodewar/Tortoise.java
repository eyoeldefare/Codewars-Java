/*
 * Eyoel Defare
 * 9/24/18
 * 
 * 
 * Problem: 
 * 
 * Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?

More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, [] for Kotlin or "-1 -1 -1".
 * */

package javacodewar;

public class Tortoise {
	public static void main(String[] args) {

		race(720, 850, 70);
		race(80, 91, 37);
		race(80, 100, 40);
	}

	public static int[] race(int v1, int v2, int g) {
		int hour = g / (v2 - v1); // Hours
		int minute = ((g * 60) / (v2 - v1)) % 60; // get whole minute if less than hour, or get remaining minute after
													// full hour
		int second = (g * 3600 / (v2 - v1)) % 60; // get whole second if less than minute, or get remaining second after
													// full minute
		return v1 >= v2 ? null : new int[] { hour, minute, second };
	}
}
