package Assignment1;
/*
C. Using command line argument write a java program to print Object Oriented Programming Using Java.
 */
public class Assignment1C {
	public static void main(String[] a) {
		System.out.println("Total Number of Arguments:" + a.length);
		int i = 0;
		while (i < a.length) {
			System.out.println(i + ": " + a[i]);
			i++;
		}
	}
}