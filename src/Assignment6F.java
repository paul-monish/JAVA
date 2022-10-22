import java.util.Scanner;

class Queue {
	int rear = -1;
	int front = -1;
	int max;
	int que[] = new int[10];

	public Queue(int max) {
		this.max = max;
	}

	void enQueue(int d) {
		if (rear == max - 1)
			System.out.println("Queue Overflow!");
		else {
			if (front == -1) {
				front = 0;
			}
			que[++rear] = d;
		}
	}

	void dQueue() {
		if (front == -1 || front > rear)
			System.out.println("Queue Underflow!");
		else {
			int n = que[front++];
		}
	}

	void disp() {
		if (front == -1)
			System.out.println("Queue is Empty");
		for (int i = front; i <= rear; i++)
			System.out.print(que[i] + " ");
	}
}

public class Assignment6F {
	public static void main(String[] args) {
		System.out.println("Enter Queue Length:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue q = new Queue(n);
		while (true) {
			System.out.println("1.ENQUEUE.\n2.DEQUEUE.\n3.DISPLAY.\n4.EXIT");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element:");
				q.enQueue(sc.nextInt());
				break;
			case 2:
				q.dQueue();
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
