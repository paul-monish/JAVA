package Assignment5;
/*
B. An automorphic number is the number which contained in last digit(s) of its square. Example 25 is an
automorphic number as its square is 625 and 25 is present as the last two digits. Print all automorphic
numbers within range 11 to 40.
 */
public class Assignment5B {
	boolean isAutomorphic(int n) {
		int sq = n * n;
		while (n > 0) {
			if (n % 10 != sq % 10)
				return false;
			n /= 10;
			sq /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 11; i <= 40; i++) {
			if (new Assignment5B().isAutomorphic(i))
				System.out.println(i + " is automorphic");
		}
	}

}
