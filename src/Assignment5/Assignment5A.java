package Assignment5;
/*
A. Write three separate java programs to generate the following patterns:
* 							A   					1
* * 					   B C 					  1 2
* * * 					  D E F                 1 2 3
* * * *                  G H I J              1 2 3 4
* * * * *               K L M N O           1 2 3 4 5
 */
import java.util.Scanner;

public class Assignment5A {
	static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		int s = n - 1;
		int c = 65;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= s; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + (char) c + "  ");
				c++;
			}
			s--;
			System.out.println();
		}
	}

	static void pattern3(int n) {
		int s = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= s; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j + "");
			}
			System.out.println();
			s--;
		}
	}

	static void menuOfPattern(int n) {

		switch (n) {
		case 1:
			System.out.println("Enter Row number:");
			int r = new Scanner(System.in).nextInt();
			pattern1(r);
			break;
		case 2:
			System.out.println("Enter Row number:");
			int r1 = new Scanner(System.in).nextInt();
			pattern2(r1);
			break;
		case 3:
			System.out.println("Enter Row number:");
			int r2 = new Scanner(System.in).nextInt();
			pattern3(r2);
			break;
		case 4:
			System.out.println("Exit!!");
			System.exit(0);
		default:
			System.out.println("Wrong choise!!");

		}
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("\nPress 1 for pattern1" + System.lineSeparator() + "Press 2 for pattern2"
					+ System.lineSeparator() + "Press 3 for pattern3" + System.lineSeparator() + "Press 4 for exit");
			menuOfPattern(new Scanner(System.in).nextInt());
		}

	}

}
