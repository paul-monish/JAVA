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
