import java.util.Scanner;

public class Assignment6C {

	void disp(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	void bubbleSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}
		}
		disp(a);
	}

	void selectionSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min_index] > a[j]) {
					min_index = j;
				}
			}
			if (i != min_index) {
				a[i] = a[i] + a[min_index];
				a[min_index] = a[i] - a[min_index];
				a[i] = a[i] - a[min_index];
			}

		}
		disp(a);
	}

	void insertionSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int n = a[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (n < a[j])
					a[j + 1] = a[j];
				else
					break;
			}
			a[j + 1] = n;
		}
		disp(a);
	}

	public static void main(String[] args) {
		Assignment6C as = new Assignment6C();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		while (true) {
			System.out.println("1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort\n4.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1 -> as.bubbleSort(a);
			case 2 -> as.selectionSort(a);
			case 3 -> as.insertionSort(a);
			case 4 -> System.exit(0);
			}

		}
		// sc.close();
	}

}
