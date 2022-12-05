package Assignment4;
/*
B. Write a java program to generate Fibonacci Series up-to n terms using loop.
 */
import java.util.Scanner;

public class Assignment4B {
	void fib(int n) {
		int a = -1, b = 1;
		for (int i = 0; i <= n; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter n-terms for fibonacci series:");
		new Assignment4B().fib(new Scanner(System.in).nextInt());
	}

}
