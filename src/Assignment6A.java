import java.util.Scanner;

public class Assignment6A {
	void oneD(int a[]) {
		int min = a[0], max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("max= " + max + "," + "min= " + min);
	}

	void twoD(int a[][], int r, int c) {
		int min = a[0][0], max = a[0][0];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (a[i][j] > max)
					max = a[i][j];
				if (a[i][j] < min)
					min = a[i][j];
			}
		}
		System.out.println("max= " + max + "," + "min= " + min);
	}

	public static void main(String[] args) {
		Assignment6A a = new Assignment6A();
		Scanner sc = new Scanner(System.in);
		System.out.println("======1-D Array====");
		System.out.println("Enter Array Length:");
		int n = sc.nextInt();
		int[] o = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < o.length; i++)
			o[i] = sc.nextInt();
		a.oneD(o);
		System.out.println("======2-D Array====");
		System.out.println("Enter row no:");
		int r = sc.nextInt();
		System.out.println("Enter column no:");
		int c = sc.nextInt();
		int[][] t = new int[r][c];
		System.out.println("Enter elements:");
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				t[i][j] = sc.nextInt();
		new Assignment6A().twoD(t, r, c);
		sc.close();
	}

}
