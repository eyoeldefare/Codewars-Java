package javacodewar;

public class PerfectPower {

	public static void main(String[] args) {
		for (int i : isPerfectPower(32)) {
			//System.out.println(i);
		}
	}

	public static int[] isPerfectPower(int n) {
		if (isPrime(n)) {
			return null;
		}
		for (int pow = 2; pow <= primeFactor(n); pow++) {
			if (isPrime(pow)) {
				double a = Math.pow(n, (double) 1 / pow);
				if (Math.pow(Math.round(a), pow) == (double) n) {
					return new int[] { (int) Math.round(a), pow };
				}
			}
		}

		return null;
	}

	private static boolean isPrime(int num) {
		for (int f = 2; f * f <= num; f++) {
			if (num % f == 0) {
				return false;
			}
		}
		return true;
	}

	private static int primeFactor(int n) {
		int num = n;
		int counter = 0;
		for (int f = 2; f * f <= num; f++) {
			while (num % f == 0) {
				counter = counter + 1;
				num = num / f;
			}

		}
		return counter;
	}

}
