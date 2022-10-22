import java.util.Scanner;

public class Assignment6B {
	void disp(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	void rArray(int p[], int q[]) {
		int[] r = new int[p.length + q.length];
//		int c = 0;
//		for (int i = 0; i < p.length; i++) {
//			r[i] = p[i];
//			c++;
//		}
//		for (int i = 0; i < q.length; i++) {
//			r[c] = q[i];
//			c++;
//		}
		int i = 0, j = 0, k = 0;
		while (i < p.length && j < q.length) {
			if (p[i] < q[j])
				r[k++] = p[i++];
			else
				r[k++] = q[j++];

		}
		while (i < p.length)
			r[k++] = p[i++];
		while (j < q.length)
			r[k++] = q[j++];
		disp(r);
	}

	public static void main(String[] args) {
		int p[] = new int[6];
		int q[] = new int[4];

		Assignment6B a = new Assignment6B();
		Scanner sc = new Scanner(System.in);
		System.out.println("======P Array====");
		System.out.println("Enter P elements in Ascending Order:");
		for (int i = 0; i < p.length; i++)
			p[i] = sc.nextInt();

		System.out.println("======Q Array====");
		System.out.println("Enter Q elements Ascending Order:");
		for (int i = 0; i < q.length; i++)
			q[i] = sc.nextInt();
		System.out.println("Resultant sorted Array of P & Q:");
		a.rArray(p, q);
		sc.close();
	}

}
