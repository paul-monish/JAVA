package Assignment4;
/*
D. Write a java program to reverse a number and check whether it is a Palindrome.
 */
import java.util.Scanner;

public class Assignment4D {
	int getReverse(int n) {
		int org = n;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		System.out.println("Reverse of " + org + " is= " + rev);
		return rev;
	}

	void isPalindrom(int n) {
		if (n == getReverse(n))
			System.out.println(n + " is Palindrom");
		else
			System.out.println(n + " is not Palindrom");
	}

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		new Assignment4D().isPalindrom(new Scanner(System.in).nextInt());
	}

}
