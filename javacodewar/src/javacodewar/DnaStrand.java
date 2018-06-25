/*
 * Eyoel Defare
 * June 22 2018
 * 
 * Question: In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 * 
 * 
 * DnaStrand.makeComplement("ATTGC") // return "TAACG"
   DnaStrand.makeComplement("GTAT") // return "CATA"	
 * 	
 * */

package javacodewar;

public class DnaStrand {

	public static void main(String[] args) {
		System.out.println(makeComplement("GTAT"));
		// TODO Auto-generated method stub
		// Formula:
		// Try to use switch (could've been done with if) to find the letters and change
		// the characters in the StringBuilder. Then convert back to string for rendering.

	}

	public static String makeComplement(String dna) {
		StringBuilder s = new StringBuilder(dna);
		for (int i = 0; i < dna.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				s.setCharAt(i, 'T');
				continue;
			case 'T':
				s.setCharAt(i, 'A');
				continue;
			case 'G':
				s.setCharAt(i, 'C');
				continue;
			case 'C':
				s.setCharAt(i, 'G');
				continue;
			default:
				break;
			}

		}
		return s.toString();
	}

}
