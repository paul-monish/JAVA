import java.util.Scanner;

class Matrix {
	int size;

	Matrix(int n) {
		size = n;
	}

	void rearrangeM(int[][] a) {
		int[] p = new int[(size - 2) * (size - 2)];
		int k = 0;
		// non-boundary data copy in p[] from Matrix
		for (int i = 1; i < size - 1; i++) {
			for (int j = 1; j < size - 1; j++) {
				p[k++] = a[i][j];
			}
		}
		// sort p[] in ascending order
		for (int i = 0; i < k - 1; i++) {
			int flag = 0;
			for (int j = 0; j < k - 1 - i; j++) {
				if (p[j] > p[j + 1]) {
					p[j] = p[j] ^ p[j + 1] ^ (p[j + 1] = p[j]);
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		k = 0;
		// put non-boundary sorted data in Matrix
		for (int i = 1; i < size - 1; i++) {
			for (int j = 1; j < size - 1; j++) {
				a[i][j] = p[k++];
			}
		}
	}

	int sumD(int[][] a) {
		int s = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((i == j) || ((i + j) == (size - 1))) {
					s += a[i][j];
				}
			}
		}
		return s;
	}
}

class Assignment6H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of M: ");
		int m = sc.nextInt();
		int[][] arr = new int[m][m];
		if ((m > 3) && (m < 10) && (m % 2 == 0)) {
			System.out.println("Enter value of Matrix row-wise:");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("Original Matrix[" + m + "][" + m + "]:");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			Matrix mx = new Matrix(m);
			mx.rearrangeM(arr);
			System.out.println("Rearrange Matrix:");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			mx.sumD(arr);
			System.out.println("Diagonal Matrix:");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					if ((i == j) || ((i + j) == (m - 1))) {
						System.out.print(arr[i][j] + "\t");
					} else {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
			System.out.println("Sum of diagonal = " + mx.sumD(arr));
			sc.close();
		} else {
			System.out.print("Invalid value of M!!! M must be greater than 3 & less than 10 & even number.");
			System.exit(0);
		}
	}
}
/*
9  2  1  5
8  13 8  4
15 6  3  11
7  12 23 8
 */