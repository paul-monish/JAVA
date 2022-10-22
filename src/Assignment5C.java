
public class Assignment5C {
	void isSpecial(int n) {
		int o = n;
		int s = 0;
		while (n != 0) {
			int f = 1;
			int r = n % 10;
			for (int i = 1; i <= r; i++) {
				f *= i;
			}
			s += f;
			n /= 10;

		}
		if (o == s)
			System.out.println(o + " is special number");

	}

	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			new Assignment5C().isSpecial(i);
		}
	}

}
