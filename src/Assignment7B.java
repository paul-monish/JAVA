import java.util.Scanner;

public class Assignment7B {
	void TOH(int n, char from_p, char to_p, char aux_p) {
		if (n == 1)
			System.out.println(n + " disk is move from  " + from_p + " to " + to_p);
		else {
			TOH(n - 1, from_p, aux_p, to_p);
			System.out.println(n + " disk is move from " + from_p + " to " + to_p);
			TOH(n - 1, aux_p, to_p, from_p);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number Of Disk:");
		int n = new Scanner(System.in).nextInt();
		new Assignment7B().TOH(n, 'A', 'B', 'C');
	}

}
