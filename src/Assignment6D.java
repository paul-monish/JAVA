import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Search {
	int binarySearch(int a[], int lo, int hi, int x) {
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (a[mid] == x)
				return mid;
			else if (a[mid] > x)
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		return -1;
	}

	int linearSearch(int a[], int x) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				return i;
		return -1;
	}
}

public class Assignment6D {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Search s = new Search();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length:");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		System.out.println("Enter elements in ascending order:");
		for (int i = 0; i < a.length; i++)
			a[i] = Integer.parseInt(br.readLine());
		System.out.println("Enter searching element:");
		int x = Integer.parseInt(br.readLine());
		int ch;
		do {
			System.out.println("1.Linear Search\n2.Binary Search\n3.Exit");
			ch = Integer.parseInt(br.readLine());

			int pos = switch (ch) {
			case 1 -> s.linearSearch(a, x);
			case 2 -> s.binarySearch(a, 0, a.length, x);
			default -> throw new IllegalArgumentException("Unexpected value: " + ch);
			};

			if (pos == -1)
				System.out.println("Not found");
			else
				System.out.println(x + " found at position " + (pos + 1));
		} while (ch == 3);
	}
//saha.abhisek@gmail.com
}
