package Assignment4;
/*
E. Write a program to check a given number is a magic number or not. A number is said to be a Magic
number if the sum of its digits are calculated till a single digit is obtained by recursively adding
the sum of its digits. If the single digit comes to be 1 then the number is a magic number. Example-
199 is a magic number as 1+9+9=19 but 19 is not a single digit number so 1+9=10 and then 1+0=1 which
is a single digit number and also 1. Hence it is a magic number. Print all the magic numbers within a
given range.
 */
import java.util.Scanner;

public class Assignment4E {

	void isMagic(int n) {
		int o = n;
		int sum = 0;
		while (n != 0) {
			sum = 0;
			if (n == 0) {
				sum = n;
				n = 0;
			}

			sum += (n % 10);

			n /= 10;
		}
		if (sum == 1)
			System.out.println(o + " is magic number.");
		else
			System.out.println(o + " is not magic number");

//		if (n % 9 == 1)
//			System.out.println(o + " is magic number.");
//
//		else
//			System.out.println(o + " is not magic number.");

	}

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		new Assignment4E().isMagic(new Scanner(System.in).nextInt());
	}

}
