
public class Assignment7E {
	void rect(int n, char a) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

	void rect(int l, int b, char a) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment7E().rect(4, 3, '*');
	}

}
