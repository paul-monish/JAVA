package Assignment6;

import java.util.Scanner;

class CQueue {
	int rear = -1;
	int front = -1;
	int max;
	int que[] = new int[10];

	public CQueue(int max) {
		this.max = max;
	}

	void cEnQueue(int d) {
		if ((front == 0 && rear == max - 1) || front > rear)
			System.out.println("Assignment6.Queue Overflow!");
		else {
			if (rear == -1) {
				front = 0;
				rear = 0;
			}
			que[(rear + 1) % max] = d;
		}
	}

	void cdQueue() {
		if (front == -1)
			System.out.println("Assignment6.Queue Underflow!");
		else {
			if (rear == front) {
				rear = -1;
				front = -1;
			}
			int n = que[(front + 1) % max];
		}
	}

	void disp() {
		if (front == -1 || rear == -1)
			System.out.println("Assignment6.Queue is Empty");
		if (front > rear) {
			for (int i = front; i < max; i++)
				System.out.print(que[i] + " ");
			for (int i = 0; i <= rear; i++)
				System.out.print(que[i] + " ");
		} else {
			for (int i = front; i <= rear; i++)
				System.out.print(que[i] + " ");
		}
	}
}

public class Assignment6G {

	public static void main(String[] args) {
		System.out.println("Enter Assignment6.CQueue Length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CQueue q = new CQueue(n);
		while (true) {
			System.out.println("1.CENQUEUE.\n2.CDEQUEUE.\n3.DISPLAY.\n4.EXIT");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element:");
				q.cEnQueue(sc.nextInt());
				break;
			case 2:
				q.cdQueue();
				break;
			case 3:
				q.disp();
				break;
			case 4:
				System.out.println("Exiting!!");
				System.exit(0);
			}
		}
	}

}
