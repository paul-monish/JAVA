package Assignment7;
/*
C. Write a java program to display the first n Non-Fibonacci terms using recursion. Create a separate class to define
the non-static recursive function Fibo(int n).
 */
import java.util.Scanner;

public class Assignment7C {
	int fib(int n) {
		if (n <= 1)
			return n;
		else
			return fib(n - 2) + fib(n - 1);
	}

	void nonFib(int n) {
		int p = 4;
		while (n != 0) {
			int i = fib(p);
			int j = fib(p + 1);
			for (int x = i + 1; x < j && n > 0; x++) {
				System.out.print(x + " ");
				n--;
			}
			p++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n-th Range:");
		int n = sc.nextInt();
		new Assignment7C().nonFib(n);
	}

}
