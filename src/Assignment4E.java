import java.util.Scanner;

public class Assignment4E {

	void isMagic(int n) {
		int o = n;
//		int sum = 0;
//		while (n != 0) {
//			sum = 0;
//			if (n == 0) {
//				sum = n;
//				n = 0;
//			}
//			sum += (n % 10);
//			n /= 10;
//		}
//		if (sum == 1)
//			System.out.println(o + " is magic number.");
//		else
//			System.out.println(o + " is not magic number");

		if (n % 9 == 1)
			System.out.println(o + " is magic number.");

		else
			System.out.println(o + " is not magic number.");

	}

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		new Assignment4E().isMagic(new Scanner(System.in).nextInt());
	}

}
