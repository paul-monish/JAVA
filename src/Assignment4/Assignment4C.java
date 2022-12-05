package Assignment4;
/*
C. Write a java program to generate all Prime Numbers within a range, where range is user input.
 */
import java.util.Scanner;

public class Assignment4C {

	static boolean isPrime(int n) {
		if (n != 0 && n != 1) {

			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		} else
			return false;

	}

	static void rangePrime(int n) {
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter range of prime number:");
		rangePrime(new Scanner(System.in).nextInt());
	}

}
