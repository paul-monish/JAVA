package Assignment5;
/*
C. A number is said to be a special number, if the sum of the factorial of the digits of a number is
same as the original number. Example-145 is a special number, because 1! + 4! + 5! =145. Print all
special numbers within range 100 to 999.
 */
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
