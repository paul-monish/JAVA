import java.util.Scanner;

public class Assignment1B {

	void area(float r) {
		float a = (float) (Math.PI * Math.pow(r, 2));
		System.out.println("Area of Circle=" + a);
	}

	float perimeter(float r) {
		return (float) (2 * Math.PI * r);
	}

	public static void main(String[] args) {
		Assignment1B a = new Assignment1B();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle:");
		float r = sc.nextFloat();
		a.area(r);
		float p = a.perimeter(r);
		System.out.println("Perimeter of Circle=" + p);
		sc.close();
	}

}
