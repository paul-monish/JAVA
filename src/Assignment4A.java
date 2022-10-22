import java.util.Scanner;

public class Assignment4A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and n values:");
		int x = sc.nextInt(), n = sc.nextInt();
		int y = 1;
		for (int i = 1; i <= n; i++) {

			y = y * x;
		}
		System.out.println(x + "^" + n + "=" + y);
		sc.close();
	}

}
