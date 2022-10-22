import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment3B {
	void getRoot(float a, float b, float c) {
		float d = (float) (Math.pow(b, 2) - 4 * a * c);
		if (d == 0) {
			System.out.println("roots are equal.");
			float r = -b / (2.0F * a);
			System.out.println("root are:" + r);
		} else if (d > 0) {
			System.out.println("roots are real.");
			float r1 = (float) (-(b + Math.sqrt(d)) / 2.0F * a);
			float r2 = (float) (-(b - Math.sqrt(d)) / 2.0F * a);
			System.out.println("roots are:" + r1 + "," + r2);
		} else {
			System.out.println("roots are imaginary.");
			float real = -b / (2.0F * a);
			float img = (float) (Math.sqrt(-d)) / 2.0F * a;
			DecimalFormat df = new DecimalFormat("###.###");
			System.out.println("roots are:" + real + "+i" + df.format(img) + System.lineSeparator() + real + "-i"
					+ df.format(img));

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Three roots:");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat();
		new Assignment3B().getRoot(a, b, c);
		sc.close();

	}

}
