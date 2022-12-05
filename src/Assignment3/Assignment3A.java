package Assignment3;
/*
A. Write a java program to identify largest among three numbers using Conditional Operator.
 */
import java.util.Scanner;

public class Assignment3A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Maximum among this " + a + "," + b + "," + c + " numbers= " + max);
		sc.close();
	}
}
