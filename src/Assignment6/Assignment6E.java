package Assignment6;

import java.util.Scanner;

class Stack {
	int max;
	int top;
	int stk[] = new int[4];

	public Stack(int max, int top) {
		this.max = max;
		this.top = top;
	}

	void push(int n) {
		if (top == max - 1) {
			// System.out.println("STACK Overflow!");
//			max = 2 * max;
//			System.out.println("max size is =" + max);
			doubleArray();

			stk[++top] = n;
		} else
			stk[++top] = n;
	}

	void pop() {
		int n;
		if (top == -1)
			System.out.println("STACK Underflow!");
		else
			n = stk[top--];
	}
	private void doubleArray(){
		int tmp[]=stk;
		stk=new int[2*tmp.length];
		for(int i=0;i<=top;i++)
			stk[i]=tmp[i];
	}
	void disp() {
		for (int i = top; i >= 0; i--)
			System.out.println(stk[i]);
	}
}

public class Assignment6E {

	public static void main(String[] args) {
		System.out.println("Enter STACK Length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack s = new Stack(n, -1);
		while (true) {
			System.out.println("1.PUSH.\n2.POP.\n3.DISPLAY.\n4.EXIT");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element:");
				s.push(sc.nextInt());
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.disp();
				break;
			case 4:
				System.out.println("Exiting!!");
				System.exit(0);
			}
		}
	}

}
