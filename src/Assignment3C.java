import java.util.Scanner;

public class Assignment3C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int a = sc.nextInt();
		boolean leapYear = (a % 100 == 0 ? (a % 4 == 0 ? (a % 400 == 0 ? true : false) : true) : false);
		if (leapYear) {
			System.out.println(a + " is leapYear");
		} else {
			System.out.println(a + " is not leapYear");
		}
		sc.close();

	}

}
