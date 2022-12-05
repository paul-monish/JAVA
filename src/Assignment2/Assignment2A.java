package Assignment2;

import java.util.Scanner;
/*
A. Write a java program to swap two variables using and without using third variable.
 */
public class Assignment2A {
	void swap1(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swaping Using 3rd variable:  a=" + a + ", b= " + b);
	}

	void swap2(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swaping Using without 3rd variable:  a=" + a + ", b= " + b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers:");
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println("Before Swaping a=" + a + ", b= " + b);
		Assignment2A as = new Assignment2A();
		as.swap1(a, b);
		as.swap2(a, b);
		sc.close();
	}

}
